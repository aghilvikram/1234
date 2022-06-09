package javaprojectvik;

public class Stringbuffer {

	public static void main(String[] args) {
		/*String s1="vikram";
		String s2="devi";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		String concat = s1.concat(s2);
		System.out.println(concat);
		System.out.println(System.identityHashCode(concat));*/
		String m1="vikram";
	    String v1="vikra";
		int i1 = System.identityHashCode(m1);
		System.out.println(i1);
		int i2 = System.identityHashCode(v1);
		System.out.println(i2);
		StringBuffer n1=new StringBuffer("aghilnila");
		
		 StringBuffer rev = n1.reverse();
		System.out.println(rev);
		int i3 = System.identityHashCode(rev);
		System.out.println(i3);
		 StringBuffer append = n1.append("name");
		 System.out.println(append);
		
		int i4 = System.identityHashCode(append);
		System.out.println(i4);
		
	
		
		
		
		
		

	}

}
