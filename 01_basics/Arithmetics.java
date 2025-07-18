import java.util.Scanner;
public class Arithmetics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int diff = num1-num2;
        int prod = num1*num2;
        int quo = num1/num2;
        int rem = num1%num2;
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+prod);
        System.out.println("Quotient: "+quo);
        System.out.println("Remainder: "+rem);
        sc.close();
    }
}
