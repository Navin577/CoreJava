package p1;

class Salary{
	float cal(int basl, float hra , float da) {
		float totals= basl+hra+da;
		return totals;
	}
}
public class DemoMethod5 {

	public static void main(String[] args) {
		int basl=34000;
		float hra=73%basl,da=62%basl;
		Salary obj=new Salary();
		float totals=obj.cal(basl, hra, da);
		System.out.println("Employee Salary:"+totals);
		
	}

}
