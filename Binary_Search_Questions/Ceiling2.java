import java.util.*;
public class Ceiling2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here: ");
        int size = in.nextInt();
        System.out.println("Enter the your target element:");
        int target = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the elements in the array:
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }   
        // Function calling - 
        System.out.print("The Ceiling element is = ");
        System.out.println(getCeil(arr,target));
    }
    static int getCeil(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                if(target < arr[mid]){
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}