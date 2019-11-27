//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ITECalculator;

import java.util.Scanner;
/**
 *
 * this library use to import Parttern Function
 * which let us limit the range of number or letter
 * we want the user to put in
 */

import java.util.regex.Pattern;

/**
 * @author Dom22king
 * this NumberSystemConversion class is consist of wide ranges of method perform conversion
 * to convert Binary to Decimal
 * To convert Binary to Octal
 * To convert Binary to Hexadecimal
 * To convert Octal to Decimal
 * To convert Octal to Binary
 * To convert Octal to Hexadecimal
 * To convert Decimal to Binary
 * To convert Decimal to Octal
 * To convert Decimal to Hexadecimal
 * To convert HexaDecimal to Binary
 * To convert HexaDecimal to Octal
 * To convert HexaDecimal to Decimal
 * 
 */


public class NumberSystemConversion {
    static String result = "";
    static Scanner user_in;
    static String binaryString;
    static String OctalString;
    static String DecimalString;
    static String HexaString;
    static int p;
    static int Octal;
    static char[] hexaChar;
    static String binaryPattern;
    static String DecimalPattern;
    static String HexaPattern;
    static String OctalPattern;
    static int decimal;
    static int binary;
    static int result_decimal;
    static int result_Octal;
    
    
   // Contruction
    public NumberSystemConversion() {     }
    
     static {
        user_in = new Scanner(System.in);
        Octal = 0;
        hexaChar = new char[]{'F', 'E', 'D', 'C', 'B', 'A'};
        binaryPattern = "(1*0*)*";
        OctalPattern = "(7*6*5*4*3*2*1*0*)*";
        DecimalPattern = "(9*8*7*6*5*4*3*2*1*0*)*";
        HexaPattern = "(F*E*D*C*B*A*f*e*d*c*b*a*9*8*7*6*5*4*3*2*1*0*)*";
        decimal = 0;
        result_Octal = 0;
    }

     //                     Binary Method
     
     /**
      * this method is use for converting
      * binary into decimal * 
      * use if conditional in this method
      * for protect the error when user input
      * wrong element by Matching binaryPatern
      * with the binaryString input
      * to convert we need to modulo to get each 
      * remnant (Somnol) then divide binary with
      * 10 and take the remnant multiply with 2 power
      * with it own location
      * 
      */
    static int binary2decimal() {
        decimal=0;
        getBinary();
         binary = Integer.parseInt(binaryString);
         for(int i = 0; i < binaryString.length(); ++i) {
                p = binary % 10;
                binary /= 10;
                decimal = (int)(decimal + p * Math.pow(2, i));  
         }
                return decimal;
    }
    
    
    static void binary_2_Decimal(){
     if (!isVailBinary()){
      System.out.println("your input is wrong from Binary type please make sure to read agian");}
     
      else { 
         binary2decimal();
         System.out.println("Your Decimal is =\t"+decimal);
         }
         
      
  }

 
    
    /**
     * this method use for converting 
     * binary into Octal before we convert 
     * to Octal. We need to convert it into 
     * decimal first by using binary2decimal();
     * method.After we Convert to Decimal ,
     * we need to convert decimal to Octal 
     * by modulo decimal with 8 and multiply 
     * with 10 in every time it loop
     * for the Octal_old = Octal - Octal_Old
     * we use this because the function is store the 
     * value in every calculator so we need to minus 
     * the old one out
     * 
     */

    static void binary_2_Octal() {
        
          if (!isVailBinary()){
      System.out.println("your input is wrong from Binary type please make sure to read agian");}
      
          else { 
      binary2decimal();
      
            int i = 1;
            Octal=0;
            
       while(decimal != 0) {
            Octal += decimal % 8 * i;
            decimal /= 8;
            i *= 10;
       } 
        System.out.println("so\tOctal = " + Octal );
    }
    }
    
    
     static String decimal2hexadecimal(int decimal1) {
        String result_old;
        
        //hexaChar = new char[]{'F', 'E', 'D', 'C', 'B', 'A'};
        for(result_old = result; decimal1 > 0; decimal1 /= 16) {
            int reminder = decimal1 % 16;         //variable to store 
            if (reminder > 9) {
                result = hexaChar[15 - reminder] + result;
            } else {
                result = reminder + result;
            }
        } 
        if (decimal1==0){
        System.out.println("So\tHexadecimal = 0");
        }
        else{

        String new_string = result.replace(result_old, "");
        System.out.println("So\tHexadecimal = " + new_string);}
        return result;
    }


  


    static void binary_2_hexadecimal() {
        
         if (!isVailBinary()){
      System.out.println("your input is wrong from Binary type please make sure to read agian");}
         
      else { 
        binary2decimal();
        decimal2hexadecimal(decimal);
  }
      
    }
    //      Octal Method
    
    static void Octal2decimal() {
        System.out.println("Please input your Octal number :");
        OctalString = user_in.nextLine();
        if (Pattern.compile(OctalPattern).matcher(OctalString).matches()) {
            Octal = Integer.parseInt(OctalString);
            int result_Octal_old = result_Octal;

            for(int i = 0; i < OctalString.length(); ++i) {
                p = Octal % 10;
                result_Octal = (int)((double)result_Octal + (double)p * Math.pow(8.0D, (double)i));
                Octal /= 10;
            }

            result_Octal -= result_Octal_old;
        } else {
            System.out.println("\n|Not Octal number => Please make sure your input is among 0 to 7|\n");
        }

    }

    static void Oclal_2_Decimal() {
        Octal2decimal();
        System.out.println("So\tDecimal =" + result_Octal);
    }

