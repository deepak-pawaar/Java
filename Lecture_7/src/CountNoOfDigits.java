import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(Systemk.in);

        System.out.println("Please Entr the number");
        int num = sc.nextInt();
        int sum = 0

        while (num>0){
            sum += num%10;
        }
        System.out.println(sum);
    }
}
