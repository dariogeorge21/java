import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int flag = 1;
        for (int i = 2; i < num; i++){
            if (num%i == 0){
                flag = 0;
                break;
            }
        }
        if (flag == 1){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
