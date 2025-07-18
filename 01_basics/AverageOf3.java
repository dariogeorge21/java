import java.util.Scanner;
public record AverageOf3() {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three decimal numbers to find their average: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        float avg = (num1+num2+num3)/3;
        System.out.println("Average of 3 numbers is: "+avg);
        sc.close();
    }
}
