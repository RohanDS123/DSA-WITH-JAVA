import java.util.*;
public class TdArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the row here:");
        int row = in.nextInt();
        System.out.println("Enter the array column size here:");
        int column = in.nextInt();
        int nums[][] = new int[row][column];
        
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0;j<column; j++) {
                nums[i][j] = in.nextInt();
            }
        }
        // Printing the elements of the array with the help of double for loop :
        for(int i = 0;i<nums.length;i++) {
            for(int j = 0;j<nums[i].length;j++) {
                System.out.print(nums[i][j] + " ");
            }
             System.out.println(" ");
        // Another way to print this and that is Arrays.toString method - 
        // for (int i = 0; i <nums.length; i++){
        //     System.out.println(Arrays.toString(nums[i]));
        // }
        // Also there is a another method to print the elements of this array  with for each loop :
        // for(int[] a:nums){
        //     System.out.println(Arrays.toString(a));
        }
    }  
}