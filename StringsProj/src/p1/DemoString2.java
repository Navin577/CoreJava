package p1;

import java.util.Scanner;

public class DemoString2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try(s;){
			System.out.println("Enter the String:");
			String s1=s.nextLine();
			int len=s1.length();
			System.out.println("vowels :");
			for(int i=0;i<=len-1;i++)
			{
				char ch=s1.charAt(i);
				switch(ch)
				{
				case 'A':
				case 'a':
					System.out.print(ch+" ");
					break;
				case 'E':
				case 'e':
					System.out.print(ch+" ");
					break;
				case 'I':
				case 'i':
					System.out.println(ch+" ");
					break;
				case 'O':
				case 'o':
					System.out.print(ch+" ");
					break;
				case 'U':	
				case 'u':
					System.out.print(ch+" ");
					break;
				
				}
				
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
