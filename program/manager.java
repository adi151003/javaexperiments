import java.util.*;
class employee
{
String name;
int empid;
int salary;
employee()
{
}
employee(String n,int e,int s)
{
name=n;
empid=e;
salary=s;
}
String names()
{
return name;
}
int salaries()
{
return salary;
}
double increaseSalary(double per_rate)
{
double in=(salary*(per_rate/100));
double s=salary+in;
return s;
}
}
class manager extends employee
{
public String department="d";
 
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter the name");
String n=sc.next();
System.out.println("enter the employee id");
int e=sc.nextInt();
System.out.println("enter the salary");
int s=sc.nextInt();
System.out.println("enter the percentage_rate increaced in salary");
double p=sc.nextDouble();
employee e1=new employee(n,e,s);
System.out.println(e1.names());
System.out.println(e1.salaries());
System.out.println(e1.increaseSalary(p));
}
}