
import java.util.Scanner;

class Bookdemo {
    private String name;
    private String author;
    private double price;
    private int num_pages;

    public Bookdemo(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPages() {
        return num_pages;
    }

    public String toString() {
        return "Book Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: ₹" + price +
               "\nNumber of Pages: " + num_pages + "\n";
    }
}

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        Bookdemo[] books = new Bookdemo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Number of pages: ");
            int pages = sc.nextInt();
            sc.nextLine();

            books[i] = new Bookdemo(name, author, price, pages);
        }

        System.out.println("\n--- Book Details ---");
        for (Bookdemo b : books) {
            System.out.println(b.toString());
        }

        sc.close();
    }
}
