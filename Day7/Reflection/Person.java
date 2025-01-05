package Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Ref;

public class Person {
    public static void main(String[] args) {
        try {
            Class cl = Class.forName("Reflection.ReflectionExample");

            System.out.println("Methods :");
            Method[] method = cl.getDeclaredMethods();
            for(int i=0;i<method.length;i++){
                System.out.println("Method Name:"+method[i].getName());
                System.out.println(method[i]);
            }
            System.out.println();
            System.out.println("Fields:");
            Field[] field = cl.getDeclaredFields();
            for(int i=0;i< field.length;i++){
                System.out.println("Field Name:"+field[i].getName());
                System.out.println(field[i].getType());
            }
            System.out.println();
            System.out.println("Constructors:");
            Constructor[] construct = cl.getDeclaredConstructors();
            for(int i=0;i< construct.length;i++){
                System.out.println(construct);
            }
            System.out.println();
            System.out.println("consPara types");
            for(int i=0;i<construct.length;i++){
                System.out.println("Constructor name:"+construct[i].getName());
                System.out.println(construct[i].getParameterTypes());
            }

            ReflectionExample obj = (ReflectionExample)construct[1].newInstance(7,"hari",85);
            for(int i=0;i<method.length;i++){
                if(method[i].getName().indexOf("details")!=-1){
                    method[i].invoke(obj);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
