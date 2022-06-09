package javaprojectvik;

public class MethodOverloading {
	
	public static void add(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	public  void add(int num1) {
		System.out.println(num1+num1);
		
	}
	public static void add(int num1,int num2,int  num3) {
		System.out.println(num1+num2+num3);
		
	}
	public static void main(String[] args) {
		add(4,8);

	}

}
