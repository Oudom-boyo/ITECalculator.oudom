        //
        // Source code recreated from a .class file by IntelliJ IDEA
        // (powered by Fernflower decompiler)
        //

        package ITECalculator;


        import java.util.Scanner;


        public class ITECalculator extends Operator {

        public static String  user_input;
        static        int     a;
        static        int     b;
        static        int     add;
        static        int     min;
        static        int     mul;
        static        int     mod;
        static        int     Userchoose;
        static        int     c;
        static        int     choose;
        static        int     decimal;
        static        int     Arithmathic_choose;
        static        int     shift_amount;
        public static int     Trigonometric_choose;
        public static int     Bitwise_choose;
        public static int     Square_choose;
        public static Double  D = null;
        public static float   radian;
        public static double  doublex;
        public static long    longx;
        public static long    numByte;
        public static float   degree;
        public static int     Numbersystemconversion_choose;
        public static int     binary;
        public static int     octal;
        public static int     Storageconverter_Choose;
        /**
         * using in while loop to break ;
         */
        public        boolean Loop;
        


        public static void main ( String[] args ) {

            ITECalculator C;
            C = new ITECalculator ( );
            C.Creat_Menu ( );
        }

        static int sum ( ) {
            Bitwise.Scannin ( );
            add = a + b;
            System.out.println ( "Sum Result:" + add );
            return add;
        }

        static double divide ( ) {
            Bitwise.Scannin ( );
            double div = (double) a / (double) b;
            System.out.println ( "Divide Result:" + div );
            return div;
        }

        static int minus ( ) {
            Bitwise.Scannin ( );
            min = a - b;
            System.out.println ( "Minus Result:" + min );
            return min;
        }

        static int multiply ( ) {
            Bitwise.Scannin ( );
            mul = a * b;
            System.out.println ( "Multiple Result:" + mul );
            return mul;
        }

        static int modulo ( ) {
            Bitwise.Scannin ( );
            mod = a % b;
            System.out.println ( "Modulo Result:" + mod );
            return mod;
        }

        void Creat_Menu ( ) {
            while ( true ) {
                Scanner user_input = new Scanner ( System.in );

                System.out.print ( " \nEnter your choose number:\n main manu \n\t=>1 for Arithmrthic Operators \n\t=>2 for Trigonometric Operators \n\t=>3 for Bitwise Operator"
                                   + " \n\t=>4 for square \n\t=>5 for StorageConverter \n\t=>6 for Number System Conversion \n\t\t your INPUT :" );
                Userchoose = user_input.nextInt ( );

                switch ( Userchoose ) {
                    case 1:
                        Loop:while ( true ) {
                            System.out.print ( "\nyou choose Arithmrthic : Enter\n \n\t=>1 for sum \n\t=>2 for Minus \n\t=>3 for Multiply \n\t=>4 for Divide \n\t=> 5 for Modulo"
                                               + "\n\t=>6 for Exit to main menu \n\t\t INPUT = " );

                            Arithmathic_choose = user_input.nextInt ( );

                            switch ( Arithmathic_choose ) {
                                case 1:
                                    sum ( );
                                    continue;
                                case 2:
                                    minus ( );
                                    continue;
                                case 3:
                                    multiply ( );
                                    continue;
                                case 4:
                                    divide ( );
                                    continue;
                                case 5:
                                    modulo ( );
                                case 6:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                            }
                        }
                        break;


                    case 2:
                        Loop:while ( true ) {
                            System.out.print ( "\nyou choose Trigonometric : Enter\n \n\t=>1 for Sin in Degree \n\t=>2 for Sin  in Radian \n\t=>3 Cos in Radian \n\t=>4 for Cos in Degree "
                                               + " \n\t=>5 for Tan in Radian \n\t=>6 for Tan in Degree \n\t=>7 for Exit to main menu \n\t\tINPUT = " );
                            Trigonometric_choose = in.nextInt ( );

                            switch ( Trigonometric_choose ) {
                                case 1:
                                    System.out.print ( "\n\t\t\tPlease in put your Degree  :\t\t" );
                                    D = user_input.nextDouble ( );
                                    Operator.sin ( radian );
                                    continue;
                                case 2:
                                    System.out.print ( "\n\t\t\tPlease in put your Radian  :\t\t" );
                                    D = user_input.nextDouble ( );
                                    sind ( degree );
                                    continue;
                                case 3:
                                    System.out.print ( "\n\t\t\tPlease in put your Radian  :\t\t" );
                                    D = user_input.nextDouble ( );
                                    cos ( radian );
                                    continue;
                                case 4:
                                    System.out.print ( "\n\t\t\tPlease in put your Degree  :\t\t" );
                                    D = user_input.nextDouble ( );
                                    cosd ( degree );
                                    continue;
                                case 5:
                                    System.out.print ( "\n\t\t\tPlease in put your Radian  :\t\t" );
                                    D = user_input.nextDouble ( );
                                    tan ( radian );
                                    continue;
                                case 6:
                                    System.out.print ( "\n\t\t\tPlease in put your Degree  :\t\t" );
                                    D = user_input.nextDouble ( );
                                    tand ( degree );
                                    continue;
                                case 7:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                            }
                        }
                        break;
                    case 3:
                        Loop:while ( true ) {
                            System.out.print ( "you choose Bitwise Enter\n \n\t=>1 for Logicaland \n\t=> 2 for OR_OPerator \n\t=> 3 for XOR_OPerator \n\t=> 4 for Bitwise_Inversion_OPerator "
                                               + "\n\t=> 5 for Leftshif \n\t=> 6 for Rightshift =>7 for Exit to main menu \n\t\t INPUT = " );
                            Bitwise_choose = user_input.nextInt ( );
                            switch ( Bitwise_choose ) {
                                case 1:
                                    Bitwise.Logicaland ( );
                                    continue;
                                case 2:
                                    Bitwise.OR_OPerator ( );
                                    continue;
                                case 3:
                                Bitwise.XOR_OPerator ( );
                                    continue;
                                case 4:
                                    Bitwise.Bitwise_Inversion_OPerator ( );
                                    continue;
                                case 5:
                                    Bitwise.Leftshift ( );
                                    continue;
                                case 6:
                                    Bitwise.Rightshift ( );
                                    continue;
                                case 7:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                            }
                        }
                        break;
                    case 4:
                        Loop:while ( true ) {
                            System.out.print ( "you choose Square:  Enter\n \n\t=>1 for Square2  \n\t=>2 for square 3 \n\t=>3 for Square 2 with float "
                                               + "\n\t=>4 for for Square 3 with float \n\t=>5 for Convert from Byte to Kilobye \n\t=>6 for Exit to main menu\n\t\t INPUT = " );
                            Square_choose = user_input.nextInt ( );
                            switch ( Square_choose ) {
                                case 1:
                                    Operator.square2 ( longx );
                                    continue;
                                case 2:
                                    square3 ( longx );
                                    continue;
                                case 3:
                                    square2 ( doublex );
                                    continue;
                                case 4:
                                    square3 ( doublex );
                                    continue;
                                case 5:
                                    StorageConverter.byte2_KB ( longx );
                                case 6:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                            }
                        }
                        break;
                    case 5:
                        System.out.print ( "\nyou choose StorageConverter: Enter\n  \n\t=>1 for ByteConverter  \n\t 2 for KilobyeConverter \n\t 3 for  MegabyteConverter \n\t 4 for GigabiteConverter "
                                           + "\n\t 5 for TerabyeConverter \n\t\t INPUT = " );
                        Storageconverter_Choose = user_input.nextInt ( );
                        switch ( Storageconverter_Choose ) {

                            case 1:
                                break;

                        }
                    
                    
                    case 6:
                        Loop:while ( true ) {
                            System.out.print ( "you choose Number System Conversion:  Enter\n \n\t=>1 for Converting Binary  \n\t=>2 for Converting Octal"
                                               + "\n\t=>3 for Converting Decimal \n\t=>4 for Converting  HexaDecimal  "
                                               +" \n\t=>5 for Exit to main menu \n\t\t INPUT = " );

                            Numbersystemconversion_choose = user_input.nextInt ( );
                            switch ( Numbersystemconversion_choose ) {

                                case 1:
                                    
                        while(true){
                        System.out.print ( "you choose Binary:  Enter\n \n\t=>1 for Converting Binary to Decimal  \n\t=>2 for Converting Binary to Octal"
                                               + " \n\t=>3 for Converting Binary to HexaDecimal"
                                               + "\n\t=>4 for Exit to main menu \n\t\t INPUT = " );
                        choose = user_input.nextInt ( );
                        switch(choose){
                            case 1:
                                    NumberSystemConversion.binary_2_Decimal();
                                    continue;
                                case 2:
                                    NumberSystemConversion.binary_2_Octal (  );
                                    continue;
                                case 3:
                                    NumberSystemConversion.binary_2_hexadecimal (  );
                                    continue;
                                case 4:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                             }
                        }
                                    
                                case 2:
                                    while(true){
                        System.out.print ( "you choose Octal:  Enter\n \n\t=>1 for Converting Octal to Decimal "
                                               + "\n\t=>2 for Converting Octal to Binary \n\t=>3 for Converting Octal to Hexadecimal "
                                                + "\n\t=>4 for Exit to main menu \n\t\t INPUT = " );
                       choose = user_input.nextInt ( );
                        switch(choose){
                                case 1:
                                    NumberSystemConversion.Oclal_2_Decimal ( );
                                    continue;
                                case 2:
                                    NumberSystemConversion.Octal_2_Binary ( octal );
                                    continue;
                                case 3:
                                    NumberSystemConversion.Oclal_2_Hexadecimal(octal);
                                    continue;
                                case 4:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                            }break;
                        }
                                case 3:
                                    while ( true ){
                        System.out.print ( "you choose Decimal:  Enter\n \n\t=>1 for Converting Decimal to Binary\n\t=>2 for Converting Decimal to Octal"
                                               + " \n\t=>3 for Converting Decimal to HexaDecimal\n\t=>4 for Exit to main menu \n\t\t ");
                                   choose  = user_input.nextInt ( );
                                   switch (choose){
                                        case 1:
                                            NumberSystemConversion. decimal2Binary( decimal);
                                            continue;
                                        case 2:
                                            NumberSystemConversion. decimal2Octal (decimal);
                                            continue;
                                        case 3:
                                            NumberSystemConversion. decimal2Hexadecimal(decimal);
                                            continue;
                                        case 4: 
                                            break Loop ;
                                        default:
                                    System.out.println ( "Please make sure you read the instruction " );
                                   }break;
                                  }
                                case 4:
                                    while ( true ){
                        System.out.print ( "you choose Decimal:  Enter\n \n\t=>1 for Converting Hexadecimal to Binary\n\t=>2 for Converting Hexadecimal to Octal"
                                               + " \n\t=>3 for Converting Hexadecimal to Decimal \n\t=>4 for Exit to main menu \n\t\t ");
                                   choose  = user_input.nextInt ( );
                                   switch (choose){
                                        case 1:
                                            NumberSystemConversion.Hex2Binary();
                                            continue;
                                        case 2:
                                            NumberSystemConversion.Hex2Octal();
                                            continue;
                                        case 3:
                                            NumberSystemConversion.Hex2decimal();
                                            continue;
                                        
                                        case  4:
                                             NumberSystemConversion.check_time();
                                            continue;
//                                        case 5 :
//                                             NumberSystemConversion.binarytodecimalnew();
//                                            continue;
                                        case 6: 
                                           break Loop ;

                                            
                                        default:
                                    System.out.println ( "Please make sure you read the instruction " );
                                   }break;
                                  }
                               
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                            }
                        }
                        break;
                        /*case 7:
                        Loop:while(true){
                        System.out.print ( "you choose Binary:  Enter\n \n\t=>1 for Converting Binary to Decimal  \n\t=>2 for Converting Binary to Octal"
                                               + " \n\t=>3 for Converting Binary to HexaDecimal"
                                               + "\n\t=>4 for Exit to main menu \n\t\t INPUT = " );
                        choose = user_input.nextInt ( );
                        switch(choose){
                            case 1:
                                    NumberSystemConversion.binary_2_Decimal ( binary );
                                    continue;
                                case 2:
                                    NumberSystemConversion.binary_2_Octal (  );
                                    continue;
                                case 3: while ( true ){
                        System.out.print ( "you choose Decimal:  Enter\n \n\t=>1 for Converting Decimal to Binary\n\t=>2 for Converting Decimal to Octal"
                                               + " \n\t=>3 for Converting Decimal to HexaDecimal\n\t=>4 for Exit to main menu \n\t\t ");
                                   choose  = user_input.nextInt ( );
                                   switch (choose){
                                        case 1:
                                            NumberSystemConversion. decimal2Binary( decimal);
                                            continue;
                                        case 2:
                                            NumberSystemConversion. decimal2Octal (decimal);
                                            continue;
                                        case 3:
                                            NumberSystemConversion. decimal2Hexadecimal(decimal);
                                            continue;
                                        case 4: 
                                            break Loop ;
                                        default:
                                    System.out.println ( "Please make sure you read the instruction " );}
                                  }
              
                                case 4:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                             }
                        }
                    case 8:
                         Loop:while(true){
                        System.out.print ( "you choose Octal:  Enter\n \n\t=>1 for Converting Octal to Decimal "
                                               + "\n\t=>2 for Converting Octal to Binary \n\t=>3 for Converting Octal to Hexadecimal "
                                                + "\n\t=>4 for Exit to main menu \n\t\t INPUT = " );
                       choose = user_input.nextInt ( );
                        switch(choose){
                                case 1:
                                    NumberSystemConversion.Oclal_2_Decimal ( );
                                    continue;
                                case 2:
                                    NumberSystemConversion.Octal_2_Binary ( octal );
                                    continue;
                                case 3:
                                    NumberSystemConversion.Oclal_2_Hexadecimal(octal);
                                    continue;
                                case 4:
                                    break Loop;
                                default:
                                    System.out.println ( "Please make sure you read the instruction " );
                            }
                        }
                    
                    case 9 :  
                        Loop:while ( true ){
                        System.out.print ( "you choose Decimal:  Enter\n \n\t=>1 for Converting Decimal to Binary\n\t=>2 for Converting Decimal to Octal"
                                               + " \n\t=>3 for Converting Decimal to HexaDecimal\n\t=>4 for Exit to main menu \n\t\t ");
                                   choose  = user_input.nextInt ( );
                                   switch (choose){
                                        case 1:
                                            NumberSystemConversion. decimal2Binary( decimal);
                                            continue;
                                        case 2:
                                            NumberSystemConversion. decimal2Octal (decimal);
                                            continue;
                                        case 3:
                                            NumberSystemConversion. decimal2Hexadecimal(decimal);
                                            continue;
                                        case 4: 
                                            break Loop;
                                        default:
                                    System.out.println ( "Please make sure you read the instruction " );}
                                  }*/
                 default:
                                    System.out.println ( "Please make sure you read the instruction " );
                break;
            }
        }
        }
        }