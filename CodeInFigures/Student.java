public class Student
{
    //Attributes
   private static final int SCHOOL_ID = 12345;
   private int stuNum;
   private double gpa;

   //Constructors
   public Student(int stuNum, double gpa)
   {
     this.stuNum = stuNum;
     this.gpa = gpa;
   }

   //Input output methods
   public void showStudent()
   {
     System.out.println("Student #" + stuNum +
         " gpa is " + gpa);
   }
}
