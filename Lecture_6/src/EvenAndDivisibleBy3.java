import java.util.Scanner;

public class EvenAndDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        if (num % 2 == 0){
            if (num%3 == 0){
                System.out.println("Number is even and divisble by 3");
            }else {
                System.out.println("number is even but not divisible by 3");
            }
        }else {
            System.out.println("number is not even and nor divisible by 3");
        }
    }
}
