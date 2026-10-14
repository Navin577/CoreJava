package p1;

class Average{
	float avg(int x, int y) {
		float z=(float)(x+y)/2;
		return z;
	}
}
public class DemoMethod3 {

	public static void main(String[] args) {
		int v1=10;
        int v2=20;
        Average obj=new Average();
        float z=obj.avg(v1, v2);
        System.out.println("Average :"+z);
	}

}
