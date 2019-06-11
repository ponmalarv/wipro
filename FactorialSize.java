import java.util.Scanner;

public class Factorial {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i,fact=1;
	    int n=s.nextInt();
	    while(n<=20){
	    for(i=1;i<=n;i++){
	    	fact=fact*i;
	    }
	    System.out.println(+fact);
break;
}}
}
