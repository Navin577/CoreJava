package p1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class DemoArray1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc;){
			System.out.println("Enter the no.of Integer elements:");
			int n=sc.nextInt();
			Integer arr[]=new Integer[n];
			System.out.println("Enter "+n+" Integer Elements :");
			for(int i=0;i<n;i++) {
				arr[i]=new Integer(sc.nextInt());
			}
			
			System.out.println("==Display array using old for lopp==");
			for(int i=0;i<n;i++) {
				System.out.print(arr[i].toString()+" ");
			}
			
			System.out.println("\n==Display array using extended for loop==");
			for(Integer k:arr) {
				System.out.print(k.toString()+" ");
			}
			System.out.println("\n==Dsiplay array using splititerator ==");
			Spliterator<Integer> sp=Arrays.spliterator(arr);
			sp.forEachRemaining((k)->{
				System.out.print(k.toString()+" ");
			});
				
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
