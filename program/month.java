import java.util.Scanner;
public class month
{
	public static void main(String[] args) {
	    System.out.println("Enter the number of the month");
	    Scanner ob = new Scanner(System.in);
	    int n = ob.nextInt();
	String[] str = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	if(n>=1 && n<=12)	
		   System.out.println("Coressponding month : "+str[n-1]);
		else
		    System.out.println("Invalid input");
	}
}