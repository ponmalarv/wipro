package Programs;

import java.util.Scanner;

public class FirstRepaetingNum {
	public static void main(String args[]){
		  Scanner s=new Scanner(System.in);
		  int count=0;
		  int n=s.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++){
			  a[i]=s.nextInt();
		  }
		  for (int i = 0; i <n; i++) {
			  for(int j=i+1;j<n;j++){
			if(a[i]==a[j]){
				count++;
				if(count==1){
					System.out.println(a[i]);
				}
					}
			  }
		}if(count==0){
			System.out.println("unique");
		}
		  s.close();
		 }
}
