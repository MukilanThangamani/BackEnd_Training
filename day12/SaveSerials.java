package day12;

import java.io.*;

public class SaveSerials implements Externalizable {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws  Exception {
        SaveSerials obj1 = new SaveSerials();
        // obj1.name = "Training";
        obj1.setName("java");
        File f = new File("myname.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);
        System.out.println("By external:"+obj1.getName());
        fos.close();
        oos.close();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
    }
}
