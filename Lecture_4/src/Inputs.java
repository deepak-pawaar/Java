import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter roll no: ");
//        int roll_no = input.nextInt();
//        System.out.println("Your roll number is" + roll_no);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);
    }
}
