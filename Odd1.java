import java.util.Scanner;

public class Odd1 {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a+1;i<b;i++){
			if(i%2!=0){
				System.out.println(+i);
				
			}
		}
	}

}
