package javaprojectvik;

public class newClass {
	public void useMe()
	{
		System.out.println("useme");
	}

	public static void main(String[] args) {
		AccessModifiers m=new AccessModifiers();
		newClass n=new newClass();
		n.useMe();
		m.methodOne();
		int c;
		System.out.println(m.methodTwo(2, 3, 4));
		
	}

}
