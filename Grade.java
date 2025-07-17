package grade;
import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.print.out("Enter marks: ");
        int mark = sc.nextInt();

        if (mark>0 && mark<100){
            if (mark>90){
                System.print.out("S Grade\n");
            } else if (mark>80){
                System.print.out("A Grade\n");
            } else if (mark>70){
                System.print.out("B Grade\n");
            } else if (mark>60){
                System.print.out("C Grade\n");
            } else if (mark>50){
                System.print.out("D Grade\n");
            } else if (mark>40){
                System.print.out("E Grade\n");
            } else if (mark>30){
                System.print.out("P Grade\n");
            } else{
                System.print.out("F Grade\n");
            }
        } else {
            System.print.out("Wrong Input!!\n");
        }sc.close();
        
    }
}