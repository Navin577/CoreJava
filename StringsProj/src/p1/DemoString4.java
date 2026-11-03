package p1;

public class DemoString4 {

	public static void main(String[] args) {
		try {
			System.out.println("Upper case letters:");
			for(int i=65;i<=90;i++)
			{
				char ch=(char)i;  //ASCII code into char
				System.out.println(ch+" ");
			}
			System.out.println("Lower case letters:");
			for(int i=97;i<=122;i++)
			{
				char ch=(char)i; //ASCII code into char
				System.out.println(ch+" ");
			}
			System.out.println("Numbers :");
			
			for(int i=48;i<=57;i++)
			{
				char ch=(char)i;
				System.out.println(ch+" ");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
