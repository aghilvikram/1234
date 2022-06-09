package javaprojectvik;

public class AccessModifiers {
	//public,private,protected(access modifiers)

	public static void main(String[] args) {
		System.out.println("hi guys");
		
		
		System.out.println(method3(5.8));
		int number=10;
		String name=new String("vikram");
		name.charAt(3);
		name.length();
		
		

	}
	//static keyword,default (private)compiler will take doubt1
	 public  void methodOne() {
		 
		System.out.println("methodone");
	}
	public  int methodTwo(int num1, int num2, int num3)//local variable
	 {
		 return num1-num2+num3;
		
		
	}
	public static double method3(double num1) {
		
		return num1*num1;
		
		
	}

}
