import java.util.Scanner;
class Stu_marks {
    public static void main(String[] args) {
        int temp =0;
    Scanner ob = new Scanner(System.in);
    System.out.println("enter the number of students\n");
    int n = ob.nextInt();
    int[] a = new int[n];
    String[] b=new String[n];
    System.out.println("enter marks of students\n");
    for(int i=0; i<a.length; i++){
       System.out.println("marks of student"+(i+1)+": "); 
       a[i] = ob.nextInt();
    }
     for (int i = 0; i < a.length; i++) {     
            for (int j = i+1; j < a.length; j++) {     
               if(a[i] > a[j]) {    
                   temp = a[i];    
                   a[i] = a[j];    
                   a[j] = temp;    
               }     
            }     
        }    
    /*System.out.println("Marks entered are\n");
     for(int i=0; i<a.length; i++){
           
     System.out.print(a[i]+" ");
  }*/
  for(int i=0; i<a.length; i++){
      
      if(a[i]>=76)
        {
            b[i] = ("distinction");
            //System.out.print("Student"+(i+1)+" Distinction\n");
        }
           
     else if(a[i]<40)
        {   b[i] = "FAIL";
           // System.out.print("Student"+(i+1)+" FAIL\n");
        }
      else if(a[i]>=40 && a[i]<=50)
        {  b[i] = "Pass";
           //System.out.print("Student"+(i+1)+" Pass\n");
        } 
      else if(a[i]>=51 && a[i]<=75)
        {   b[i] = "Merit";
            //System.out.print("Student"+(i+1)+" Merit\n");
        }
  }
  System.out.print("The students Grade are: \n");
  System.out.println("STUDENT ID"+"      "+"MARKS"+"      "+"GRADE");
  for(int i=0; i<a.length; i++){
           
     System.out.print("Student"+(i+1)+"         "+a[i]+"           "+b[i]+"\n");
  }
  
        
    }
}