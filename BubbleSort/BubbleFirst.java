import java.util.*;
public class BubbleFirst{
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the size of array here: ");
        int size = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Adding the elements in the array:
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Function calling - 
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean swap = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
}