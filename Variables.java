package javaprojectvik;

public  class Variables {
	static int i;
    static int j;
   static int d=i+j;
	public static void data(int x, int y) {
		int m,n,o,p,l;
		m=4;
		n=6;
		o=m+n;
		System.out.println(o);
		p=x-y;
		System.out.println(p);
		i=8;
		j=9;
		l=i+j;
		System.out.println(l);
	}

	public static void main(String[] args) {
		//System.out.println(j);
		//Variables v=new Variables();
		//v.i=10;
		//v.j=13;
		//System.out.println(v.l);
		
		//v.data(12, 3);
		Variables.data(93, 3);
		Variables.i=6;
		Variables.j=14;
		Variables.d=i+j;
		System.out.println(d);
		
		

	}

}
