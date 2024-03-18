import java.util.*;
public class StringorBuilder{
    public static void main(String[] args){
    //     String first_name = "Rohan";
    //     String second_name = "Rohan";
    //     System.out.println(first_name == second_name);

    //     first_name = "Danish";
    //     System.out.println(first_name);   // It will change in only first_name :
    //     System.out.println(second_name);  // It will not change in second_name because of immutability concept:
    //     System.out.println(first_name ==  second_name);

    // // We can also create the two objects for the same value with the help of new keyword but outside the pool in heap:
    //     String name1 = new String ("Rohan");
    //     String name2 = new String ("Rohan");
    //     System.out.println(name1 == name2);
    
    // // When you need to check only values then you can use only .equals() method  :
    //     System.out.println(name1.equals(name2));
/* 
There are two concept over here is that - 
1. String pool -  
2. Immutability - 
String pool - String pool is a seperate memory structure inside the heap: 

Why Strings are immutable ? --  The sort answer is for security reasons:
*/

    // PreetyPrinting over here:
    float a = 2.1235f;
    // System.out.printf("The formated string is %.2f", a);   // Here % is a placeholder:

// We can also print the value of pie :
     System.out.printf("The value of pie is  = %.3f",Math.PI);
     System.out.println();
 
// We can also printing our name over her:
    System.out.printf("My name is  = %s and I'm from %s","Rohan", "Dewas");

// Place holder list :

            // %s: String
            // %d: Decimal (integer)
            // %f: Floating-point number
            // %c: Character
            // %b: Boolean
            // %x, %X: Hexadecimal (lowercase/uppercase)
            // %o: Octal
            // %e, %E: Scientific notation (lowercase/uppercase)
            // %t: Date/time conversion
            // %tB: Full month name
            // %tb: Abbreviated month name
            // %tm: Two-digit month (01-12)
            // %td: Two-digit day (01-31)
            // %tY: Four-digit year
            // %ty: Two-digit year
            // %tH: Two-digit hour (00-23)
            // %tM: Two-digit minute (00-59)
            // %tS: Two-digit second (00-60)
            // %n: Platform-specific line separator
            // %%: Literal percent sign


    }
}   