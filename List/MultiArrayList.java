import java.util.*;
public class MultiArrayList{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // Creating the multi array list over here:
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();

        // Initialization
        for(int i = 0; i < 3;i++) {
            list.add(new ArrayList<Integer>());
        }

        // Adding the elements in the array list over here:
        System.out.println("Enter the elements in the list:");
        for(int i = 0; i < 3;i++) {
            for(int j = 0; j < 3;j++) {
                list.get(i).add(in.nextInt());
            }
        }
        // Printing the elements of the list over here:
        System.out.println(list);
    }
}