package p1;

import java.util.Scanner;

public class DemoString3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
		 System.out.println("Enter the String :");
		 String s=sc.nextLine();
		 int len=s.length();
		 System.out.println("Reverse of String:");
		 for(int i=len-1;i>=0;i--)
		 {
			 char ch=s.charAt(i);
			 System.out.print(ch+"");
		 }
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
