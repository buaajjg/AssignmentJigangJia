package assignment6;

public class TwoThread {

	public static void main(String[] args) {
		Object objA= new Object();
		Object objB= new Object();
		new NumberThread(objA,objB).start();
		new LetterThread(objB,objA).start();
	}

}
class NumberThread extends Thread{
	Object objA;
	Object objB;
	public NumberThread(Object objA,Object objB){
		this.objA=objA;
		this.objB=objB;
	}
	@Override
	public void run(){
	    try{	
	    	Thread.sleep(100);
			for(int i=1;i<53;i++){
			System.out.print(i);
			if(i%2==0){
				synchronized(objB){
					Thread.sleep(10);
					objB.notify();
					}
				synchronized(objA){
					objA.wait();
				}
			}
			}
		  }
		catch(Exception e){}
	}
}
class LetterThread extends Thread{
	Object objA;
	Object objB;
	public LetterThread(Object objB,Object objA){
		this.objA=objA;
		this.objB=objB;
	}
	@Override
	public void run(){
	try{
		for(int i=65;i<91;i++){
			synchronized(objB){	
				objB.wait();
			}
			System.out.print((char)i);	
			synchronized(objA){	
			objA.notify();
			}
		}
	   }
	catch(Exception e){}
	}		
}

