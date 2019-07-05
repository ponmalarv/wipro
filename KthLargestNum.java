package Programs;

import java.util.Arrays;
import java.util.Scanner;
public class KthLargestNum {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int res[]=new int[n];
		int k=s.nextInt();
		int b=a.length;
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
        Arrays.sort(a);
        for(int i=0;i<n;i++){
        res[i]=a[i];
        } 
        System.out.println("num"+res[b-k]);
        s.close();
        }
}
