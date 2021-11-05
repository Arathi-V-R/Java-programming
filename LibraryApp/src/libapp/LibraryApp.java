package libapp;

import java.util.ArrayList;

public class LibraryApp {
    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn){
        System.out.printf("\nSearching for books with ISBN %s.\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            System.out.printf("1 book found: \n\t Title: %s\n\t Genre: %s\n\t Author: %s" , book.getTitle(), book.getGenre(), book.getAuthor());
        }
        else {
            System.out.println("0 books found");
        }
        System.out.println("\n");
    }

    public void searchByTitle(String keyword){
        System.out.printf("Searching for books with '%s' in the title\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        System.out.printf("%s books found: \n", books.size(), books.size() > 0 ? ":" : ".");
        for (Book book : books){
            System.out.printf("\t Title: %s\n\t Genre: %s\n\t Author: %s\n\t---\n" , book.getTitle(), book.getGenre(), book.getAuthor());
        }
        System.out.println();
    }

    public void checkOutBooks(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            if (book.checkOut()){
                System.out.println("checked out successfully: ");
                System.out.printf("\t ISBN: %s\n\t Title: %s\n\t Author: %s\n\t---\n" , book.getIsbn(), book.getTitle(), book.getAuthor());

            }
            else {
                System.out.println("check out Failed: ");
                System.out.printf("\t ISBN: %s\n\t Title: %s\n\t Author: %s\n\t---\n" , book.getIsbn(), book.getTitle(), book.getAuthor());
                System.out.println("Reason: More books checked out than recorded quantity.");
            }
        }
        else {
            System.out.printf("Failed to check out book.\n");
            System.out.printf("Reason: There is no book with isbn %s on record.\n", isbn);
        }
        System.out.println();
    }

    public void checkInBooks(String isbn){
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null){
            book.checkIn();
            System.out.println("Book checked in successfully: ");
            System.out.printf("\t ISBN: %s\n\t Title: %s\n\t Author: %s\n\t---\n" , book.getIsbn(), book.getTitle(), book.getAuthor());
        }
        else {
            System.out.printf("Failed to check out book.\n");
            System.out.printf("Reason: There is no book with isbn %s on record.\n", isbn);
        }
        System.out.println();
    }
}
