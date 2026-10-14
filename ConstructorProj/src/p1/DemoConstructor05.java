package p1;

import java.util.Scanner;

class Student{
	String name,rollNo,branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo=rollNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
}
public class DemoConstructor05 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the Name:");
		st.setName(s.nextLine());
		System.out.println("Enter the rollNo:");
		st.setRollNo(s.nextLine());
		System.out.println("Enter the branch:");
		st.setBranch(s.nextLine());
		System.out.println("===Details===");
		System.out.println("Student-Name:"+st.getName());
		System.out.println("Student-RollNo:"+st.getRollNo());
		System.out.println("Student-Branch:"+st.getBranch());
		
	}

}
