import java.util.Scanner;
public class star
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Please provide number of rows to print... ");
int n = scanner.nextInt();
System.out.println("\nThe star pattern is... ");
for (int i = 1; i <= 2*n ; i+=2)
{
for (int j = 1; j <= i; j++)
{
System.out.print("*");
}
System.out.println();
}
}
}