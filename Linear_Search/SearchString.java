import java.util.*;
public class SearchString{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the your target character here:");
        char target = in.next().charAt(0);
        System.out.println("Enter the your string here:");
        in.nextLine();
        String name = in.nextLine();
        System.out.println(Arrays.toString(name.toCharArray()));

        // Calling the function from here to check the target element in the String array or not
        System.out.println(SearchinString(name,target));
        System.out.println(SearchinString2(name,target));
    }
    // Creating a function over here:
    static boolean SearchinString(String name,char target){
        if(name.length()==0){
            return false;
        }
        // Otherwise we can run the for loop over here:
        for(int i=0;i<name.length();i++) {
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    // I can also use of for each loop over here for this condition:
    
        static boolean SearchinString2(String name,char target){
        if(name.length()==0){
            return false;
        }
        // Otherwise we can run the for loop over here:
        for(char element : name.toCharArray()){   // Here toCharArray method convert the string array into characters.
            if(element==target){
                return true;
            }
        }
        return false;
    }
}