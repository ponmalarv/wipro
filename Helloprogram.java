import java.util.Scanner;

public class HelloProgram {
public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a num");
	int N=scan.nextInt();
	for(int i=1;i<=N;i++){
		System.out.println("Hello");
	}
	
}
}
