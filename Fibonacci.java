package p1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n1=0, n2=1,n3,count;
		System.out.println("count=");
		count=scan.nextInt();
		
		System.out.print(+n2);
		for(int i=2;i<=count;i++){
		n3=n1+n2;
		System.out.print(+n3);
		n1=n2;
		n2=n3;
			}
	}}
