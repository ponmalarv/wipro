
import java.util.Scanner;

public class LieonSameLine {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   int a[][]=new int[3][2];
	   for(int i=0;i<3;i++){
		   for(int j=0;j<2;j++){
			   a[i][j]=sc.nextInt();
			   }
	   }
	   boolean flag=false;
  for(int i=0;i<3;i++){
	   for(int j=0;j<1;j++){
		   if(a[i][j]==a[i][j+1]){
			   flag=true;
			   break;
		   }
}
}
  if(flag)
  System.out.println("yes");
  else{
	   System.out.println("no");
	   }
	}}
