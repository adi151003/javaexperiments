interface test{
int number =100;
}
class A implements test{
public static void main(String args[]){
	A obj =new A();
System.out.println(obj.number=200);
}}
//this gives error because by default variable declared in interface is final