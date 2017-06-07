/**
 * Created by: Ron Lawton
 * Last updated 6/1/17
 */
package unicode;
/**
 *  When instantiated the IndividualHiragana class will create a Hiragana with
 *  the Japanese symbol, sound, and the equivalent English letter(s).
 * 
 */
public class IndividualHiragana {
    
    private final English ENGLISH;          // Class field of the English enum
    private final Japanese SOUND;           // class field of the Japanese enum
    private final char JAPANESE;            // Char var for the Japanese symbol
    
//  Constructor method    
    public IndividualHiragana(English e, Japanese j) {
        this.ENGLISH = e;
        this.SOUND = j;
        this.JAPANESE = j.getSymbol();
    }
//  Override of the toString method to diplay an Hiragana object    
    @Override
    public String toString() {
        String str = "Japanese: " + JAPANESE + " similar to English: " 
                + ENGLISH +
                "\n\tsounds like " +
                SOUND; 
        return str;
    }
}
