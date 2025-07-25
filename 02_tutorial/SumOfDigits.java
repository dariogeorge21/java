import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        if (count != 4) {
            System.out.println("Please enter a valid four-digit number.");
        } else {
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println("Sum of digits: " + sum);
        }
        sc.close();
    }
}
