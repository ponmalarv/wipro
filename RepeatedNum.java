package Programs;

import java.util.Scanner;

public class RepeatedNum {
	public static void main(String args[]){
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++){
			  a[i]=s.nextInt();
		  }
		  int k=0,count=0;
		  int arr[]=new int[n];
		  for(int i=0;i<n-1;i++){
			  count=0;
			  for(int j=i+1;j<n;j++){
				  if(a[i]==a[j]){
					  count++;
					  a[j]=0;
				  }
				  }
			  if(count>0) 
				  {arr[k]=a[i];
				  k++;
				  }
				  }
	for(int i=0;i<n;i++){
			  if(arr[i]!=0){
				  System.out.print(arr[i]+" ");
			  }
			  }
		  }
		  
}
