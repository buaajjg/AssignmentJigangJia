package assignment7;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
public class FileReverseUI {
	JFrame jf= new JFrame("FileReverseUI");
	JPanel jp= new JPanel();
	JButton bn= new JButton("Click Here!");
	JLabel jl= new JLabel("content will display here line by line!");
	JTextArea jta= new JTextArea("",20,10);
	JScrollPane jsp= new JScrollPane(jta);
	
	static FileReverse fr= new FileReverse();
	ArrayList<String> arrayList= new ArrayList<>();
	public static void main(String[] args) throws Exception{
		
		fr.storeInList();
		new FileReverseUI().init();
	}
	public void init(){
		jf.setLayout(new BorderLayout());
		jf.setSize(400, 300);
		jf.setLocation(300, 100);
		jf.add("North",jl);
		jta.setLineWrap(false);
		jf.add("Center",jsp);
		jta.setEditable(false);
		jf.add("South",bn);
		jf.add("East",jp);
		jf.add("West",jp);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		arrayList=fr.getList();
		bn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(!fr.getList().isEmpty()){
					jta.append(arrayList.remove(arrayList.size()-1)+'\n');
					
				}
				else{
					JOptionPane.showMessageDialog(jf, "The ArrayList is empty!");			
					}
			}
		});
		
		
	}
}
