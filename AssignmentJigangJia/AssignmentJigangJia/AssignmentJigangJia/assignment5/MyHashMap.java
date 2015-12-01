import java.awt.Color;
import java.util.Arrays;

public class MyHashMap<K,V> {

	public static void main(String[] args) throws Exception {
		MyHashMap<String,Integer> map= new MyHashMap<>();
		
	for(int i=0;i<30;i++)
	{
		map.put(i+"", i*2);
		System.out.println("Size--"+map.size());
		System.out.println("length--"+map.getLength());
	}
	System.out.println(map.size());
	System.out.println(map);

	for(int i=0;i<25;i++)
	{
		System.out.println(map.remove(i+""));
		System.out.println("Size--"+map.size());
		System.out.println("length--"+map.getLength());
	}
	System.out.println(map.size());
	System.out.println(map.getLength());
	System.out.println(map);	
	map.clear();
	System.out.println(map);
	System.out.println(map.size());
	System.out.println(map.getLength());
	}
	
	int capacity=16;
	double loadFactor=0.75;
	public MyHashMap(int capacity,float loadFactor)
	{
		this.capacity=capacity;
		this.loadFactor=loadFactor;
	}
	public MyHashMap(int capacity)
	{
		this.capacity=capacity;
	}
	public MyHashMap()
	{
	}
	
	private K[] key=(K[])new Object[capacity];
	private V[] value=(V[])new Object[capacity];
	
	private int getLength()
	{
		return this.key.length;
	}
	
	public V put(K key, V value) throws Exception
	{	this.resize();
		if(key==null){
			throw new Exception("MyHashMap does not support 'null' as a key!");
		}
		if(this.containsKey(key)){
			int index=this.getKeyIndex(key);
			V temp=this.value[index];
			this.value[index]=value;
			return temp;
		}
		else{
			int k=this.size();
			this.key[k]=key;
			this.value[k]=value;
			return null;
		}
		
	}
	
	public V get(K key){
		if(this.containsKey(key)){
			int index=this.getKeyIndex(key);
			V temp=this.value[index];
			return temp;
		}
		else{
			return null;
		}
	}
	
	public void resize()
	{	int length=this.key.length;
		if(this.size()>loadFactor*(length)&&(this.size()>12)){
			this.key=Arrays.copyOf(key, 2*length);
			this.value=Arrays.copyOf(value, 2*length);
		}
		if(this.size()<(loadFactor*length/2)&&(length>16)){
			this.key=Arrays.copyOfRange(key,0, length/2);
			this.value=Arrays.copyOfRange(value,0, length/2);
			
		}
	}
	
	public boolean containsKey(K key)
	{
		for(int i=0;i<this.key.length;i++){
			if(key==this.key[i]||key.equals(this.key[i])){
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(V value)
	{
		for(int i=0;i<this.value.length;i++){
			if(value==this.value[i]||key.equals(this.key[i])){
				return true;
			}
		}
		return false;
	}

	public int size()
	{	int count=0;
		for(int i=0;i<this.key.length;i++){
			if(this.key[i]!=null){
				count ++;
			}
		}
		return count;
	}
	
	public String toString()
	{	String st="";
		for(int i=0;i<this.size();i++){
			if(this.key[i]!=null){
				
				st=st+this.key[i]+"="+this.value[i]+",";
			}
			
		}
		return st;
	}
	private int getKeyIndex(K key)
	{
		for(int i=0;i<this.size();i++){
			if(key==this.key[i]||key.equals(this.key[i])){
				return i;
			}
		}
		return -1;
	}
	public boolean isEmpty()
	{
		if (this.size()==0){
			return true;
		}
		else{
			return false;
		}
	}
	public void clear(){
		this.key=(K[])new Object[capacity];
		this.value=(V[])new Object[capacity];
	}
	
	public V remove(K key){
		if (this.containsKey(key)){
			V temp=null;
			
			temp=this.value[this.getKeyIndex(key)];	
			this.key[this.getKeyIndex(key)]=null;
			//this.value[this.getKeyIndex(key)]=null;
			this.reSort();
			this.resize();
			
			return temp;
		}
		else{
			return null;
		}
		
	}
	private void reSort(){
		K [] keyCopy=(K[]) new Object[this.getLength()];
		V [] valueCopy=(V[]) new Object[this.getLength()];
		int count=0;
		for(int i=0;i<this.size()+1;i++){
			if(this.key[i]!=null){
				
				keyCopy[count]=this.key[i];
				valueCopy[count]=this.value[i];
				count++;
			
			}
			
		}

		this.key=keyCopy;
		this.value=valueCopy;
	}
	

	
}