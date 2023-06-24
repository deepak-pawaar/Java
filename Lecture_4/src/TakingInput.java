import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your lucky number: ");
        int num = sc.nextInt();

        System.out.print("Your lucky number is: " + num);
    }
}
