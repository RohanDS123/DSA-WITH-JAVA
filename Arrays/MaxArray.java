// import java.util.*;
// public class MaxArray{
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the size of the array over here:");
//         int size = in.nextInt();

//         // Initialization
//         int arr[] = new int[size];

//         // Adding the elements in the array:
//         for(int i =0;i<size;i++){
//             arr[i] = in.nextInt();
//         }
//         System.out.println("The maximum element of the array is = " + mx(arr));

//     }
//     // Creating a function for checking the maximum element of the array :
//     // static int  mx(int arr[]){
//     //     int m = 0;
//     //     for(int i = 0;i<arr.length; i++) {
//     //         if(arr[i]>m){
//     //             m = arr[i];
//     //         }
//     //     }
//     //     return m;
//     // }
//     // If you want to find the index of maximum element then you can just do it.
//         static int  mx(int arr[]){
//         int m = 0;
//         for(int i = 0;i<arr.length; i++) {
//             if(arr[i]>m){
//                 m = i;
//             }
//         }
//         return m;
//     }
// }

// Create an Array in java:
import java.util.*;
public class MaxArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array here:");
        int num = in.nextInt();

        int arr[] = new int[num];

        // Insert the elements in the array with the help of for loop:
        for(int i = 0; i < num; i++){
            arr[i] = in.nextInt();
        }

        // Printing all the elements of this array:
        System.out.println(Arrays.toString(arr));

        // Now find the maximum element of the array:
        int max = arr[0];
        for(int i = 1; i < arr.length;i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("The maximum element of your array is  = %d",max);
    }
}