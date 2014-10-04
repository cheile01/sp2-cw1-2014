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
        //TODO: code application logic here
        Scanner in = new Scanner(System.in);
        int input = 1;
        int[] first = new int[100];
        int i = 0;
        do{
            System.out.print("whats your number? ");
            input = in.nextInt();
            if(!inArray(input, first)){
               first[i++] = input; 
            } 
        }while(input != 0);
    }

    /**
     * @param needle(int) - value searched for
     * @param haystack[int] array of int to be searched
     * @return boolean true if the needle is in haystack
     */
    public static boolean inArray(int needle, int[] haystack ){
        boolean eval = false;
        
        for (int straw : haystack) {
            //shorten processing time.
            if(straw==0){
                break;
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
            result += value+delimiter;
        }  
        return result;
    }
    
    
    
    
    
    
}
