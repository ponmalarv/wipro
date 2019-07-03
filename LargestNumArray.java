package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
	int a[]=new int[n];
	int i,j,temp;
	for( i=0;i<n;i++){
		a[i]=scan.nextInt();
		}
	for(i=0;i<n;i++){
		for(j=i+1;j<n;j++){
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(i=0;i<n-1;i++){
		System.out.print(a[i]);
	}
	
System.out.println(a[n-1]);
}
}
