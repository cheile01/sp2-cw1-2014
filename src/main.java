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
        while(input != 0){
            System.out.print("whats your number? ");
            input = in.nextInt();
            first[i++] = input;
        }
        inArray(6, first);
        
    }

    /**
     * @param int the command line arguments
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
}
