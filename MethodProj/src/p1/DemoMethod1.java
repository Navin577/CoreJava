package p1;

class Access{
	static int a;
	int b;
	static void m1() {
		System.out.println("====Static method===");
		System.out.println("A value :"+a);
	}
	void m2() {
		System.out.println("====Non-static method====");
		System.out.println("B value :"+b);
	}
}
public class DemoMethod1 {

	public static void main(String[] args) {
		System.out.println("====Main Method()====");
		Access.a=10;
		System.out.println("A value :"+Access.a);
		Access obj=new Access();
		obj.b=20;
		System.out.println("B value :"+obj.b);
		Access.m1();
		obj.m2();
	}

}
