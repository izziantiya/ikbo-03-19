package mirea.pr2;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Александ Пушкин", "push@gmail.com", 'М');
        System.out.println(author);
        author.setEmail("pushkin@mail.ru");
        System.out.println(author);
    }


}
