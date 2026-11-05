package p1;

public class DemoString8 {

	public static void main(String[] args) {
		String s1="java is";
		String s2="programming";
		String s3="language";
		System.out.println("Using + symbol:");
		String s4=s1+" "+s2+" "+s3;
		System.out.println("Data in s4:"+s4.toString());
		System.out.println("Using concat() method:");
		String s5=s1.concat(" "+s2);
		String s6=s1.concat(" "+s2).concat(" "+s3);
		System.out.println("Data in s5 :"+s5.toString());
		System.out.println("Data in s6 :"+s6.toString());
	}

}
