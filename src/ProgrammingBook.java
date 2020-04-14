public class ProgrammingBook extends Book {
    private int bookCode;
    private String name;
    private int price;
    private String author;
    private String category = "Programming";
    private String language;
    private static int countBook;

    public ProgrammingBook(int bookCode, String name, int price, String author,String language) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        this.language = language;
        countBook++;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{" +
                "bookCode=" + bookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}


