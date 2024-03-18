import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your target element here:");
        int target = in.nextInt();
        System.out.println("Enter the size of array here:");
        int size = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the element in the array with the help of for loop-
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Calling the function  - 
        System.out.println("The index of your target element is = " + linear1(arr,target));

    // We can also find the index of target element with the help of for each loop - 
        // boolean found = false;
        // int index = 0;
        // for(int element : arr) {
        //     if(element == target){ 
        //         found = true;
        //         System.out.println("The index of your target element is  = " + index);
        //     }
        //     index++;
        // }
        // if(found==false){
        //     System.out.println("There is no found elemen in your array:");
        // }
    }
    // Creating a function for seaching the element in the array - 
    // static int linear(int arr[],int target){
    //     // if the length of array is zero means target element is not found here:
    //     if(arr.length == 0){
    //         return -1;
    //     }
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == target){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    // If minus one (-1) element is presenet in the array -
        static boolean linear1(int arr[],int target){
        // if the length of array is zero means target element is not found here:
        if(arr.length == 0){
            return false;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}