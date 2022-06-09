package javaprojectvik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Arraylistexample {
	
	private void array() {
		
	
	
	List <String> l=new ArrayList <String>();
	l.add("vikram");
	l.add("devi");
	l.add("devi");
	l.add("aghil");
	l.add("vikram");
	
	System.out.println(l);
	
	String sa = l.get(2);
	System.out.println(sa);
	
	List<String> al=new ArrayList<String>();
	al.addAll(l);
	System.out.println(al);
	
	String remove = al.remove(2);
	System.out.println(al);
	
	String sett = al.set(0, "viki");
	System.out.println(al);
	
	for (String string : al) {
		System.out.println(string);
		
	}
	for (int i = 0; i < al.size(); i++) {
		String ne = al.get(i);
		System.out.println(ne);
		
		
	}
	ListIterator<String> iterator= al.listIterator();
	while(iterator.hasNext()) {
		String next = iterator.next();
		System.out.println(next);
	}
	while(iterator.hasPrevious()) {
	String p = iterator.previous();
	System.out.println(p);
	
	}
	Iterator<String> it=al.iterator();
	boolean hn = it.hasNext();
	System.out.println(hn);
	while (it.hasNext()) {
		String no = it.next();
		System.out.println(no);
		String string = (String) it.next();
		
		
	}
	
	}
	

	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		Arraylistexample ae=new Arraylistexample();
		ae.array();
		
		

	}

}
