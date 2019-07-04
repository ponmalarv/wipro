package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class EqualIndexValue {
	public static void main(String args[]){
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int count=0;
		  int i;
		  int a[]=new int[n];
		  int b[]=new int[n];
		  for (i = 0; i < n; i++) {
			a[i]=s.nextInt();
		}
		  for(i=0;i<n;i++){
			  if(a[i]==i){
				  b[i]=a[i];
				
				  count++;
			  }
		  }
		  Arrays.sort(b);
		  if(count==0){
			  System.out.println("-1");
		  }else{
			  for(i=0;i<n;i++){
				  if(b[i]!=0){
			  System.out.println(b[i]);
		  }
			  }
			  }
		  s.close();
}
}
