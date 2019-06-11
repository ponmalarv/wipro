
import java.util.Scanner;

public class NumReverse {
	public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;
	while(n>0){
		int r=n%10;
		sum=(sum*10)+r;
				n=n/10;
	}
	System.out.println("num is"+sum);
				}
}
