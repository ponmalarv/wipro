package Programs;

import java.util.Scanner;

public class StringCount {

	  public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
	System.out.println("Please enter a string");

    String a = scan.nextLine();
String b=a.replaceAll("\\s","");
System.out.println(b.length());
  
}
}
