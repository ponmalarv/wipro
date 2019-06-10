import java.util.Scanner;

public class Factorial {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int i,fact=1;
	    int n=scan.nextInt();
	    for(i=1;i<=n;i++){
	    	fact=fact*i;
	    }
	    System.out.println(+fact);

}
}
