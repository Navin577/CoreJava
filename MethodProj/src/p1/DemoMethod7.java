package p1;

import java.sql.SQLTransactionRollbackException;
import java.util.Scanner;

class Marks{
	float average(int s1,int s2,int s3,int s4,int s5,int s6) {
		float avg=(float)(s1+s2+s3+s4+s5+s6)/6;
		return avg;
	}
}
public class DemoMethod7 {

	public static void main(String[] args) {
		try {
			Scanner s=new Scanner(System.in);
			Marks obj=new Marks();
			System.out.println("Enter the Marks of sub-1:");
			int v1=s.nextInt();
			System.out.println("Enter the Marks of sub-2:");
			int v2=s.nextInt();
			System.out.println("Enter the Marks of sub-3:");
			int v3=s.nextInt();
			System.out.println("Enter the Marks of sub-4:");
			int v4=s.nextInt();
			System.out.println("Enter the Marks of sub-5:");
			int v5=s.nextInt();
			System.out.println("Enter the Marks of sub-6:");
			int v6=s.nextInt();
			if((v1>=0 && v1<=100) && (v2>=0 && v2<=100) && (v3>=0 && v3<=100) && (v4>=0 && v4<=100) && (v5>=0 && v5<=100) && (v6>=0 && v6<=100)) {
				float result=obj.average(v1, v2, v3, v4, v5, v6);
				System.out.println("Percentage :"+result);
			}else {
				System.out.println("Invalid Marks.....");
			}
		}catch (Exception e) {
			System.out.println();
		}
		
	}

}
