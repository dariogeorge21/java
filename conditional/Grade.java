package conditional;
import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int mark = sc.nextInt();

        if (mark>0 && mark<100){
            if (mark>90){
                System.out.print("S Grade\n");
            } else if (mark>80){
                System.out.print("A Grade\n");
            } else if (mark>70){
                System.out.print("B Grade\n");
            } else if (mark>60){
                System.out.print("C Grade\n");
            } else if (mark>50){
                System.out.print("D Grade\n");
            } else if (mark>40){
                System.out.print("E Grade\n");
            } else if (mark>30){
                System.out.print("P Grade\n");
            } else{
                System.out.print("F Grade\n");
            }
        } else {
            System.out.print("Wrong Input!!\n");
        }sc.close();
        
    }
}