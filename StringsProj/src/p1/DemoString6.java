package p1;

import java.util.Scanner;

public class DemoString6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;)
		{
			System.out.println("Enter the String :");
			String str=sc.nextLine();
			int len=str.length();
			System.out.println("Consonents :");
			for(int i=0;i<=len-1;i++) {
				char ch=str.charAt(i);
				int ac=(int)ch;  //char to ASCII
				if((ac>=65 && ac<=90) || (ac>=97 && ac<=122)) {
					switch(ch) 
					{
					case'a':
					case 'A':
						break;
					case 'e':
					case 'E':
						break;
					case 'i':
					case 'I':
						break;
					case 'o':
					case 'O':
						break;
					case 'u':
					case 'U':
						break;
					default:
						System.out.println(ch+" ");
					}
				}
				
			}
		}catch(Exception e )
		{
			System.out.println(e.toString());
		}
	}

}
