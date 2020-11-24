public class School
{
   //Attributes
   private NameAndAddress nameAdd;
   private int enrollment;

   //Constructors
   public School(String name, String add, int zip, int enrolled)
   {
      this.nameAdd = new NameAndAddress(name, add, zip);
      this.enrollment = enrolled;
   }

   //Input output methods
   public void display()
   {
      System.out.println("The school information:");
      nameAdd.display();
      System.out.println("Enrollment is " + enrollment);
   }
}
