class Worker{
String name="sumyak";
int salary_rate=82;
public static void main(String args[]){
Daily_worker d=new Daily_worker();
 
d.ComPay(34);
Salaried_worker s=new Salaried_worker();
s.ComPay(34);
}}
class Daily_worker extends Worker{
void ComPay(int hours){
System.out.println(salary_rate*hours);
}
}
class Salaried_worker extends Worker{
void ComPay(int hours){
System.out.println(salary_rate*40); 
}
}