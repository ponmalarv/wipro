package Programs;

import java.util.Scanner;

public class EqualIndexValue {
	public static void main(String args[]){
		  Scanner s=new Scanner(System.in);
		  int n=s.nextInt();
		  int count=0;
		  int a[]=new int[n];
		  for (int i = 0; i < n; i++) {
			a[i]=s.nextInt();
		}
		  for(int i=0;i<n;i++){
			  if(a[i]==i){
				  System.out.println(a[i]);
				  count++;
			  }
		  }if(count==0){
			  System.out.println("-1");
		  }
		  s.close();
}
}
