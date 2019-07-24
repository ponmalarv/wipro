package sums;

import java.util.Scanner;

public class MinValue {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int val[]=new int[n];
	for(int i=0;i<n;i++){
		val[i]=scan.nextInt();
	}
	int min=val[0];
	for(int i=1;i<val.length;i++){
		if(val[i]<min){
			min=val[i];
		}
	}
	System.out.println(min);
}
}
