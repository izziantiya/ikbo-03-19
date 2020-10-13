package mirea.PR1;

public class Book {
    private String author;
    private int page;
    private int price;

    public Book(String author, int page, int price) {
        this.author = author;
        this.page = page;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Книга: " + "автор\t" + author + ", количество страниц\t" + page + ", цена\t" + price;
    }
}
