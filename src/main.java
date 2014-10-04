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
        int i = 1;
        
        while(i != 0){
            System.out.print("whats your number? ");
            i = in.nextInt();
            
        }
        
    }

    /**
     * @param int the command line arguments
     */
    public static boolean inArray(int needle, int[] haystack ){
        boolean eval = false;
        
        for (int straw : haystack) {
            System.out.println(straw);
        }
        
        return eval;
    }
}
