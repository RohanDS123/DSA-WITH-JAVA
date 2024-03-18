// This is the correct solution of the given problem - 
import java.util.*;
public class Fourth{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array here:");
        int size = in.nextInt();
        System.out.println("Enter the your target element here:");
        int target = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the elements in the array here:
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // function calling - 
        System.out.println("The index of target element is  = " + findElementIndex(arr,target));
    }
    // Creating the function to find the index of target element -
    static ArrayList findElementIndex(int arr[],int target){
        ArrayList my  = new ArrayList();
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                for(int i = start; i <= end; i++){
                    if(target == arr[i]){
                        my.add(i);
                    }
                }
                break;
            }
            if(target < arr[mid]){
                end = mid + 1;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
        }
        return my;
    }
}