// This program for searching the element in the particular range - 
import java.util.*;
public class SearchInRange{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your target element here: ");
        int target = in.nextInt();
        System.out.println("Enter the size of your array here:");
        int size = in.nextInt();
        System.out.println("Enter the first range of your array here:");
        int first = in.nextInt();
        System.out.println("Enter the second range of your array here:");
        int second = in.nextInt();

        // Initialization - 
        int arr[]  = new int[size];

        // Adding the element in the array - 
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Calling of the function - 
        System.out.println(SearchRange(arr,target,first,second));
    }
    // Creating a function for checking the element in particular range - 
    static int SearchRange(int arr[],int target,int first,int second){
        if(arr.length==0){
            return -1;
        }
        for(int i = first; i <=second ; i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}