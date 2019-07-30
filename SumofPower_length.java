package sums;
import java.util.Scanner;
public class SumofPower_length {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		String s1=String.valueOf(num);
		int len=s1.length();
		for(int i=0;i<s1.length();i++){
			sum+=(int)Math.pow(Integer.parseInt(s1.substring(i,i+1)),len);
		}System.out.println(sum);
}}
