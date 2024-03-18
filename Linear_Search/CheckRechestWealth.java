import java.util.*;
public class CheckRechestWealth{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row size here:");
        int row = in.nextInt();
        System.out.println("Enter the column size here:");
        int column = in.nextInt();

        // Initialization - 
        int arr[][] = new int[row][column];

        // Adding the elements in the array:
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < column; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        // Calling of the function :
        System.out.println("The Rechest person is =" + find(arr,row,column));

    }
    // Creating the function to find the Rechest person :
    static int find(int arr[][],int row, int column){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < column; j++) {
                count += arr[i][j];
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}