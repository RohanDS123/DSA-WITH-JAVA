import java.util.*;
public class OnedArray{
    public static void main(String[] args){

        // We can also define the array elements something like this:
        // int arr[] = {1,2,3,4,5};

        Scanner in = new Scanner(System.in);
        // // Creating an Array:
        // int arr[] = new int[5];

        // // Add the element in the array with the help of for loop.
        // System.out.println("Enter the elements in the array: ");
        // for(int i=0; i<arr.length; i++){
        //     arr[i] = in.nextInt();
        // }

        // // printing the elements of array:
        // System.out.println(Arrays.toString(arr));   // Internally it is using for loop .

        // // We can also get the value of array with for each loop :
        // for(int num:arr){    // For every element in the array print the element.
        //     System.out.print(num + " ");
        // }

        // // If you want to get the element more then length of array basically it will give an Error.
        // // System.out.println(arr[5]);   // Index out of bound error.


        // Creating the String arrays:
        System.out.println("Enter the arrays element here: ");
        String names[] = new String[5];

        for(int i = 0; i < names.length; i++){
            names[i] = in.nextLine();
        }

        // Printing the array element here:
        System.out.println(Arrays.toString(names));
    }
}