import java.util.Scanner;

public class LoopNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) continue;
            System.out.print(i + " ");
        }
        sc.close();
    }
}
