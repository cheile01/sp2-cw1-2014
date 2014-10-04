/**
 * Coursework One
 * @author christian Heiler (cheile01)
 * @version 0.1.0
 */

import java.util.Scanner;

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] first = getIntArray("Enter data for array 1 (0 to finish): ");
        int[] second = getIntArray("Enter data for array 2 (0 to finish): ");
        
        System.out.println();
        System.out.println("Values for array 1 is: "+delimit(first," "));
        System.out.println("Values for array 2 is: "+delimit(second," "));
    }

    
    
    
    /**
     * @param needle(int) - value searched for
     * @param haystack[int] array of int to be searched
     * @return boolean true if the needle is in haystack
     */
    public static boolean inArray(int needle, int[] haystack ){
        boolean eval = false;
        for (int straw : haystack) {
            //shorten processing time as all values are set to 0 in array.
            if(straw==0){
                break;
            }
            if(needle==straw){
                eval = true;
            }
        }  
        return eval;
    }
    
    /**
     * @param values(int) array to output
     * @param delimiter(String) delimiter to separate integers
     * @return String of values with delimiter
     */
    public static String delimit(int[] values, String delimiter ){
        String result = "";
        for (int value : values) {
            if(value==0){
                break;
            }
            result += value+delimiter;
        }  
        return result;
    }
    
    /**
     * @param message(String) Message to output
     * @return array of int
     */
    public static int[] getIntArray(String message ){
        Scanner in = new Scanner(System.in);
        int input = 1;
        int[] array = new int[100];
        int i = 0;
        do{
            System.out.print(message);
            input = in.nextInt();
            if(!inArray(input, array)){
               array[i++] = input; 
            } 
        }while(input != 0);
        return array;
    }
    
    
    
    
    
}
