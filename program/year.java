import java.util.Scanner;

class year{
public static void main (String[]args){

	Scanner sc = new Scanner(System.in);
	int days;
	System.out.println("Date till which you want to calculate");


	System.out.println("Enter Date:");
	int D=sc.nextInt();
	System.out.println("Enter Month:");
	int M=sc.nextInt();
	System.out.println("Enter Year:");
	int Y=sc.nextInt();
	

	if ( M==1 || M==3 || M==5 || M==7 || M==8  || M==10 || M==12){
		days=31;
	} else if( M==4 || M==6  || M==9 || M==11){
		days=30;
	} else  if(M=2){
		if (year % 4 == 0) {

      			if (year % 100 == 0) {

             	      if (year % 400 == 0)
          			leap = true;
        	     else
          	 leap = false;
      }

      		else
        	leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");
		days=28;
	}
	System.out.println(days);
}
}
