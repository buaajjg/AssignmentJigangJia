import java.util.ArrayDeque;
import java.util.Deque;

public class MyStack {

	public static void main(String[] args) {
	MyStack ms= new MyStack();
	System.out.println(ms.empty());
	ms.push(55);
	ms.push(44);
	ms.push(33);
	System.out.println(ms.top());
	ms.pop();
	System.out.println(ms.top());
	System.out.println(ms);
	}
	
	Deque <Integer>deque= new ArrayDeque<>();
	
	public void push(int x){
		deque.addFirst(x);
	}
	 public void pop() {
	    deque.pollFirst();    
	 }
	 
	 public int top() {
	    return deque.peekFirst();    
	 }
	 
	 public boolean empty() {
	     return deque.isEmpty();   
	 }
	 
	 public String toString()
	 {	String st="";
		 while(!this.empty()){
			 st=st+this.top()+" ";
			 this.pop();
		 }
		 return st;
	 }
}
