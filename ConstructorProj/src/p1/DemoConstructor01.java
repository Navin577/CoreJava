package p1;

class Test{
	int k=10;
	Test() {
		System.out.println("===Constructoe Test()===");
		System.out.println("The Value K:"+k);
	}
	void dis() {
		System.out.println("===The instance Method===");
		System.out.println("The Value K:"+k);
	}
	
}
public class DemoConstructor01 {

	public static void main(String[] args) {
		Test obj=new Test();     //Constructor call
		obj.dis();
	}

}
