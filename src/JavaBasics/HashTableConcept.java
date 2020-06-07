package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B","Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		System.out.println(h.get("C"));
		
		h.put("A", 200);
		
		 Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
         h1.put(1, 200);
         
         Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
         h2.put(1, "Hello");
         
	}

}
