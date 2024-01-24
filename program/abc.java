import java.util.Scanner;
class abc
    {
        public static void main(String arg[]){
	Scanner sc = new Scanner(System.in);
        int sum=0;
	System.out.println("Enter upper limit");
	int a= sc.nextInt();
	System.out.println("Enter lower limit");
	int b= sc.nextInt();


        for(int i=b; i<a;i++){
            if(i % 5 ==0){
                System.out.println(i);
                sum=sum+i;   
            }   
        }
        System.out.println("the sum of intergers from "+b+" to "+a+"that are divisiblle by 5 \n"+sum);
    }
}