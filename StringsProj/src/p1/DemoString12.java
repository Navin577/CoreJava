package p1;

public class DemoString12 {

	public static void main(String[] args) {
		System.out.println("===stringBuffer(int)===");
		StringBuffer ob1=new StringBuffer(8);
		System.out.println("Default capacity of ob1:"+ob1.capacity());
		System.out.println("Length of ob1:"+ob1.length());
		ob1.append("Java");
		System.out.println("Data in ob1:"+ob1.toString());
		System.out.println("capacity of ob1:"+ob1.capacity());
		System.out.println("length of ob1:"+ob1.length());
		
		System.out.println("===StringBuffer(String)===");
		StringBuffer ob2=new StringBuffer("NIT-HYD");
		System.out.println("Default Data in ob2:"+ob2.toString());
		System.out.println("Default capacityof ob2:"+ob2.capacity());
		System.out.println("Default length of ob2:"+ob2.length());
		ob2.append("Programming language");
		System.out.println("Data in ob2:"+ob2.toString());
		System.out.println("capacityof ob2:"+ob2.capacity());
		System.out.println("length of ob2:"+ob2.length());
		
		System.out.println("===StringBuffer(Charsequence)===");
		StringBuffer sb1=new StringBuffer("Java");
		sb1.append("Programming language");
		StringBuffer sb2=new StringBuffer(sb1);
		System.out.println("Data in sb2:"+sb2.toString());
		System.out.println("capacity of sb2:"+sb2.capacity());
		System.out.println("length of sb2:"+sb2.length());
		
	}

}
