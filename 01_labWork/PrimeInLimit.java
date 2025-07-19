import java.util.Scanner;
public class PrimeInLimit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++){
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+"\t");
            }
        }
        System.out.println();
        sc.close();
    }
}
