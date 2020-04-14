public class DetectiveBook extends Book {


    public DetectiveBook(int bookCode, String name, int price, String author, String language, String category) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
        this.language = language;
        this.category = category;
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
