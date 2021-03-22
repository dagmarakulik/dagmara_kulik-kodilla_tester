package task_2_7;

public class BookApplication {
    public static void main(String [] args){
        Book myBook = Book.of("J.R.R. Tolkien", "The Lord of the Rings" );
        System.out.println(myBook.getAuthor() + " - " + myBook.getTitle());
    }
}
