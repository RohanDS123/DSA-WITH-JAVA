import java.util.*;
public class CheckEvenNum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array here: ");
        int size = in.nextInt();

        // Initialization - 
        int arr[] = new int[size];

        // Add the elements in the array:
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        // calling the function from here:
        System.out.println("The even number is  = " + Check(arr))
    }
    // Creating the function:
    static int Check(int arr[]){
        int count = 0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // Again creating the one more function to make sure even number:
    static boolean even(int num) {
        int count1 = 0;
        while(num > 0){
            count1++;
            num = num / 10;
        }
        return count1 % 2 == 0;
    }
}