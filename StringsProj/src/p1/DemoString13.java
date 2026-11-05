package p1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DemoString13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			System.out.println("Enter the String:");
			String str=sc.nextLine();
			System.out.println("Enter the delimeter:");
			String dm=sc.nextLine();
			StringTokenizer ob=new StringTokenizer(str,dm);
			System.out.println("--------------");
			System.out.println("Number of Tokens :"+ob.countTokens());
			System.out.println("----------");
			System.out.println("List of Tokens:");
			while(ob.hasMoreTokens()) {
				String tk=ob.nextToken();
				System.out.println("Token :"+tk.toString());
			}//end of loop
			System.out.println("----------------");
			System.out.println("Number of tokens:"+ob.countTokens());
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
