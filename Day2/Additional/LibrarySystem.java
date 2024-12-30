package Additional;

import java.util.Scanner;

public class LibrarySystem {
  public void wel(int id,int cls){
      System.out.println("Welcome to library");
      Scanner in = new Scanner(System.in);
      System.out.println("Give your id:");
      id = in.nextInt();
      System.out.println("ID is:"+id);
      System.out.println("Belongs to which class:");
      cls = in.nextInt();
     if(cls<5){
         System.out.println("Read comics");
     }
     else if(cls>5 && cls<=10){
         System.out.println("read about awarness");
     }
     else{
         System.out.println("read for examinations");
     }
  }
  

    public static void main(String[] args) {
        LibrarySystem sb = new LibrarySystem();
        sb.wel(3,8);
    }

}
