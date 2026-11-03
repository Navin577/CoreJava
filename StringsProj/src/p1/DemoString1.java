package p1;

public class DemoString1 {

	public static void main(String[] args) {
		System.out.println("String literal Process:");
		String s1="naveen";
		int l1=s1.length();
		char ch1=s1.charAt(2);
		System.out.println("Dta from String-1:"+s1);
		System.out.println("length of String-1:"+l1);
		System.out.println("char of index 2:"+ch1);
		System.out.println("String new Operator Process:");
		String s2=new String("Tulugu");
		int l2=s2.length();
		char ch2=s2.charAt(3);
		System.out.println("Data from String-2:"+s2);
		System.out.println("length of string-2:"+l2);
		System.out.println("char if index 3:"+ch2);
	}

}
