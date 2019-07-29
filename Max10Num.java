package sums;

import java.util.Scanner;

public class Max10Num {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=10;int a[]=new int[n];
		int maxval;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			}
		maxval=a[0];
		for(int i=1;i<a.length;i++){
		if(maxval<a[i]){
			maxval=a[i];
		}}
		System.out.println(maxval);
	}
}
