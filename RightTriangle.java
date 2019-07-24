package sums;

import java.util.Scanner;

public class RightTriangle {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a=1;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print(a+" ");
			}
			System.out.println();
		}
}}
