package moudle1;
import java.util.*;
class MyCalculator{
	double number1,number2;
	MyCalculator(double num1, double num2){
		number1=num1;
		number2=num2;}
	void add(){
		System.out.println(number1+" + "+number2+" ="+(number1+number2));
	}
	void subtract(){
		System.out.println(number1+" - "+number2+" ="+(number1-number2));
	}
	void multiply(){
		System.out.println(number1+" * "+number2+" ="+(number1*number2));
	}
	void divide(){
		if(number2!=0)
			System.out.println(number1+" / "+number2+" ="+(number1/number2));
		else
			System.out.println("Division by 0 not possible");
	}
}
public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		char cont='y';
		while(cont=='y') {
		System.out.println("--- Calculator Menu ---\n"
				+ "1. Add\n"
				+ "2. Subtract\n"
				+ "3. Multiply\n"
				+ "4. Divide\n"
				+ "Enter your choice (1-4):");
		int choice=in.nextInt();
		System.out.println("Enter two numbers");
		double n1=in.nextDouble();
		double n2=in.nextDouble();
		MyCalculator obj= new MyCalculator(n1,n2);
		switch(choice) {
		case 1:obj.add();
		break;
		case 2:obj.subtract();
		break;
		case 3:obj.multiply();
		break;
		case 4:obj.divide();
		break;
		default:
		System.out.println("Enter a number between 1 and 4");
		break;
		}
		System.out.println("Do you want to continue? :(y/n) ");
		cont= in.next().charAt(0);
	}
		in.close();
	}

}
