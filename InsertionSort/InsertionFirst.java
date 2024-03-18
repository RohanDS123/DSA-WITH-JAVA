import java.util.*;
public class InsertionFirst{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
