class Date
{
   public static void main(String args[])
  {
       int date= Integer.parseInt(args[0]);
       int month = Integer.parseInt(args[1]);
       int year = Integer.parseInt(args[2]);
   int days1 = (year - 1969)*365;
   int days2 = (12 - month)*31;
   int days3 = 30 - date;
   int leapyears = 13;
  int total = days1 - days2 - days3 + leapyears;
  System.out.println(total+" days");

   

}

}