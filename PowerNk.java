package s1;

import java.util.Scanner;

public class Power {
	public static void main(String args[]){
		  Scanner s=new Scanner(System.in);
	double n=s.nextInt();
	double k=s.nextInt();
	double c;
	int count=0;
	for(int i=1;i<=100;i++){
		c=Math.pow(k, i);
		if(c==n){
			count++;
			break;
		}
	}
	if(count==1){
		System.out.println("yes");
	}
	if(count==0){
		System.out.println("no");
	}

}}
