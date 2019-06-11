import java.util.Scanner;

public class RevVowelsremove {
	public static void main(String Args[]){

		 Scanner s=new Scanner(System.in);
		 String s1=s.next();
		 s1=s1.replaceAll("[aeiouAEIOU]","");
		 System.out.println(s1);
		 StringBuffer sb=new StringBuffer(s1);
		 System.out.println(sb.reverse());
		s.close(); 
		 
}
}
