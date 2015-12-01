package assignment7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;

public class Caculator {
	JFrame jf= new JFrame("Caculator");
	public JTextField jtf= new JTextField("0",10);
	JButton bn0= new JButton("0");
	JButton bn1= new JButton("1");
	JButton bn2= new JButton("2");
	JButton bn3= new JButton("3");
	JButton bn4= new JButton("4");
	JButton bn5= new JButton("5");
	JButton bn6= new JButton("6");
	JButton bn7= new JButton("7");
	JButton bn8= new JButton("8");
	JButton bn9= new JButton("9");
	JButton bnPlus= new JButton("+");
	JButton bnSubstract= new JButton("-");
	JButton bnMultiple= new JButton("*");
	JButton bnDivide= new JButton("/");
	JButton bnClear= new JButton("AC");
	JButton bnDot= new JButton(".");
	JButton bnNeg=new JButton("+/-");
	JButton bnEqual= new JButton("=");
	JButton bnPer= new JButton("%");
	JButton bnBackspace=new JButton("<-");
	JPanel jp= new JPanel();
	
	//control the decimal point 	
	boolean dotFlag= true;
	public void setDotFlag(boolean dotFlag){
		this.dotFlag=dotFlag;
	}
	
	double firstValue=Double.NaN;
	double secondValue=Double.NaN;
	
	//+,-,*,/
	String key;
	
	//control input into the text filed new numbers
	boolean keyFlag=false;
	public void setKeyFlag(boolean key){
		this.keyFlag=key;
	}
	//prohibit the continually click the equal button
	boolean continueEqualFlag=false;
	public void setContinueEqualFlag(boolean key){
		this.continueEqualFlag=key;
	}
	
	GridBagLayout gbl= new GridBagLayout();
	GridBagConstraints gbc= new GridBagConstraints();
	
