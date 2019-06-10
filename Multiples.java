import java.util.Scanner;

public class Multiples {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int p=0;
		for(int i=1;i<=5;i++){
			 p=temp+p;
			System.out.println(+p);
			}
	}
	
}
