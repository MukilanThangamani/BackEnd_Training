package InheritanceP2;

public class Shape {
    public void area(){
        System.out.println("method in shape");
    }
}
class Rectangle extends Shape{
   static int length = 5;
   static int breadth=5;

    @Override
    public void area(){
        System.out.println("method in rectangle");
    }
}
class Square extends Rectangle{
    public int areaofrect(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Square s = new Square();
        s.area();
        System.out.println(s.areaofrect());
    }
}
