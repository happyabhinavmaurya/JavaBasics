package oops.LibraryManagementSystem;

public class Book {

    public static void display(String massage) {
        System.out.println(massage);
    }

    public static class BookDetails {
        String ISBN, title, author, genre, availabilityStatus;

        public BookDetails(String title, String author, String genre, String ISBN, String availabilityStatus) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.ISBN = ISBN;
            this.availabilityStatus = availabilityStatus;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public String getAvailabilityStatus() {
            return availabilityStatus;
        }

        public void setAvailabilityStatus(String availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
        }

        public void displayBookDetails() {
            display("Book title: " + getTitle());
            display("Book \"" + getTitle() + "\" author: " + getAuthor());
            display("Book \"" + getTitle() + "\" genre: " + getGenre());
            display("Book \"" + getTitle() + "\" ISBN: " + getISBN());
            display("Book \"" + getTitle() + "\" availability status: " + getAvailabilityStatus());

        }

    }


}
