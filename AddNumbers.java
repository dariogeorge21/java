import java.util.Scanner;

public class AddNumbers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.print("The sum of "+num1+" and "+num2+" is "+sum);
        scanner.close();
    }
}