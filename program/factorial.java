import java.util.Scanner;
class factorial{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  Scanner sc = new Scanner(System.in);
  int num=sc.nextInt();
  fact = factorial(num);   
  System.out.println("Factorial of "+num+" is: "+fact);    
 }  
}  