package s1;
import java.util.Scanner;
public class StringRev {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String s1="hello hi";
		String s[]=s1.split("\\s");
		for(int i=0;i<s.length;i++){
		StringBuilder  s2=new StringBuilder (s[i]);
		s2=s2.reverse();
		System.out.print(s2+" ");
		}
    }
	}
