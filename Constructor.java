package javaprojectvik;

public class Constructor extends Const2 {
	public Constructor() {
	super(15);
		System.out.println("vikram13");
	}
	public Constructor(int age) {
		//super(31, "salem");
		System.out.println("age:"+age);
		
	}
	public Constructor(int age, String address) {
		
		System.out.println(age+address);
		
	}
	public static void main(String[] args) {
		Constructor n=new Constructor();
	}

}
