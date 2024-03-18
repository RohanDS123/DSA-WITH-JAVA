import java.util.*;
public class Binary2Darray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row size over here:");
        int row = in.nextInt();
        System.out.println("Enter the column size over here:");
        int column = in.nextInt();
        System.out.println("Enter the target element over here:");
        int target = in.nextInt();

        // Initialization - 
        int arr[][] = new int[row][column];

        // Adding the elements in the array:
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        // function calling:
        System.out.println(Arrays.toString(findTarget(arr,target,row,column)));
    }
    // Creating the function to find the target element in the array:
    static int[] findTarget(int[][] arr, int target,int row,int column) {
        int r = 0;
        int c = arr.length - 1;
        while(row>0 && column>=0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(arr[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}    