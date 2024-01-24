class Student
{
public String Name;
 public int Roll_No;
 public Student(){ }
 public Student(String N, int R)
 {
 Name = N;
 Roll_No = R;
 System.out.println("Name : "+Name+" "+"Roll_no : "+Roll_No);
 }
 public void print(String P, int K)
 {
 Name = P;
 Roll_No = K;
 System.out.println("Name : "+Name+" "+"Roll_no : "+Roll_No);
 }
}
public class students
{
 public static void main(String[] args) {
 Student[] Stu;
 Stu = new Student[10];
 Stu[0] = new Student("adi", 99);
 Stu[1] = new Student("dev", 89);
 Stu[2] = new Student("cg", 97);
 Stu[3] = new Student("java", 98);
 Stu[4] = new Student("math", 45);
 Stu[5] = new Student("stats", 90);
 Stu[6] = new Student("daa", 82); 
 Stu[7] = new Student("oop", 93);
 Stu[8] = new Student("ML", 95);
 Stu[9] = new Student("AI", 96);
 try {
 Stu[10] = new Student();
 Stu[10].print("oly", 111);
 } catch (ArrayIndexOutOfBoundsException e)
 {
 System.out.println("Do not cross size of array sir." + e);
 }
 }
}