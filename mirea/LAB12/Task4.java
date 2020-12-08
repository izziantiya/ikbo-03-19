package LAB12;

import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[-\\w.]+@([A-z0-9][-A-z0-9]+(\\.|))+[A-z]{2,3}$");
        String[] email = {
                "user@example.com",
                "root@localhost",
                "myhost@@@com.ru",
                "@my.ru",
                "Julia String"
        };
        for (String i : email)
            System.out.println(pattern.matcher(i).matches() + ":\t" + i);
    }
}
