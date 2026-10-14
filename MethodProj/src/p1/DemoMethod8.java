package p1;

import java.util.Scanner;

class Additionn{
	int add (int x,int y) {
		return x+y;
	}
}
class Averagee{
	float avg(int x, int y) {
		return (float)(x+y)/2;
	}
}
public class DemoMethod8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the x-value :");
		int x=s.nextInt();
		System.out.println("Enter the y-value :");
		int y=s.nextInt();
		System.out.println("=====choice=====");
		System.out.println("\t1.Addition"+"\n\t2.Average");
		System.out.println("Enter your choice :");
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			Additionn obj1=new Additionn();
			int sum=obj1.add(x, y);
			System.out.println("Addition :"+sum);
			break;
		case 2:	
			Averagee obj2=new Averagee();
			float avgg=obj2.avg(x, y);
			System.out.println("Average :"+avgg);
			break;
		default :	
			System.out.println("Invlaid choice....");
		}
	}

}