	public static void main(String [] args){
		new Caculator().init();
	}
	
	
	public void init(){
		jp.setLayout(gbl);
		gbc.fill=GridBagConstraints.BOTH;
		gbc.weightx=1;
				
		addBn(bnClear);
		addBn(bnNeg);
		addBn(bnPer);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addBn(bnBackspace);
		
		
		gbc.gridwidth=1;
		addBn(bn7);		
		addBn(bn8);
		addBn(bn9);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addBn(bnPlus);
		
		gbc.gridwidth=1;
		addBn(bn4);		
		addBn(bn5);
		addBn(bn6);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addBn(bnSubstract);
		
		gbc.gridwidth=1;
		addBn(bn1);		
		addBn(bn2);
		addBn(bn3);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addBn(bnMultiple);
		
		gbc.gridwidth=1;
		addBn(bn0);		
		addBn(bnDot);
		addBn(bnEqual);
		gbc.gridwidth=GridBagConstraints.REMAINDER;
		addBn(bnDivide);
		
		bn0.addActionListener(new MyListener(this));
		bn1.addActionListener(new MyListener(this));
		bn2.addActionListener(new MyListener(this));
		bn3.addActionListener(new MyListener(this));
		bn4.addActionListener(new MyListener(this));
		bn5.addActionListener(new MyListener(this));
		bn6.addActionListener(new MyListener(this));
		bn7.addActionListener(new MyListener(this));
		bn8.addActionListener(new MyListener(this));
		bn9.addActionListener(new MyListener(this));
		//control the decimal point
		bnDot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String cur=jtf.getText();
				if(cur.length()<15){
					if (!dotFlag){
					}
					if(keyFlag==true){
						jtf.setText("0.");
						setDotFlag(false);
						setKeyFlag(false);
					}
					if(dotFlag){
						jtf.setText(jtf.getText()+e.getActionCommand());
						setDotFlag(false);
					}
				}
			}
		});
		
		bnClear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jtf.setText("0");
				setDotFlag(true);
				setKeyFlag(false);
				key=null;
				setContinueEqualFlag(false);
				firstValue=Double.NaN;
				secondValue=Double.NaN;
			}
		});
		
		bnNeg.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			String cur=jtf.getText();
			if(cur.length()<16){
				if (cur.substring(0, 1).equals("-")){
					jtf.setText(cur.substring(1));
				}
				else{
					jtf.setText("-"+jtf.getText());
				}
			 }
			}
		});
		
		bnBackspace.addActionListener(e->{
			String cur=jtf.getText();
			if(!cur.equals("0")){
				jtf.setText(cur.substring(0,cur.length()-1));
			}
			if(cur.endsWith(".")){
				jtf.setText(cur.substring(0,cur.length()-1));
				setDotFlag(true);
			}
			if(cur.length()==1){
				jtf.setText("0");
			}
		});
		
		bnPer.addActionListener(e->{
			String cur=jtf.getText();
			double curValue=Double.parseDouble(cur);
			jtf.setText(trim(curValue*0.01+""));
			if(curValue%100>0){
				setDotFlag(false);
			}
		});
		
		bnPlus.addActionListener(new KeyListener(this));
		bnSubstract.addActionListener(new KeyListener(this));
		bnMultiple.addActionListener(new KeyListener(this));
		bnDivide.addActionListener(new KeyListener(this));
		
		bnEqual.addActionListener(e->{
			if(continueEqualFlag==false){
				String cur=jtf.getText();
				secondValue=Double.parseDouble(cur);
				setKeyFlag(true);
				setContinueEqualFlag(true);
				jtf.setText(calculate());
				firstValue=Double.NaN;
				secondValue=Double.NaN;
			}
			
		});
		
		
		jf.add("North",jtf);
		jtf.setEditable(false);
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		jf.add(jp);
		jf.setBounds(300, 200, 200, 190);
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//used for add button with GridBagLayout
	public void addBn(JButton bn){
		gbl.setConstraints(bn, gbc);
		jp.add(bn);
	}
	
	//trim the '.0' or '.00' at the end of result due to the double type
	public String trim(String st){
		if(st.endsWith(".0")){
			st=st.substring(0, st.length()-2);
		}
		if(st.endsWith(".00")){
			st=st.substring(0, st.length()-3);
		}
		return st;
	}
	//calculate the result of firstValue and secondValue, and control the decimal digit after operation 
	public String calculate(){
		double temp=firstValue;
		int decimalDigit=decimalDigit(temp,secondValue,key);
		if(key.equals("+")){
			firstValue=temp+secondValue;
			BigDecimal b= new BigDecimal(firstValue);
			firstValue=b.setScale(decimalDigit,BigDecimal.ROUND_HALF_UP).doubleValue();  
			return trim((firstValue+""));
		}
		if(key.equals("-")){
			firstValue=temp-secondValue;
			BigDecimal b= new BigDecimal(firstValue);
			firstValue=b.setScale(decimalDigit,BigDecimal.ROUND_HALF_UP).doubleValue(); 
			return trim((firstValue+""));
		}
		if(key.equals("*")){
			firstValue=temp*secondValue;
			BigDecimal b= new BigDecimal(firstValue);
			firstValue=b.setScale(decimalDigit,BigDecimal.ROUND_HALF_UP).doubleValue(); 
			return trim((firstValue+""));
		}
		if(key.equals("/")){
			firstValue=temp/secondValue;
			return trim((firstValue+""));
		}
		else return "";
	}
	
	//calculate the  decimal digit after the operation between first and second value
	public int decimalDigit(double value1,double value2,String key){
	   int index1=(value1+"").indexOf(".");
	   int index2=(value2+"").indexOf(".");
	   int decimalDigit1=(value1+"").length()-index1-1;
	   int decimalDigit2=(value2+"").length()-index2-1;
	   int resultDigit=0;
	   if(key.equals("+")||key.equals("-")){
		   resultDigit=Math.max(decimalDigit1, decimalDigit2);
	   }
	   if(key.equals("*")||key.equals("/")){
		   resultDigit=decimalDigit1+decimalDigit2;
	   }
	   return resultDigit;
	}
}

//use for button 0-9
class MyListener implements ActionListener{
	Caculator c= new Caculator();
	public MyListener(Caculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		String cur=c.jtf.getText();
	if(c.keyFlag==false){
		if(cur.length()<15){
			if(!cur.equals("0")){
				c.jtf.setText(c.jtf.getText()+e.getActionCommand());
			}
		
			else {
				c.jtf.setText(e.getActionCommand());
			}
		}
	}
	if(c.keyFlag==true){
		c.jtf.setText(e.getActionCommand());
		c.keyFlag=false;
		c.setDotFlag(true);
	}
	if(c.continueEqualFlag==true){
		c.firstValue=Double.NaN;
		c.secondValue=Double.NaN;
	}
  }
}

//used for button '+ - * /'
class KeyListener implements ActionListener{
	Caculator c= new Caculator();
	public KeyListener(Caculator c){
		this.c=c;
	}
	public void actionPerformed(ActionEvent e){
		String cur=c.jtf.getText();
		if(!Double.isNaN(c.firstValue)){
			c.secondValue=Double.parseDouble(cur);
			c.calculate();
		}
		else if(Double.isNaN(c.firstValue)){
			c.firstValue=Double.parseDouble(cur);
		}
		c.setKeyFlag(true);
		c.key=e.getActionCommand();
		c.setContinueEqualFlag(false);
	}
}