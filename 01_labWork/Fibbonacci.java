import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int a = 0, b = 1, c = 0;
        System.out.print(a+"\t"+b+"\t");
        int i = 2;
        while(i<num){
            c = a+b;
            System.out.print(c+"\t");
            a = b;
            b = c;
            i++;
        }
        sc.close();
    }
}
