package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class ArraylargeSmallest {
	public static void main(String args[]){
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int a[]=new int[n];
		  int b=n/2,o=n;
		  for(int i=0;i<n;i++){
			  a[i]=s.nextInt();
		  }
		  Arrays.sort(a);
		for(int i=0;i<b;i++){
			System.out.print(a[n-1]+" "+a[i]+" ");
			n--;
			}
		if(o%2!=0){
		System.out.print(a[b]); 
			}
}
	}
