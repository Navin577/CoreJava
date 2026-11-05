package p1;

public class DemoWrapperClass2 {

	public static void main(String[] args) {
		//Auto Boxing process
		Integer ob1=11;
		Float ob2=11.2F;
		Character ob3='C';
		Boolean ob4=true;
		
		//Auto Unboxing process
		int i1=ob1;
		float f1=ob2;
		char c1=ob3;
		boolean b1=ob4;
		
		System.out.println("---Data values---");
		System.out.println("int-value:"+i1);
		System.out.println("float-value:"+f1);
		System.out.println("char-value:"+c1);
		System.out.println("boolean-value:"+b1);
		
		
	}

}
