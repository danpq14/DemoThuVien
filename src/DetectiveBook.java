public class DetectiveBook extends Book {
    private int bookCode;
    private String name;
    private int price;
    private String author;
    private String category = "Detective";
    private String language;
    private static int countBook;

    public DetectiveBook(int bookCode, String name, int price, String author, String language) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        this.language = language;
        countBook++;
    }

    @Override
    public String toString() {
        return "DetectiveBook{" +
                "bookCode=" + bookCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
