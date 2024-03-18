// Apply the linear search in two dimensional arrays.
import java.util.*;
public class Search2dArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your target element here:");
        int target = in.nextInt();
        System.out.println("Enter the row size here: ");
        int row = in.nextInt();
        System.out.println("Enter the column size here: ");
        int column = in.nextInt();

        // Initialization - 
        int arr[][] = new int[row][column];

        // Adding the element in the array:
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column;j++){
                arr[i][j] = in.nextInt();
            }
        }
        // Calling of function - 
        int twod [] = thiss(arr,target,row,column);
        System.out.println(Arrays.toString(twod));

    }
    // Creating a function here :
    static int [] thiss(int arr[][],int target,int row,int column) {
        if(arr.length == 0){
            return new int[]{-1};
        }
        int [] result = {-1,1}; 
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j] == target){
                    result[0] = i; 
                    result[1] = j; 
                    return result;
                }
            }
        }
        return  new int[]{-1,-1};
    }
}