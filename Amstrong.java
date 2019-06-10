import java.util.Scanner;

public class Amstrong {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n,p=0;
	int temp;
	 
	 System.out.println("enter a number");
	n=scan.nextInt();
	temp=n;
	while(n>0){
		int a=n%10;
		n=n/10;
		p=p+(a*a*a);
	}
	
	if(p==temp){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}


}}
