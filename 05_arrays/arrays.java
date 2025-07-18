import java.util.Arrays;
public class arrays {
    public static void main(String[] args){
        int[] numbers = new int[4];
        numbers[0]=122;
        numbers[1]=211;
        numbers[2]=113;
        numbers[3]=14;
        // print
        for(int i=0 ; i< 4; i++){
            System.out.println(numbers[i]+"\t");
        }
        // length
        System.out.println("Length: "+numbers.length);
        //sort -> class Array util
        Arrays.sort(numbers);
        for(int i=0 ; i< 4; i++){
            System.out.println(numbers[i]+"\t");
        }
    }
}
