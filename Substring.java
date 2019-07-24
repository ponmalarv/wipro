package sums;

import java.util.Scanner;

public class Substring {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String p=scan.next();
		int p1=p.length();
	int	count=0;
		for(int i=0;i<=s.length()-p1;i++){
			if(s.substring(i,i+p1).equals(p)){
			count++;
			}
		}if(count!=0){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
}
}
