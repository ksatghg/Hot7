package sec01.exam02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "Value1");
		hashMap.put(new Key(2), "Value2");
		hashMap.put(new Key(1), "Value3");
		
		System.out.println(hashMap.size());
		
		
	}

}
