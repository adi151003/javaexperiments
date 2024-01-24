import java.util.Scanner;
interface test{ 
int square(int n);
}
class arithmetic implements test{
public  int square(int n){
return n*n;
}}
class ToTestInt {
public static void main(String args[]){
	System.out.print("enter a number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
arithmetic obj=new arithmetic();
System.out.println(obj.square(n));
}}