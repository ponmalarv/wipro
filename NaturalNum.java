
import java.util.Scanner;

public class NaturalNum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=0;
		int n=scan.nextInt();
		for(int i=0;i<=n;i++){
			num=num+i;
			}
		System.out.println(+num);
			}
}
