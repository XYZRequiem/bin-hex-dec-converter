import java.util.*;
import java.util.Arrays;
/**
 * Write a description of class BDHConvertMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BDHConvertMain
{
    // instance variables - replace the example below with your own
    private int x;
    
    public static void main(String[] args) {
        BDHConvertFunction convert = new BDHConvertFunction();
        System.out.println(convert.DecimalToBinary(16000));
        System.out.println(convert.DecimalToHexadecimal(16000));
        System.out.println(convert.BinaryToDecimal("11111010000000"));
        System.out.println(convert.BinaryToHexadecimal("11111010000000"));
        System.out.println(convert.HexadecimalToDecimal("3e80"));
        System.out.println(convert.HexadecimalToBinary("3e80"));
    }
    
    /**
     * Constructor for objects of class BDHConvertMain
     */
    public BDHConvertMain()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
