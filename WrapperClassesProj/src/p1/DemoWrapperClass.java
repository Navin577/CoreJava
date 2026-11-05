package p1;

public class DemoWrapperClass {

	public static void main(String[] args) {
		//Boxing Process
		Integer ob1=new Integer(11);
		Integer ob2=new Integer("23");
		Float ob3=new Float(12.3F);
		Float ob4=new Float(345.678);
		Float ob5=new Float("12.3F");
		Character ob6=new Character('C');
		Boolean ob7=new Boolean(true);
		Boolean ob8=new Boolean("true");
		
		//UnBoxing Process
		int i1=ob1.intValue();
		int i2=ob2.intValue();
		float f1=ob3.floatValue();
		Double d1=ob4.doubleValue();
		float f2=ob5.floatValue();
		char c1=ob6.charValue();
		boolean b1=ob7.booleanValue();
		boolean b2=ob8.booleanValue();
		
		System.out.println("Data values:");
		System.out.println("int-value :"+i1);
		System.out.println("int-value :"+i2);
		System.out.println("float-value:"+f1);
		System.out.println("float-value"+f2);
		System.out.println("Double-value:"+d1);
		System.out.println("char-value:"+c1);
		System.out.println("boolean-value:"+b1);
		System.out.println("boolean-value:"+b2);
	}

}
