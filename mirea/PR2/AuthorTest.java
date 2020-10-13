package mirea.PR2;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Александр Пушкин", "push@gmail.com", 'М');
        System.out.println(author);
        author.setEmail("pushkin@mail.ru");
        System.out.println(author);
    }


}
