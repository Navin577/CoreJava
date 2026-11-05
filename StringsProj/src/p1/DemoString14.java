package p1;

import java.util.Scanner;
import java.util.StringJoiner;

public class DemoString14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			System.out.println("Enter the delimeter:");
			String dm=sc.nextLine();
			StringJoiner sj=new StringJoiner(dm);
			System.out.println("Enter the number of strings to join:");
			int n=Integer.parseInt(sc.nextLine());
			System.out.println("Enter "+n+" string...");
			for(int i=0;i<=n;i++) {
				System.out.println("Enter the String-"+i);
				String str=sc.nextLine();
				sj.add(str);
			}
			System.out.println("Data from String Joiner:");
			System.out.println(sj.toString());
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
