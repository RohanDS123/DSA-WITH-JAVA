// Que - Find the smallest element that is greater than the target element - 
import java.util.*;
public class LetterElement{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here: ");
        int size = in.nextInt();
        System.out.println("Enter the your target element here:");
        String  target = in.next();
        in.nextLine();

        // Initialization - 
        String arr[]  = new String[size];

        // Adding the element in the array.
        System.out.println("Enter the elements in the array:");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextLine();
        }
        // Calling the function - 
        System.out.println("The smallest element that is greater than the target element is  = " + findElement(arr, target));
    }
    // Creating the function to find the target element.
    static int findElement(String arr[],String target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target.equals(arr[mid])){
                return mid;
            }
            else if(target.compareTo(arr[mid]) < 0){
                end = mid - 1;
            }
            else if(target.compareTo(arr[mid]) > 0){
                start = mid + 1;
            }

        }
        return start;
    }
}