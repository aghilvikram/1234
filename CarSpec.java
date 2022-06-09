package javaprojectvik;

public class CarSpec {
	int speed;
	String color;
	public static void benz() {
		System.out.println("benz");
	}
	
	/*CarSpec(int i){
		speed=i;
		System.out.println("constructor");}
		CarSpec(String n){
			color=n;*/
	
	//}
	
	CarSpec(){
		
		speed=345;
		color="red";
	}
	/*CarSpec(int s, String c)
	{
	speed=s;
	color=c;
	}	*/
	void run() {
		System.out.println("welcome to colour");
	}

	public static void main(String[] args) {
		CarSpec audi=new CarSpec();
		
		CarSpec bmw=new CarSpec();
		//bmw.speed=200;
		//bmw.color="white";
		System.out.println(bmw.color);
		audi.run();
		CarSpec.benz();
		
	}

}
