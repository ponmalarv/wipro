package Programs;

import java.util.Scanner;

public class Balanced {
	  public static void main(String args[]){
  Scanner scan=new Scanner(System.in);
String a=scan.next();
int count1=0;
int count2=0;
for(int i=0;i<a.length();i++){
	if(a.charAt(i)=='('){
		count1++;
	}
	if(a.charAt(i)==')'){
		count2++;
	}
}if(count1==count2){
	System.out.println("yes");
}else{
	System.out.println("no");
}
  }}

