// This is a program to find the floor element.
import java.util.*;
public class Floor{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array here:");
        int size = in.nextInt();
        System.out.println("Enter the floor element here:");
        int floor = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the element in the array:
        for(int i = 0; i < arr.length;i++) {
            arr[i] = in.nextInt();
        }
        // Function Calling-
        System.out.println("The floor inidex is = " + CheckFlooor(arr,floor));
    }
    // Creating the function to finding the floor element .
    static int CheckFlooor(int arr[],int floor){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(floor == arr[mid]){
                return mid;
            }
            else if(floor < arr[mid]){
                end = mid + 1;
                for(int i = start; i < end; i++){
                    if(arr[i] < floor){
                        return i;
                    }
                }
            }
            else if(floor > arr[mid]){
                start = mid;
                for(int i = start; i < end; i++){
                    if(arr[i]<floor){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}