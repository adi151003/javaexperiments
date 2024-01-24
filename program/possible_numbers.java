import java.util.Scanner;
public class TestPossibleNumbers {
	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("enter the number");
		int[] input = new int[3];
		for(int i=0; i<3; i++){
			input[i] =ob.nextInt();
		}
		System.out.println("outcome is \n");
		possibleNumbers(input);
	}
	public static void possibleNumbers(int[] x, int index){
		 if (index ==x.length) {
			for(int i = 0; i < x.length; i++) {
				System.out.print(x[i] + " ");
			}
			System.out.println();
		}
		for(int i= index; i< x.length; i++){
			int temp = x[index];
			x[index] = x[i];
			x[i] = temp;
			possibleNumbers(x, index + 1);
			temp = x[index];
			x[index]= x[i];
		}
	}
}