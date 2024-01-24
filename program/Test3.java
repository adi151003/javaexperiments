class Test3
{
  int data = 5;
  
  Test3() {
    data = 10;
  }
}
 
public class Test 
{
   public static void main(String args[]) 
   {
      Test3 obj = new Test3();
      System.out.println(obj.data);
   }
}