import java.util.Scanner;
class square{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of elements \n");
    int n = sc.nextInt();
    int[] a = new int[n];
   for(int i=0; i<a.length; i++){
       System.out.println("enter element "+(i+1)+": "); 
       a[i] = sc.nextInt();
    }
	for(int i=0; i<a.length; i++){
	System.out.println("Square of  "+a[i]+" is "+a[i]*a[i]);
}
}
}