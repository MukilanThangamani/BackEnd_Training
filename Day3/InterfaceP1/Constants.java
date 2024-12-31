package InterfaceP1;

interface Constants {
    static double PI = 3.14;
}
class Circle implements Constants{
    int r = 4;
    public void areaofcircle(){
        System.out.println("area of circe = "+PI*r*r);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.areaofcircle();
    }
}
