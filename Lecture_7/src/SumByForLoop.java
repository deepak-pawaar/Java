import java.util.Scanner;

public class SumByForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for sum: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i<= num; i++){
            sum = sum + i;
        }
        System.out.println("The sum is: " + sum);

    }
}