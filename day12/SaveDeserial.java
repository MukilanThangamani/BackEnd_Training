package day12;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SaveDeserial {
    public static void main(String[] args) {
        SaveSerials save = null;
        try {
            FileInputStream fis = new FileInputStream("myname.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            save = (SaveSerials) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
        }
        finally {
            {
                System.out.println("name saved as:"+save.name);
            }
        }
    }
}