    static void Octal_2_Binary(int Binary) {
        Octal2decimal();
        int[] binary = new int[50];

        int index;
        for(index = 0; result_Octal > 0; result_Octal /= 2) {
            binary[index++] = result_Octal % 2;
        }

        System.out.print("\nSo\tBinary =");

        for(int i = index - 1; i >= 0; --i) {
            System.out.print(binary[i]);
        }

        System.out.print("\n");
    }

    static void Oclal_2_Hexadecimal(int Octal) {
        Octal2decimal();
        decimal2hexadecimal(result_Octal);
    }

   static void decimal2Binary( int decimal){
       
       System.out.println("Please input your Decimal :");
        DecimalString = user_in.nextLine();
        if (Pattern.compile(DecimalPattern).matcher(DecimalString).matches()) {
            decimal = Integer.parseInt(DecimalString);
        int[] binary = new int[50];

       int index;
        for(index = 0; decimal > 0; decimal /= 2) {
            binary[index++] = decimal % 2;
        }

        System.out.print("\nSo\tBinary =");

        for(int i = index - 1; i >= 0; --i) {
            System.out.print(binary[i]);
        }

        System.out.print("\n");
        } else {
            System.out.println("\n|Not Decimal => Please make sure you put number 1 to 10|\n");
        }
       
    }
   static void decimal2Octal(int decimal){
       
        System.out.println("Please input your Decimal :");
        DecimalString = user_in.nextLine();
        if (Pattern.compile(DecimalPattern).matcher(DecimalString).matches()) {
            decimal = Integer.parseInt(DecimalString);
        int i = 1;
        int Octal_old = Octal;
       while(decimal != 0) {
            Octal += decimal % 8 * i;
            decimal /= 8;
            i *= 10;
        } Octal -= Octal_old;
         System.out.println("so\tOctal = " + Octal);
         
        } else {
            System.out.println("\n|Not Decimal => Please make sure you put number 1 to 10|\n");
        } 
   
    }
   static void decimal2Hexadecimal(int decimal){
       System.out.println("Please input your Decimal :");
        DecimalString = user_in.nextLine();
        if (Pattern.compile(DecimalPattern).matcher(DecimalString).matches()) {
            decimal = Integer.parseInt(DecimalString);
            
         decimal2hexadecimal( decimal);
         
        } else {
            System.out.println("\n|Not Decimal => Please make sure you put number 1 to 10|\n");
        } 
        
   }
//          Hexadecimal Method
    
    static void Hex2Binary(){
        
        System.out.println("Please input your Hexadecimal number :");
        HexaString = user_in.nextLine();
        if (Pattern.compile(HexaPattern).matcher(HexaString).matches()) {
            
            
            String digits = "0123456789ABCDEF";
            HexaString= HexaString.toUpperCase();
            int val = 0;
             
             for (int i = 0; i < HexaString.length(); i++)
             {
                 char c = HexaString.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
                 
            } 
             int[] binary = new int[50];

            int index;
            for(index = 0; val > 0; val /= 2) {
            binary[index++] = val % 2;
            }

            System.out.print("\nSo\tBinary =");

            for(int i = index - 1; i >= 0; --i) {
            System.out.print(binary[i]);
            } System.out.print("\n");  

                
        } else {
            System.out.println("\n|Not Hexadecimal => Please make sure you put the write digit or number|\n");
        }
    }
    static int Hex2decimal()
            
    {  
    
        System.out.println("Please input your Hexadecimal number :");
        HexaString = user_in.nextLine();
        if (Pattern.compile(HexaPattern).matcher(HexaString).matches()) {
            
            
            String digits = "0123456789ABCDEF";
            HexaString= HexaString.toUpperCase();
            int val = 0;
             
             for (int i = 0; i < HexaString.length(); i++)
             {
                 char c = HexaString.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
                 
            }
             System.out.println("So\tHexa = "+val);

        
        } else {
            System.out.println("\n|Not Hexadecimal => Please make sure you put the write digit or number|\n");
        }
        return 0;
    }
             
   static void Hex2Octal(){
     int j;
        int octnum[] = new int[50];
       System.out.println("Please input your Hexadecimal number :");
        HexaString = user_in.nextLine();
        
        if (Pattern.compile(HexaPattern).matcher(HexaString).matches()) {

            String digits = "0123456789ABCDEF";
            HexaString= HexaString.toUpperCase();
             int val = 0;
             
             for (int i = 0; i < HexaString.length(); i++)
             {
                 char c = HexaString.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
                 
            }
             int i=1;
             while(val != 0)
        {
            octnum[i++] = val%8;
            val = val/8;
        }
		
        System.out.print("Equivalent Octal Number is :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(octnum[j]);
        }
        } else {
            System.out.println("\n|Not Hexadecimal => Please make sure you put the write digit or number|\n");
        }
      
      
    }
 static  boolean isVailBinary(){
 int binary;
User_input();
        
        if (Pattern.compile(binaryPattern).matcher(binaryString).matches()) {
            binary = Integer.parseInt(binaryString);
 
          return true;
        }else 
            return false;
 }
  
 static void check_time( ){
  if (!isVailBinary()){
      System.out.println("your input is wrong from Binary type please make sure to read agian");}
      else { 
      User_input();
      
      System.out.println("Nice"+binaryString);
  }
}
 
 static String User_input(){
      System.out.println("Please input your Binary :");
        binaryString = user_in.nextLine();
        return binaryString;
 }
 
 static String getBinary(){
     return binaryString;
}
 
 
 }
 

