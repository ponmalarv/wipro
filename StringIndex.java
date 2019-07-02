package Programs;

import java.util.Scanner;

public class StringIndex {
	public static void main(String args[]){
		  Scanner scan=new Scanner(System.in);
		String a=scan.next();
		a=a.substring(0,1)+a.substring(3,4);
		System.out.println(a);
		scan.close();
}
}
