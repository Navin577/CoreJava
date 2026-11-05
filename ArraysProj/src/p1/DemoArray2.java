package p1;

import java.util.Scanner;

public class DemoArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			System.out.println("Enter the no.of elements :");
			int n=sc.nextInt();
			Integer arr[]=new Integer[n];
			System.out.println("Enter "+n+" Integer elements :");
			for(int i=0;i<n;i++) {
				arr[i]=new Integer(sc.nextInt());
			}
			System.out.println("Display elements without multiplies of 3 :");
			for(Integer k:arr) {
				if(k%3==0) {
					continue;
				}
				System.out.print(k.toString()+" ");
			}
		}catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
