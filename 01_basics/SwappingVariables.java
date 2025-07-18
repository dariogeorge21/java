import java.util.Scanner;
public class SwappingVariables {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // method 1
        System.out.println("Before swapping: ");
        System.out.println(num1+"\t"+num2);
        num1 = num1+num2-(num2=num1);
        System.out.println("After swapping: ");
        System.out.println(num1+"\t"+num2);
        // method 2
        System.out.println("Before swapping: ");
        System.out.println(num1+"\t"+num2);
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("After swapping: ");
        System.out.println(num1+"\t"+num2);
        // method 3
        System.out.println("Before swapping: ");
        System.out.println(num1+"\t"+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: ");
        System.out.println(num1+"\t"+num2);
        // method 4
        System.out.println("Before swapping: ");
        System.out.println(num1+"\t"+num2);
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("After swapping: ");
        System.out.println(num1+"\t"+num2);
        sc.close();
    }
}
