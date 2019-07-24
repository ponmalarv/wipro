package sums;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int val[]=new int[n];
		for(int i=0;i<n;i++){
			val[i]=scan.nextInt();
		}
		Arrays.sort(val);
		for(int i=0;i<n;i++){
			System.out.print(val[i]+" ");
		}
		
}
}
