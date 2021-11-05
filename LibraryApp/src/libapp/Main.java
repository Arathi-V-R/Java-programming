package libapp;

public class Main {

    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        app.searchByIsbn("25274");
        app.searchByTitle("castle");
        app.searchByTitle("dagger");


        /*app.checkOutBooks("06917");
        app.checkOutBooks("25274");
        app.checkInBooks("65423");
        app.checkOutBooks("25274");
        app.checkOutBooks("25274");
        app.checkOutBooks("25274");
        app.checkOutBooks("25274");*/
    }
}
