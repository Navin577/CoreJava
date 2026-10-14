package p1;

class Addition{
	int x;
	int y;
	void add() {
		System.out.println("====Method Addition()====");
		System.out.println("x value:"+x);
		System.out.println("y value:"+y);
		System.out.println("Addition :"+(x+y));
	}
	
}

class Substraction{
	static int a;
	static int b;
	static void sub() {
		System.out.println("====Method Substraction()====");
		System.out.println("a value:"+a);
		System.out.println("b value:"+b);
		System.out.println("Sibstraction :"+(a-b));
	}
}
public class DemoMethod2 {

	public static void main(String[] args) {
		System.out.println("====Main Method====");
		Addition obj=new Addition();
		obj.x=10;
		obj.y=20;
		Substraction.a=20;
		Substraction.b=10;
		obj.add();
		Substraction.sub();
		
	}

}
