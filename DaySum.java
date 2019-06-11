import java.util.Scanner;

public class DaySum {
	public static void main(String Args[]){

		 Scanner s=new Scanner(System.in);
	String day=s.next();
  switch(day)
        {
            case "sunday":
                System.out.println("yes");
                break;
            case "monday":
                System.out.println("no");
                break;
            case "tuesday":
                System.out.println("no");
                break;
            case "wednesday":
                System.out.println("no");
                break;
            case "thursday":
                System.out.println("no");
                break;
            case "friday":
                System.out.println("no");
                break;
            case "saturday":
                System.out.println("no");
                break;
            default:
                System.out.println("invalid");
                break;
        }}}
