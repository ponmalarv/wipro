package sums;

import java.util.Scanner;

public class Numberic {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String n=scan.next();
		boolean numeric=true;
		try {
            Double num = Double.parseDouble(n);
        } catch (NumberFormatException e) {
            numeric = false;
        }
		if(numeric){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
}
}
