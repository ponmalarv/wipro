import java.util.Scanner;

public class LeaporNot {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year");
		int n=scan.nextInt();
		if(n%4==0){
			
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
		
	}

}
