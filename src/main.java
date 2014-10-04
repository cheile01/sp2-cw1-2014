/**
 * Coursework One
 * @author christian Heiler (cheile01)
 * @version 1.0
 */

import java.util.Scanner;

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get array values from user
        int[] first = getIntArray("Enter data for array 1");
        int[] second = getIntArray("Enter data for array 2");
        
        System.out.println();
        
        //Check if both arrays are empty
        if((size(first)==0)&&(size(second)==0)) {
            System.out.println("Both arrays are empty");
        }
        else {
            //Output recorded unique data:
            System.out.println("Values for array 1 is: "+delimit(first," "));
            System.out.println("Values for array 2 is: "+delimit(second," "));
            
            //get common elements. Stored in variable for later calculation.
            int[] common = commonArray(first,second);
            System.out.println("Common data is: "+delimit(common," "));
            System.out.println("Number of common data is: "+size(common));
            
            //display unique values.
            System.out.println("Non-common values for array 1 is:  "+delimit(uncommonArray(first,second), " "));
            System.out.println("Non-common values for array 2 is:  "+delimit(uncommonArray(second,first), " "));         
        }  
    }


    
    /** inArray
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
    
    /** delimit
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
    
    /** getIntArray
     * @param message(String) Message to output (adds string: " (0 to finish): " per default)
     * @return array of int
     */
    public static int[] getIntArray(String message ){
        Scanner in = new Scanner(System.in);
        int input = 1;
        int[] array = new int[100];
        int i = 0;
        do{
            System.out.print(message + " (0 to finish): ");
            input = in.nextInt();
            if(!inArray(input, array)){
               array[i++] = input; 
            } 
        }while(input != 0);
        return array;
    }
    
   /** size - returns size of array (to the first 0)
     * @param haystack[int] array of int to be searched
     * @return size number of values to the first 0
     */
    public static int size(int[] haystack ){
        int size = 0;
        for (int straw : haystack) {
            //shorten processing time as all values are set to 0 in array.
            if(straw==0){
                break;
            }
            size++;
        }  
        return size;
    }  
    
    
    /** commonArray - Compares 2 arrays, returns common elements
     * @param first(int[]) 
     * @param second(int[])
     * @return array of common elements
     */
    public static int[] commonArray(int[] first, int[] second){
        int[] array = new int[100];
        int i=0;
        for (int value : first) {
            if(value==0){
                break;
            }
            if(inArray(value, second)){
                array[i++] = value;
            }
        }
        return array;
    }
    
    /** uncommonArray - Compares 2 arrays, returns elements that are unique for the first array
     * @param first(int[]) 
     * @param second(int[])
     * @return array of uncommon elements for the first array
     */
    public static int[] uncommonArray(int[] first, int[] second){
        int[] array = new int[100];
        int i=0;
        for (int value : first) {
            if(value==0){
                break;
            }
            if(!inArray(value, second)){
                array[i++] = value;
            }
        }
        return array;
    }
    

}
