import java.util.Scanner;
public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; i++){
            if (num1%i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD of "+num1+" and "+num2+" is "+gcd);
        sc.close();
    }
}
