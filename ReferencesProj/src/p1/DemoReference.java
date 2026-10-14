package p1;

import java.util.Scanner;

public class DemoReference {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student stu=new Student();
		System.out.println("Enter the Student-rollNo:");
		stu.rollNo=s.nextLine();
		System.out.println("Enter the Student-name:");
		stu.name=s.nextLine();
		System.out.println("Enter the Student-brnach");
		stu.branch=s.nextLine();
		System.out.println("Enter the Student-hNo");
		stu.ad.hNo=s.nextLine();
		System.out.println("Enter the Student-sName");
		stu.ad.sname=s.nextLine();
		System.out.println("Enter the Student-city");
		stu.ad.city=s.nextLine();
		System.out.println("Enter the Student-state");
		stu.ad.state=s.nextLine();
		System.out.println("Enter the Student-pincode");
		stu.ad.pinCode=s.nextInt();
		
		stu.getStudent();
        stu.ad.getAdress();
		
	}

}
