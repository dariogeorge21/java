import java.util.Scanner;
public class twoDimensional {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 2-dimensional array
        int[][] numbers2 = new int[3][3];
        System.out.println("Enter the elements for the matrix: ");
        for(int i = 0; i < 3; i++){
            System.out.print("Enter elements for row "+(i+1)+":");
            for (int j = 0; j < 3; j++){
                numbers2[i][j] = sc.nextInt();
            }System.out.println();
        }
        //print
        System.out.println("Elements in the matrix: ");
        for(int i = 0; i < 3; i++){
            for (int j = 0; j< 3; j++){
                System.out.print(numbers2[i][j]+"\t");
            }System.out.println();
        }
        sc.close();
    }
}
