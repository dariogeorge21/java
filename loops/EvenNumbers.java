package loops;
import java.util.Scanner;

public class EvenNumbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int num = sc.nextInt();
        int i = 2;
        do{
            System.out.print(i + "\t");
            i+=2;
        }while(i <= num);
        sc.close();
    }
}