/*
Note - We will use of array list when we don't know how much size will be of array list :
ArrayList is a class because it is starts with the capital letters.
*/

import java.util.*;
public class List{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // In arraylist size is no required.
        ArrayList <Integer> l = new ArrayList<>();

        // We can also directly add the element in the list with .add method.
        // l.add(23);
        // l.add(44);
        // l.add(55);
        // l.add(20);
        // l.add(93);
        // l.add(65);
        // l.add(19);
        // System.out.println(l);
        // Adding the elements in the array list :
        System.out.println("Enter the elements in the list over here :");
        for(int i = 0; i < 11; i++){
            l.add(in.nextInt());
        }
        // Printing the elements of array list:
        System.out.println(l);
        // We don't need to use of toString method over here because it is already using the toString method.

        // Check the element is contaning in this list or not - 
        System.out.println(l.contains(55));

        // change the element of the list - 
        l.set(0,55);

        // Remove the element of the list - 
        l.remove(2);

        // Again printing the elements of the list over here:
        System.out.println(l);

        // We can also get the items of the list with the help of for loop - 
        for(int i=0; i<11;i++){
            System.out.println(l.get(i));   // Pass the index here l[index] syntanx will not work here:
        }


    }
}