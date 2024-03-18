import java.util.*;
public class Passinginfunction{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array here : ");
        int size = in.nextInt();
        int arr[] = new int[size];
        // Add the element in the array:
        for(int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        // printing the elements of the array with the help of tostring method.
        System.out.println(Arrays.toString(arr));
        System.out.println("After calling the function : ");
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Creating a function for changing the element of array - 
    static void change(int arr[]){
        arr[0] = 999;
    }
}