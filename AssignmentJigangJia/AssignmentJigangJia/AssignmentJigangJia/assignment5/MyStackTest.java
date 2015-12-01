import static org.junit.Assert.*;

import org.junit.Test;

public class MyStackTest {
	MyStack ms= new MyStack();
	
	@Test
	public void testEmpty() {
		assertTrue(ms.empty());
		ms.push(10);
		assertFalse(ms.empty());
	}
	@Test
	public void testPush() {
	ms=new MyStack();
	ms.push(50);
	ms.push(40);
	ms.push(20);
	ms.push(30);
	System.out.println(ms);
	}
	
	@Test
	public void testTop() {
		try{
		System.out.println(ms.top());
		assertEquals(ms.top(),30);
		assertEquals(ms.top(),30);
		ms.pop();
		assertEquals(ms.top(),20);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

	
	@Test
	public void testPop() {
		ms=new MyStack();
		ms.push(100);
		ms.push(200);
		ms.push(300);
		ms.pop();
		assertFalse(ms.empty());
		ms.pop();
		ms.pop();
		assertTrue(ms.empty());
		
	}

	
	

}
