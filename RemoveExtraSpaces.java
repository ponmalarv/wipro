package sums;

import java.util.Scanner;
public class RemoveExtraSpaces {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		String str="";
		str=s1.replaceAll("\\s+"," ").trim();
		System.out.println(str);		
}
}
