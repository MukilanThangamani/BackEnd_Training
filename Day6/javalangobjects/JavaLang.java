package javalangobjects;

public class JavaLang {
    public void getclass(Object obj){
        System.out.println(obj.getClass());
    }
    @Override
    public String toString() {
        return "javalangobjects.JavaLang";
    }

    public static void main(String[] args) {
        JavaLang obj = new JavaLang();
        obj.toString();
        obj.getclass(obj);
    }
}
