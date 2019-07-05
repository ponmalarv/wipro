package s1;
import java.util.Scanner;
public class SumofSqure {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	int s1=s.nextInt();
	int s2=0,rem=0;
	while(s1!=0)
	{
	rem=s1%10;
	s2+=(int)Math.pow(rem,2);
	s1/=10;
	}
	System.out.println(s2);
}
}
