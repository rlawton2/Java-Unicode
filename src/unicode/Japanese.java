/**
 * Created by: Ron Lawton
 * Last updated 6/1/17
 */
package unicode;
/**
 *  This enumeration is used for Japanese symbols and sounds
 * 
 */
//  To store the hexadecimal of each assigned it to the ordinal value
public enum Japanese { 
    ah(0x3042), eh(0x3048), ee(0x3043), oh(0x304A), oo(0x3046),
    kah(0x304b), keh(0x3051), kee(0x304D), koh(0x3053), koo(0x304F),
    gah(0x304C), geh(0x3052), gee(0x304E), goh(0x3054), goo(0x3050);
    private final char JAPANESE;
    
    private Japanese(int value){
           this.JAPANESE = (char)value;   
    }
    
    public char getSymbol(){
        return JAPANESE;
    }
};
