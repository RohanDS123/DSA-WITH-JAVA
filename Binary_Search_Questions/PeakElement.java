// This is the program of find the peack element - 
import java.util.*;
public class PeakElement{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here: ");
        int size = in.nextInt();
        
        // Initialization- 
        int arr[] = new int[size];

        // Adding the element in the array.
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Calling of the function -
        System.out.println("The Peak element in the array list is = " + Arl(arr));
    }
    // Creating the function to find the peak element.
    static ArrayList Arl(int arr[]){
        ArrayList arlist = new ArrayList();
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i]>arr[1 - 1] && arr[i] < arr[i + 1]){
                arlist.add(arr[i]);
            }
        }
        return arlist;
    }
}