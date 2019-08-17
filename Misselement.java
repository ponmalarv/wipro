package sums;
import java.util.Scanner;
public class Misselement {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();int num;
	int sum=0;
	for(int i=1;i<n;i++){
		num=sc.nextInt();
		sum+=num;
	}
	int total=n*(n+1)/2;
	int mis=total-sum;
	System.out.println(mis);
}
}
