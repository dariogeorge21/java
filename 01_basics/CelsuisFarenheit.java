import java.util.Scanner;
public class CelsuisFarenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();
        float farenheit = (celsius*9/5)+32;
        System.out.println("Temperature in Farenheit: "+farenheit);
        sc.close();
    }
}
