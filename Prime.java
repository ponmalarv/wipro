import java.util.Scanner;

public class Prime {
	 public static void main(String args[]){
		 int p;
	Scanner s = new Scanner(System.in); 
	p=s.nextInt();
	int ok=0;
	for(int i=2; i<=p-1;i++){
		if(p%i==0){
		ok=1;
	break;
	}
	}
		if(ok==1)
		{
			System.out.println("no");
		}
	else {
		
		System.out.println("yes");
	}

	}
}               
	 
	
	
