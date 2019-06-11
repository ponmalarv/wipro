
import java.util.Scanner;

public class CountPrimeNum {
	public static void main(String Args[]){
		Scanner s=new Scanner(System.in);
		int count=0;
		int n=0;
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++){
			count=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count=1;
				}
			}
			if(count==0){
				n++;
			}
			}
		System.out.println(n);
	}

}
