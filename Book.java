public class Book {

    private String title;

    private String author;

    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book - { Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price + " }");
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book one = new Book("Book one", "John Doe", 689.55);
        Book two = new Book("Book two", "Jane Doe", 899.34);
        one.displayDetails();
        two.displayDetails();
    }
}
