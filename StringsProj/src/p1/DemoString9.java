package p1;

public class DemoString9 {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		
		String s3=new String("Hyd");
		String s4=new String("Hyd");
		
		System.out.println("===String literal process===");
		if(s1==s2) {
			System.out.println("Strings are equal...");
		}else {
			System.out.println("Strings are not equal...");
		}
		
		System.out.println("===String new operator process===");
		if(s3==s4) {
			System.out.println("Strings are equal...");
		}else {
			System.out.println("Strings are not equal...");
		}
	}

}
