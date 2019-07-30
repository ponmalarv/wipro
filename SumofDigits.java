package sums;
import java.util.Scanner;
public class SumofDigits {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		String s1=String.valueOf(num);
	for(int i=s1.length()-1;i>=0;i--){
		for(int j=i;j>=0;j--){
			sum+=Integer.parseInt(s1.substring(j,j+1));
		}
	}System.out.println(sum);
}
}
