class calculate
 
{
  public static void main(String args[])
   
    {
       int i= Integer.parseInt(args[0]);
	char n  = args[1].charAt(0);
       int j = Integer.parseInt(args[2]);

       switch(n){
    

       case '+': System.out.println(args[0]+"+"+args[2]+"= "+(i+j));
       break;

       case '-': System.out.println(args[0]+"-"+args[2]+"= "+(i-j));
       break;

       case '/': System.out.println(args[0]+"/"+args[2]+"= "+(i/j));
       break;

       case '*': System.out.println(args[0]+""+args[2]+"= "+(i*j));
       break;
  

       default: System.out.println("enter proper operator");
     }


   }

}