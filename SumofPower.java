package sums;

import java.util.Scanner;

public class SumofPower {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		String s1=String.valueOf(num);
	for(int i=0;i<s1.length()-1;i++){
		sum+=(int)Math.pow(Integer.parseInt(s1.substring(i,i+1)), Integer.parseInt(s1.substring(i+1,i+2)));
	}
	sum+=Integer.parseInt(s1.substring(s1.length()-1));
	System.out.println(sum);
}
}
