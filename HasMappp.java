package javaprojectvik;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HasMappp {
	

	public static void main(String[] args) {
		
		HashMap<Integer,String> emp=new HashMap<>();
		emp.put(1, "vik");
		emp.put(2, "devi");
		emp.put(3, "aghil");
		
		Map<Integer,String> emp1=new HashMap<>();
		
		emp1.putAll(emp);
		System.out.println(emp1);
		
		boolean containsKey = emp1.containsKey(1);
		boolean containsValue = emp1.containsValue("devi");
		String val = emp1.get(1);
		System.out.println(val);
		emp1.keySet();
		emp1.values();
		Set<Entry<Integer, String>> entrySet = emp1.entrySet();
		System.out.println(entrySet);
		
		emp1.clear();
		System.out.println(emp1);

	}

}
