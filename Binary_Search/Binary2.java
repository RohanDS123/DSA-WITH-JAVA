import java.util.*;
public class Binary2{
    public static void main(String[]args){
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size  = in.nextInt();
        System.out.println("Enter the target element here:");
        int target = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];
        
        // Adding the elements in the array with the help of for loop.
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        // Calling the function 
        System.out.println("The index of your function is  = " + binary(arr,target));
    }
    // Creating a function for binary search.
    static int binary(int arr[],int target){
        int start = 0;
        int end = arr.length - 1;
        boolean Asc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end -start) / 2;
            if(target == arr[mid]){
                return mid;
            }
            if(Asc){
                if(target<arr[mid]){
                    end = mid -1;
                }
                else if(target>arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid+1;
                }
                else if(target>arr[mid]){
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}