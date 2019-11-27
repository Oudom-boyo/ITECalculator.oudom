//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ITECalculator;

import java.util.Scanner;

public class Bitwise {
    static Scanner in;

    public Bitwise ( ) { }

    static void Scannin_one ( ) {
        System.out.print ( "Plese enter your number to calculate :" );
    }

    static void Scannin ( ) {
        System.out.print ( "Plese enter your first number:" );
        ITECalculator.a = in.nextInt ( );
        System.out.print ( "Please enter your second number:" );
        ITECalculator.b = in.nextInt ( );
    }

    static void Bitshift ( ) {
        System.out.print ( "Plese enter your first number:" );
        ITECalculator.a = in.nextInt ( );
        System.out.print ( "Please input  your shift amount number:" );
        ITECalculator.shift_amount = in.nextInt ( );
    }

    static void OR_OPerator ( ) {
        Scannin ( );
        System.out.println ( " OR OPerator: " );
        System.out.println ( "a|b = " + ( ITECalculator.a | ITECalculator.b ) + "\t  Binary:" + Integer.toBinaryString ( ITECalculator.a | ITECalculator.b ) );
    }

    static void XOR_OPerator ( ) {
        Scannin ( );
        System.out.println ( "  XOR OPerater" );
        System.out.println ( "a^b = " + ( ITECalculator.a ^ ITECalculator.b ) + "\t  Binary:" + Integer.toBinaryString ( ITECalculator.a ^ ITECalculator.b ) );
    }

    static void Bitwise_Inversion_OPerator ( ) {
        Scannin_one ( );
        ITECalculator.a = in.nextInt ( );
        System.out.println ( "Bitwise_Inversion_OPerator" );
        System.out.println ( "~a = " + ~ITECalculator.a + "\t  Binary:" + Integer.toBinaryString ( ~ITECalculator.a ) );
    }

    static void Leftshift ( ) {
        Bitshift ( );
        System.out.println ( "Leftshift" );
        ITECalculator.c = ITECalculator.a << ITECalculator.shift_amount;
        System.out.println ( " a <<" + ITECalculator.shift_amount + "=\n" + ITECalculator.c + "\t\tBinary =  " + Integer.toBinaryString ( ITECalculator.c ) );
    }

    static void Rightshift ( ) {
        Bitshift ( );
        System.out.println ( "Rightshift" );
        ITECalculator.c = ITECalculator.a >> ITECalculator.shift_amount;
        System.out.println ( " a >> " + ITECalculator.shift_amount + "=\n" + ITECalculator.c + "\t\tBinary = " + Integer.toBinaryString ( ITECalculator.c ) );
    }

    static void Logicaland ( ) {
        System.out.println ( "Logical and" );
        System.out.println ( "a&b = " + ( ITECalculator.a & ITECalculator.b ) + "\t  Binary:" + Integer.toBinaryString ( ITECalculator.a & ITECalculator.b ) );
    }

    static {
        in = new Scanner ( System.in );
    }
}
