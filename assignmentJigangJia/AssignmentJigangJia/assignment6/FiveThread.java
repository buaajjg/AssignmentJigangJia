package assignment6;


public class FiveThread {

	public static void main(String[] args) {
		
		Object objA=new Object();
		Object objB=new Object();
		Object objC=new Object();
		Object objD=new Object();
		Object objE=new Object();
		
		
		new ThreadA(objA,objB).start();
		new Thread(new ThreadB(objB,objC)).start();
		new ThreadC(objC,objD).start();
		new ThreadD(objD,objE).start();
		new ThreadE(objE,objA).start();
		
	}
	

}

class ThreadA extends Thread{
	Object objA;
	Object objB;
	
	public ThreadA(Object objA,Object objB){
		this.objA=objA;
		this.objB=objB;
		}
	@Override
	public void run(){
	try{Thread.sleep(500);
		for(int i=0;i<100;i++){			
			System.out.print("A");
			synchronized(objB){
				objB.notify();
				}
			synchronized(objA){
				objA.wait();
				}
			
		  }
		}
	catch(Exception e){}
	}
}

class ThreadB implements Runnable{
	Object objB;
	Object objC;
	public ThreadB (Object objB,Object objC){
		this.objB=objB;
		this.objC=objC;
	}
	public void run(){
		try{
			for(int i=0;i<100;i++){
			synchronized(objB){
				objB.wait();
				}
			System.out.print("B");		
			synchronized(objC){
				Thread.sleep(10);
				objC.notify();
				}
			}
		}
		catch(Exception e){}
	}
}

class ThreadC extends Thread{
	Object objC;
	Object objD;
	
	public ThreadC(Object objC,Object objD){
		this.objC=objC;
		this.objD=objD;
		}
	@Override
	public void run(){
	try{
		for(int i=0;i<100;i++){			
			synchronized(objC){
				objC.wait();
				}
			System.out.print("C");
			synchronized(objD){
				Thread.sleep(10);
				objD.notify();
				}
		  }
		}
	catch(Exception e){}
	}
}
class ThreadD extends Thread{
	Object objD;
	Object objE;
	
	public ThreadD(Object objD,Object objE){
		this.objD=objD;
		this.objE=objE;
		}
	@Override
	public void run(){
	try{
		for(int i=0;i<100;i++){			
			synchronized(objD){
				objD.wait();
				}
			System.out.print("D");
			synchronized(objE){
				Thread.sleep(10);
				objE.notify();
				}
			
			
		  }
		}
	catch(Exception e){}
	}
}
class ThreadE extends Thread{
	Object objE;
	Object objA;
	
	public ThreadE(Object objE,Object objA){
		this.objE=objE;
		this.objA=objA;
		}
	@Override
	public void run(){
	try{
		for(int i=0;i<100;i++){			
			synchronized(objE){
				objE.wait();
				}
			System.out.print("E");
			synchronized(objA){
				Thread.sleep(10);
				objA.notify();
				}
		  }
		}
	catch(Exception e){}
	}
}



