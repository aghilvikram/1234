package javaprojectvik;

public class SingleTon {
	static SingleTon s=null;
		
	private SingleTon() {
		
	}
	public static SingleTon getInstance() {
		if (s==null) {
			s=new SingleTon();
		}
		return s;
	}
	void empId() {
		System.out.println("12345");
	}

	public static void main(String[] args) {
		SingleTon s1= getInstance();
		System.out.println(System.identityHashCode(s1));
		SingleTon s2=getInstance();
		System.out.println(System.identityHashCode(s2));
		s1.empId();
	}
	
	}


