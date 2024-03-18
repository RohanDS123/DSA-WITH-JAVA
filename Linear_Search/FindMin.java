// This program is find the minimum element of the array - 
import java.util.*;
public class FindMin{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size array here:");
        int size = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the element in the array :
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Calling the function 
        System.out.println(findmini(arr));
    }
    // Creating the function for finding the minimum element of the array :
    static int findmini(int arr[]){
        int mini = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < mini){
                mini = i;
            }
        }
        return mini;
    }
}