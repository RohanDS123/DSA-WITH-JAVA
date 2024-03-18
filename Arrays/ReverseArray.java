import java.util.*;
public class ReverseArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here: ");
        int size = in.nextInt();
        // Initialization -
        int arr[] = new int[size];

        // Adding the elements in the array - 
        for(int i = 0; i < size;i++) {
            arr[i] = in.nextInt();
        }
        // Calling the function - 
        System.out.println(reverseOrder(arr));

    }
    // Creating a function to print the reverse order of array - 
    static ArrayList reverseOrder(int[] arr) {
        ArrayList<Integer> reverse = new ArrayList<>();
        for(int i = arr.length - 1;i>=0;i--) {
            reverse.add(arr[i]);
        }
        return reverse;
    }
}