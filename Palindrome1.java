import java.util.Scanner;

public class Palindrome1 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int r,temp,sum=0;
		int n=sc.nextInt();
		temp=n;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum){
			System.out.println("yes");
		}
		else{
			System.out.println(" no");
		}
		
	}

}
