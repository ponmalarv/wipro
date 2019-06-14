public class PascalTriangle {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
int r=scan.nextInt();
int i,j,k;
int num=0;
for(i=0;i<r;i++){
	for( k=r;k>i;k--){
		System.out.print(" ");
	}
	num=1;
	for(j=0;j<=i;j++){
		System.out.print(num+" ");
	
	num=num*(i-j)/(j+1);
}
	System.out.println();
}
}}
