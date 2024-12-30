package ThisMethodOverloading;

public class CalaculatingArea {
     int l;
     int b;
     int r;
    public int areaofRect(){
        return l*b;
    }
    public double areaofCir(){
        return 3.14*r*r;
    }
    public int areaofTri(){
        return (l * b) /2;
    }
    public static void main(String[] args) {
        CalaculatingArea obj = new CalaculatingArea();
        obj.b=6;
        obj.l = 4;
        obj.r=2;
        System.out.println("Area of Rect:"+obj.areaofRect());
        System.out.println("Area of circle:"+obj.areaofCir());
        System.out.println("Area of triangle:"+obj.areaofTri());
    }
}
