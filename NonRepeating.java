package Programs;


import java.util.Scanner;

public class NonRepeating {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i,j;
		int count=0;
	int a[]=new int[n];
	int k[]=new int[n];
	for(i=0;i<n;i++){
		a[i]=scan.nextInt();
		}
	int l=0;
	for(i=0;i<n;i++){
		count=0;
		for(j=i+1;j<n;j++){
			if(a[i]==a[j]){
				count++;
				a[j]=0;
				}
		}
		if(count==0){
	            k[l]=a[i];
	            l++;
		}}
	for(i=0;i<n;i++){
		if(k[i]!=0)
	System.out.print(k[i]+" ");
	}
	scan.close();
	}
}
