import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KangarooProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        compute(x1, v1, x2, v2, 0, Integer.MAX_VALUE);
    }
    
    public static void compute(int x1, int v1, int x2, int v2, long start, long end) {
        if (start > end) {
            System.out.println("NO");
            return;
        }
        if (x1 == x2) {
            System.out.println("YES");
            return;
        }
        if ((x1 < x2) && (v1 <= v2)) {
            System.out.println("NO");
            return;
        }
        
        long middle = ((end - start) /2) + start ;
        
        long resultX1 = (middle*v1)+x1;
        long resultX2 = (middle*v2)+x2;

        if (resultX1 == resultX2) {
            System.out.println("YES");
        } else if (resultX1 < resultX2) {
            compute(x1, v1, x2, v2, middle + 1, end);
        } else {
            compute(x1, v1, x2, v2, start, middle - 1);
        }
        
    }
        
}
