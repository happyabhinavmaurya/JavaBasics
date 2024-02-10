package oops.LibraryManagementSystem;

public class Library {

    public static void main(String[] args) {

        // Adding First Book
        Book.BookDetails book1 = new Book.BookDetails("Shanvi", "Abhinav Suman", "Autobiography", "2023AS310", "Available");
        Book.BookDetails book2 = new Book.BookDetails("Shanav", "Abhinav Suman", "Story", "2023AS210", "Available");

        book1.displayBookDetails();

        String[][] table = {
                {"Title", "Author", "Genre", "ISBN", "Availability"},
                {"Shanvi", "Abhinav Suman", "Autobiography", "2023AS310", "Available"},
                {"Shanav", "Abhinav Suman", "Story", "2023AS210", "Available"}
        };

        TablePrinter.printTable bookList = new TablePrinter.printTable(table);

        bookList.getTable();

    }
}
