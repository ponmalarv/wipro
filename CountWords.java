package sums;

import java.util.Scanner;

public class CountWords {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
	String s1=scan.nextLine();
	String s2[]=s1.split(" ");
	int count=0;
	for(int i=0;i<s2.length;i++){
		count++;
	}System.out.println(count);
}}
