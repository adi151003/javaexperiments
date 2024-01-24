import java.util.Scanner;
public class num
{
	public static void main(String[] args) {
	    Scanner ob = new Scanner(System.in);
	   	System.out.println("Enter 3 digits");
        int[] arr = new int[3];
        for(int i=0; i<arr.length; i++){
            arr[i] = ob.nextInt();
        }
        for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 3; k++)
            {
                if (i != j && j != k && k != i)
                {        
                    System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
                }
            }
        }
    }
}

        

}