package p1;

public class Demostring11 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println("Data in sb:"+sb.toString());
		sb.append("Java");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("===insert method===");
		sb.insert(4, "language");
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("===deletion method===");
		sb.delete(4, 11);
		System.out.println("Data in sb:"+sb.toString());
		System.out.println("===reverse method===");
		sb.reverse();
		System.out.println("Data in sb:"+sb.toString());
	}

}
