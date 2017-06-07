/**
 * Created by: Ron Lawton
 * Last updated 6/1/17
 */
package unicode;

import java.util.ArrayList;
/**
 *  This program creates a ArrayList of Hiragana characters utilizing Unicode 
 *  hexadecimals and enumerations. The program creates and then displays 15 of
 *  the 48 symbols.
 * 
 */
public class DisplayHiragana {

    private static final  ArrayList<IndividualHiragana> HIRAGANA = new ArrayList();
 
    public static void main(String[] args) {
        int counter = 0;
        // Load HIRAGANA collection
        for (Japanese j: Japanese.values()){
                    HIRAGANA.add(new IndividualHiragana(English.values()[counter], j));
                    counter++;
        }
        // Display the HIRAGANA collection
        for (IndividualHiragana a: HIRAGANA)
            System.out.println(a.toString());
    }
    
}
