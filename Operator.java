//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ITECalculator;

import static ITECalculator.ITECalculator.D;
import java.util.Scanner;

public class Operator  {
    static Scanner in;

    public Operator() {
    }

    static float sin(float degree) {
        degree = (float)Math.toRadians(ITECalculator.D);
        System.out.print("\n\tsin (Degree):   ");
        System.out.println(Math.sin((double)degree));
        return 0;
    }

    static float sind(float radian) {
        radian =  (float) (double) D ;
        System.out.print("\n\tsin (Radian):   ");
        System.out.println(Math.sin((double)radian));
        return 0;
    }

    static float cos(float radian) {
        radian =  (float) (double) D ;
        System.out.print("\n\tcos (Radian):   ");
        System.out.println(Math.cos((double)radian));
        return 0;
    }

    static float cosd(float degree) {
        degree = (float)Math.toRadians(ITECalculator.D);
        System.out.print("Your input is Radian changes to Degree:" + degree + "\n\tcos (Degree):   ");
        System.out.println(Math.cos((double)degree));
        return degree;
    }

    static float tan(float radian) {
        radian = (float)Math.toRadians(ITECalculator.D);
        System.out.print("Your input is Degree changes to Radian:" + radian + "\n\ttan (Radian):   ");
        System.out.println(Math.tan((double)radian));
        return 0.0F;
    }

    static float tand(float degree) {
        degree = (float)Math.toDegrees(ITECalculator.D);
        System.out.print("Your input is Radian changes to Degree:" + degree + "\n\ttan (Degree):   ");
        System.out.println(Math.tan((double)degree));
        return degree;
    }

    static long square2(long longx) {
        longx = in.nextLong();
        System.out.println(longx + "  square2=\t" + (long)Math.pow((double)longx, 2.0D));
        return longx;
    }

    static double square2(double doublex) {
        Bitwise.Scannin_one();
        doublex = in.nextDouble();
        System.out.println(doublex + "  square2=\t" + Math.pow(doublex, 2.0D));
        return doublex;
    }

    static long square3(long longx) {
        Bitwise.Scannin_one();
        longx = in.nextLong();
        System.out.println(longx + "  square3=\t" + (long)Math.pow((double)longx, 3.0D));
        return longx;
    }

    static double square3(double doublex) {
        Bitwise.Scannin_one();
        doublex = in.nextDouble();
        System.out.println(doublex + "  square3:\t" + Math.pow(doublex, 3.0D));
        return doublex;
    }

    public static double DegreeToRadian() {
        System.out.print("Degree" + ITECalculator.D + "Radian= " + ITECalculator.D * 3.141592653589793D / 180.0D);
        return (double)ITECalculator.radian;
    }

    static {
        in = new Scanner(System.in);
    }
}
