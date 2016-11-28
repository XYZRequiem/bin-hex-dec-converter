import java.util.Arrays;
/**
 * Write a description of class BDHConvertFunction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BDHConvertFunction extends BDHConvertMain
{
    // instance variables - replace the example below with your own
    public static String DecimalToBinary(int decimal) {
        int base = 2, power = 0, bin = 0, copy = decimal;
        
        while(bin <= decimal) {
            bin = (int)Math.pow(base, power);
            power += 1;
        }
        power -= 1;
        int[] binaryArray = new int[power];
        
        for(int x = power-1; x >= 0; x -= 1) {
            bin = (int)Math.pow(base, x);
            if(bin <= copy) {
                copy -= bin;
                binaryArray[power-1-x] = 1;
            } else {
                binaryArray[power-1-x] = 0;
            }
        }
        
        return (Arrays.toString(binaryArray));
    }
    
    public static String DecimalToHexadecimal(int decimal) {
        int base = 16, power = 0, hex = 0, index = 0, copy = decimal;
        
        while(hex <= decimal) {
            hex = (int)Math.pow(base, power);
            power += 1;
        }
        power -= 1;
        char[] hexadecimalArray = new char[power];
        
        for(int x = power-1; x >= 0; x -= 1) {
            hex = (int)Math.pow(base, x);
            index = 15;
            
            while(hex*index > copy && index != 0) {
                index -= 1;
            }
            
            if (copy == 0) { index = 0; }
            copy -= hex*index;          
            
            if (index == 15) {
                hexadecimalArray[power-1-x] = 'F';
            } else if (index == 14) {
                hexadecimalArray[power-1-x] = 'E';
            } else if (index == 13) {
                hexadecimalArray[power-1-x] = 'D';
            } else if (index == 12) {
                hexadecimalArray[power-1-x] = 'C';
            } else if (index == 11) {
                hexadecimalArray[power-1-x] = 'B';
            } else if (index == 10) {
                hexadecimalArray[power-1-x] = 'A';
            } else if (index == 9) {
                hexadecimalArray[power-1-x] = '9';
            } else if (index == 8) {
                hexadecimalArray[power-1-x] = '8';
            } else if (index == 7) {
                hexadecimalArray[power-1-x] = '7';
            } else if (index == 6) {
                hexadecimalArray[power-1-x] = '6';
            } else if (index == 5) {
                hexadecimalArray[power-1-x] = '5';
            } else if (index == 4) {
                hexadecimalArray[power-1-x] = '4';
            } else if (index == 3) {
                hexadecimalArray[power-1-x] = '3';
            } else if (index == 2) {
                hexadecimalArray[power-1-x] = '2';
            } else if (index == 1) {
                hexadecimalArray[power-1-x] = '1';
            } else if (index == 0) {
                hexadecimalArray[power-1-x] = '0';
            }
        }
        
        return (Arrays.toString(hexadecimalArray));
    }
    
    public static int BinaryToDecimal(String binary) {
        int result = 0, power = binary.length()-1;
        for(int x = power; x >= 0; x -= 1){
            result += Integer.parseInt(Character.toString(binary.charAt(power-x))) * (int)Math.pow(2, x);
        }
        
        return result;
    }
    
    public static String BinaryToHexadecimal(String binary) {
        return DecimalToHexadecimal(BinaryToDecimal(binary));
    }
    
    public static int HexadecimalToDecimal(String hexadecimal) {
        int result = 0, power = hexadecimal.length()-1;
        for(int x = power; x >= 0; x -= 1){
            if (hexadecimal.charAt(power-x) == 'F' || hexadecimal.charAt(power-x) == 'f') {
                result += 15 * (int)Math.pow(16, x);
            } else if (hexadecimal.charAt(power-x) == 'E' || hexadecimal.charAt(power-x) == 'e') {
                result += 14 * (int)Math.pow(16, x);
            } else if (hexadecimal.charAt(power-x) == 'D' || hexadecimal.charAt(power-x) == 'd') {
                result += 13 * (int)Math.pow(16, x);
            } else if (hexadecimal.charAt(power-x) == 'C' || hexadecimal.charAt(power-x) == 'c') {
                result += 12 * (int)Math.pow(16, x);
            } else if (hexadecimal.charAt(power-x) == 'B' || hexadecimal.charAt(power-x) == 'b') {
                result += 11 * (int)Math.pow(16, x);
            } else if (hexadecimal.charAt(power-x) == 'A' || hexadecimal.charAt(power-x) == 'a') {
                result += 10 * (int)Math.pow(16, x);
            } else {
                result += Integer.parseInt(Character.toString(hexadecimal.charAt(power-x))) * (int)Math.pow(16, x);
            }
        }
        
        return result;
    }
    
    public static String HexadecimalToBinary(String hexadecimal) {
        return DecimalToBinary(HexadecimalToDecimal(hexadecimal));
    }
}
