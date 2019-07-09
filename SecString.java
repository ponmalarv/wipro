package s1;
import java.util.Scanner;
public class SecString {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	String s1=scan.next();
	String s2=scan.next();
	if(s1.length()>1){
		if((s1.charAt(0)=='a'&&s1.charAt(1)=='a')&&(s2.charAt(0)=='a'&&s2.charAt(1)=='a')){
	
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}}
}

