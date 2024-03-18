import java.util.*;
public class TwodArray{
    public static void main(String[] args){
        // Creating the two dimensionl array here:
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your row size here:");
        int row = in.nextInt();
        System.out.println("Enter the your column size here:");
        int column = in.nextInt();

        int arr[][] = new int[row][column];

        // Add the elements in the arrays;
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        // Printing the elemenats of the array over here:
        // System.out.println(Arrays.toString(arr));  // The Twostring method will not work for two dimensional array
        for (int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println(" ");

        // We can change the element directly and after changing the element we can print the element:
        arr[0][0] = 44;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
        // We can definitely do that as well : 👆🏼

        
    }
}