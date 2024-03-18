// This is the first program to find the ceiling element - 
import java.util.*;
public class Ceiling{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here:");
        int size = in.nextInt();
        System.out.println("Enter the your target element:");
        int target = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the elements in the array .
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Calling of the function from here:
        System.out.println("The Ceiling in your array is = " + CheckCeiling(arr,target));
    }
    // Creating the function for find the ceiling element.
    static int CheckCeiling(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid + 1;
                for(int i = start; i < end; i++) {
                    if(arr[i] > target){
                        return i;
                    }
                }
            }
            else if(target > arr[mid]){
                start = mid + 1;
                for(int i = start; i < end; i++) {
                    if(target == arr[i]){
                        return i;
                    }
                }
            }
        }
        return -1;
   }
}