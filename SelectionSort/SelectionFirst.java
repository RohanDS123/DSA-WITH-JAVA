import java.util.*;
public class SelectionFirst{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here:");
        int size = in.nextInt();


        // Initialization - 
        int arr[] = new int[size];

        // Adding the elements in array:
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // Function calliing - 
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int getmaxElement = getmax(arr,0,last);
            swap(arr,getmaxElement,last); 
        }
    }
    static int getmax(int arr[],int start,int end){
        int max = start;
        for(int i = start + 1; i <=end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap (int arr[],int first,int last) {
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }
}