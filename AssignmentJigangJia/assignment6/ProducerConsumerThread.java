package assignment6;

public class ProducerConsumerThread {

	public static void main(String[] args) {
		Store store= new Store();
		new Producer(store).start();
		new Consumer(store).start();

	}

}
class Producer extends Thread{
	Store store;
	public Producer(Store store){
		this.store=store;
	}
	@Override
	public void run(){
		while(true){
		try{
			Thread.sleep(100);
			this.produce();
		}
		catch(Exception e){}
		}
	}
	public synchronized void produce(){
		try{
			synchronized(store){
			if(store.getQty()>=store.STORE_SPACE){
				store.wait();
			}
			else{
				store.addQty();
				System.out.println("Producing one product, balence is"+store.getQty());
				store.notifyAll();
			}
			}
		}
		catch(Exception e){}
	}
	
}
class Consumer extends Thread{
	Store store;
	public Consumer(Store store){
		this.store=store;
	}
	
	@Override
	public void run(){
		while(true){
		try{
			Thread.sleep(150);
		}
		catch(Exception e){}
		this.consume();
		}
	}
	public synchronized void consume(){
		try{
			synchronized(store){
			if(store.getQty()<=0){
				store.wait();
			}
			else {
				store.removeQty();
				System.out.println("Consuming one product, balence is"+store.getQty());
				store.notifyAll();
			}
			}
		}
		catch(Exception e){}	
		
	}
	
	
	
}
class Store{
	private int productQty=0;
	final int STORE_SPACE=3;
	public int getQty(){
		return productQty;
	}
	public void setQty(int nums){
		productQty=nums;
	}
	public void addQty(){
		productQty+=1;
	}
	public void removeQty(){
		productQty-=1;
	}
}