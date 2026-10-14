package p1;

import java.util.Scanner;

class Customer{
	String custId,custName;
	long phoneNo;
	void getCustomer() {
		System.out.println("===Customer Details===");
		System.out.println("Customer-Id:"+custId);
		System.out.println("Customer-Name:"+custName);
		System.out.println("Customer-phoneNumber:"+phoneNo);
	}
}
public class DemoConstructor04 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		Customer c=new Customer();
		System.out.println("Enter the Customer-Id:");
		c.custId=s.nextLine();
		System.out.println("Enter the Customer-Name:");
		c.custName=s.nextLine();
		System.out.println("Enter the Customer-phoneNumber:");
		c.phoneNo=s.nextLong();
		c.getCustomer();
		
	}

}
