
public class Book {
    protected int bookCode;
    protected String name;
    protected int price;
    protected String author;
    protected String category;
    protected String language;
    protected static int countBook = 0;

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        countBook++;
    }

    public Book(){
    }

    public int getBookCode() {
        return bookCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static int amountBook() {
        return countBook;
    }



    @Override
    public String toString() {
        return "Book{" +
                "bookCode=" + bookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}



