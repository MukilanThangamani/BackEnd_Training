package Constuctors;

public class Book {
    String title="pirates of carribean";
    String author = "Stephen flemming";
    public Book(){
        System.out.println(" Title is "+title+" and author is "+author);
    }

    public static void main(String[] args)
    {
        Book bk = new Book();
    }
}
