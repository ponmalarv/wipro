
import java.util.Scanner;

public class AmstrongInterval {
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int c=0;
		int a=scan.nextInt();
		int b=scan.nextInt();
	
		for(int i=a+1;i<b;i++){
			int temp=i;
			c=0;
			while(temp!=0){
			int p=temp%10;
			
			c=c+(p*p*p);
		   temp=temp/10;
		}
		if(c==i){
			System.out.println(i);
		}
		}	
}
}
