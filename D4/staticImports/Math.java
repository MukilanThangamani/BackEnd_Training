package staticImports;
import java.util.Scanner;

import static java.lang.Math.*;

public class Math {
    public void rightangletri(double sq,double po){
        System.out.println("Right angle triangle: "+sqrt(pow(sq,2)+pow(po,2)));
    }
    public static void main(String[] args) {
        Math obj = new Math();
        Scanner in = new Scanner(System.in);
        double sq = in.nextDouble();
        double po = in.nextDouble();
        obj.rightangletri(sq,po);
    }
}
