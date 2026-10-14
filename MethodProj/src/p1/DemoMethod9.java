package p1;

import java.util.Scanner;

class Percentagee{
	float cal(int totalmarks) {
		return (float)(totalmarks)/6;
	}
}
class Result{
	String generate(float per) {
		if(per>70 && per<=100) {
			return "Distinction";
		}else if(per>60 && per<=70) {
			return "First Class";
		}else if(per>50 && per <=60) {
			return "Second Class";
		}else if(per>=35 && per<=50) {
			return "Third Class";
		}else {
			return "Fail";
		}
	}
}
public class DemoMethod9 {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			Percentagee p=new Percentagee();
			Result r=new Result();
			System.out.println("Enter the Marks of Sub-1:");
			int v1=s.nextInt();
			System.out.println("Enter the Marks of Sub-2:");
			int v2=s.nextInt();
			System.out.println("Enter the Marks of Sub-3:");
			int v3=s.nextInt();
			System.out.println("Enter the Marks of Sub-4:");
			int v4=s.nextInt();
			System.out.println("Enter the Marks of Sub-5:");
			int v5=s.nextInt();
			System.out.println("Enter the Marks of Sub-6:");
			int v6=s.nextInt();
			if((v1>=0 && v1<=100) && (v2>=0 && v2<=100) && (v3>=0 && v3<=100) && (v4>=0 && v4<=100) && (v5>=0 && v5<=100) && (v6>=0 && v6<=100)) {
				
				int totMarks=v1+v2+v3+v4+v5+v6;
				float per=p.cal(totMarks);
				String result=r.generate(per);
				System.out.println("Total Marks :"+totMarks);
				System.out.println("Percentage : "+per);
				System.out.println("Result : "+result);

			}else{
				System.out.println("Invalid marks...");
			}
			
	}

}
