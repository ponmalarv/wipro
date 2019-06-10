import java.util.Scanner;

public class PrimeInterval {
	
	 public static void main(String[] args) {

		 Scanner s=new Scanner(System.in);
			int low=s.nextInt();
			int high=s.nextInt();
	        while (low < high) {
	            boolean flag = false;

	            for(int i = 2; i <= low/2; ++i) {
	                // condition for nonprime number
	                if(low % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag)
	                System.out.print(low + " ");

	            ++low;
	        }
	    }
	}
