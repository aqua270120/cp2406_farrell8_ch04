public class Ex1 {
    public static void main(String[] args) {
        displaySaluation("Bao");
        displayLetter();
        displaySaluation("Duoc", "Le");
        displayLetter();
    }

    public static void displaySaluation(String lName) {
        System.out.println("Dear Mr. or Ms. " + lName + ",");
    }

    public static void displaySaluation(String fName, String lName) {
        System.out.println("Dear " + fName + " " + lName + ",");
    }

    public static void displayLetter() {
        System.out.println("   Thank you for your recent order.\n");
    }
}
