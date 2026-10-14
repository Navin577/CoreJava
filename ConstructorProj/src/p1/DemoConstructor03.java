package p1;

import java.util.Scanner;

class User{
	String uname,pword,fname,iname,city,mid,phno;
	
	public User(String uname,String pword,String fname,String iname,String city,String mid,String phno) {
		this.uname=uname;
		this.pword=pword;
		this.fname=fname;
		this.iname=iname;
		this.city=city;
		this.mid=mid;
		this.phno=phno;
	}
	
	void getUser() {
		System.out.println("===User Details===");
		System.out.println("User-Name:"+uname);
		System.out.println("User-pword:"+pword);
		System.out.println("User-fname:"+fname);
		System.out.println("User-iname:"+iname);
		System.out.println("User-city:"+city);
		System.out.println("User-mid:"+mid);
		System.out.println("User-phno:"+phno);

	}
	
}

public class DemoConstructor03 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the userName:");
		String userName=s.nextLine();
		System.out.println("Enter the Password:");
		String password=s.nextLine();
		System.out.println("Enter the firstName:");
		String firstName=s.nextLine();
		System.out.println("Enter the lastName:");
		String lastName=s.nextLine();
		System.out.println("Enter the city:");
		String City=s.nextLine();
		System.out.println("Enter the mailId:");
		String mailId=s.nextLine();
		System.out.println("Enter the PhoneNumber:");
		String phonenUmber=s.nextLine();
		
		User obj=new User(userName, password, firstName, lastName, City, mailId, phonenUmber);
		obj.getUser();
		s.close();
		
	}

}
