import java.util.Scanner;

public class EvenAndDivBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num%2==0 && num%3==0){
            System.out.println("num is even & divisible by 3");
        }
    }
}
