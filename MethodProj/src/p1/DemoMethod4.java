package p1;

class Percentage{
	float cal(int sub1,int sub2, int sub3 , int sub4 , int sub5 , int sub6) {
		float result=(float)(sub1+sub2+sub3+sub4+sub5+sub6)/6;
		return result;
	}
}
public class DemoMethod4 {

	public static void main(String[] args) {
		Percentage obj=new Percentage();
		int V1=90,V2=93,V3=94,V4=65,V5=89,V6=99;
		float result=obj.cal(V1, V2, V3, V4, V5, V6);
		System.out.println("Percentage :"+result);

	}

}
