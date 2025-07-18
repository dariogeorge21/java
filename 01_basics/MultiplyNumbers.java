import java.util.Scanner;
public class MultiplyNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int prod = num1*num2;
        System.out.println("Product of 2 numbers is: "+prod);
        sc.close();
    }
}
