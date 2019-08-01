package sums;
import java.util.Scanner;
public class SumofSquares {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int n1=scan.nextInt();int num=0;
	String s1=String.valueOf(n1);
	for(int i=0;i<s1.length();i++){
		num+=(int)Math.pow(Integer.parseInt(s1.substring(i,i+1)),2);
	}
	System.out.println(num);
	}
}
