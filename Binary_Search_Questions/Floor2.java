// This is the program of to find the floor element of the array.
import java.util.*;
public class Floor2{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here:");
        int size = in.nextInt();
        System.out.println("Enter the your target element here:");
        int target = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the elements in the array with the help of for loop.
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        // function Calling - 
        System.out.println("The floor value is  = " + findfloor(arr,target));
        
    }
    // Creating the function to find the floor element of the array.
    static int findfloor(int arr[],int target){
        int start = 0;
        int end = arr.length -1 ;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return end;
    }
}