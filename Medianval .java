package sums;

import java.util.Scanner;

public class Medianval {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]=new int[1];
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		if(n%2!=0){
		b[0]=a[n/2];
		}System.out.println(b[0]);
}
}
