import static org.junit.Assert.*;

import org.junit.Test;

public class MyHashMapTest {

	@Test
	public void test() {
		MyHashMap<Integer,String> map= new MyHashMap<>();
		assertTrue(map.isEmpty());
		assertEquals(map.size(),0);
		map.put(2, "Java");
		map.put(3, "Java");
		map.put(4, "JavaEE");
		map.put(5, "JavaScript");
		assertFalse(map.isEmpty());
		assertEquals(map.size(),4);
		assertTrue(map.containsKey(5));
		assertFalse(map.containsKey(1));
		assertTrue(map.containsValue("JavaEE"));
		assertFalse(map.containsValue("JavaBean"));
		assertEquals(map.get(5),"JavaScript");
		assertEquals(map.remove(3),"Java");
		
		map.clear();
		assertTrue(map.isEmpty());
		
		for(int i=0;i<100;i++){
			map.put(i, ""+i*10);
		}
		assertEquals(map.size(),100);
		
	}

}
