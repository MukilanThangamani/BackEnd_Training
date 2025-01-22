package ConsumerModify;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ModifyStud {
    /*public static void modify(List<Stu> list, Consumer<Stu> cons){
        for(Stu in : list){
            if(cons.accept(in)){

            }
        }
    }*/
    public static void main(String[] args) {
        List<Stu> list = new ArrayList<>();
        list.add(new Stu("John",70));
        list.add(new Stu("Alice",60));

        Consumer<Stu> cons = (mark)-> System.out.println(mark.getGrade()+10);
        list.forEach(cons);
    }
}
