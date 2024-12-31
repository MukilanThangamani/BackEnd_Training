package Abstract;

abstract class Shape {
    abstract void calculateArea();
}
class Circle extends Shape {
    int r = 2;
    public void calculateArea(){
        System.out.println("area of circle:"+3.14*r*r);
    }
}
class Rectangle extends Shape{
    int l = 2;
    int b = 3;
    public void calculateArea(){
        System.out.println("area of rect:"+ l*b);
    }

    public static void main(String[] args) {
        Shape s = new Circle();
        s.calculateArea();
        Shape s1 = new Rectangle();
        s1.calculateArea();
    }
}
