import java.util.Scanner;
interface A{
int add(int n, int p);
int sub(int n,int p);
}
class MyClass implements A{
public int add(int n, int p){
return n+p;
}
public int sub(int n,int p){
return n-p;
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int p=sc.nextInt();
MyClass obj =new MyClass();
System.out.println("Sum is:"+obj.add(n,p));
System.out.println("Diff is:"+obj.sub(n,p));
}}