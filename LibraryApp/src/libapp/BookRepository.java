package libapp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository(){

        books.add(new Book("83471", "the dead of night", "Horror", null,"S. K. Eleton", 10, 7));
        books.add(new Book("25274", "castles and crenellations", "Historical", null,"H P Anderson", 5, 1));
        books.add(new Book("51573", "the knight's sword", "Fantasy", null,"F. E. Anvil", 4, 0));
        books.add(new Book("65423", "castle siege", "Historical", null,"N. N. Blacksmith", 8, 2));
    }
    public Book findByIsbn(String isbn){
        for (Book book : books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound = new ArrayList<>();
        for (Book book : books){
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
