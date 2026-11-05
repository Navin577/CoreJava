package p1;

public class DemoString10 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("Default capacity of sb:"+sb.capacity());
		System.out.println("length of sb:"+sb.length());
		sb.append("java");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity of sb:"+sb.capacity());
		System.out.println("length of sb:"+sb.length());
		sb.append("programming language");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("capacity of sb:"+sb.capacity());
		System.out.println("length of sb:"+sb.length());
	}

}
