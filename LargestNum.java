
import java.util.Scanner;

public class LargestNum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int i,j,k;
		i=scan.nextInt();
		j=scan.nextInt();
		k=scan.nextInt();
		if(i>j&&i>k){
			System.out.println(+i);
		}
		else if(j>i&&j>k){
			System.out.println(+j);
		}
		else{
			System.out.println(+k);
		}
	}

}
