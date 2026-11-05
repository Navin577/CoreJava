package p1;

import java.util.Scanner;

public class DemoString7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter the String :");
			String str=sc.nextLine();
			int len=str.length();
			int j=len-1;
			int count =0;
			for(int i=0;i<=len-1;i++)
			{
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				j--;
				
			}
			if(count==len) {
				System.out.println(str+" is a palindrome...");
			}else {
				System.out.println(str+" is not a palindrome...");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
