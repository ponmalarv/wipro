import java.util.Scanner;

public class Power {

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int b=scan.nextInt();
		int temp=b;
		int exp=scan.nextInt();
		for(int i=1;i<exp;i++){
			 temp=b*temp;
		}
		System.out.println(+temp);
	}
}
