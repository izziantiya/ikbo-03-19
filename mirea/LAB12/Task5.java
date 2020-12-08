package LAB12;

import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String strRegEx = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9_](?=\\S+$).{7,}$";
        Pattern pattern = Pattern.compile(strRegEx);
        String[] passwords = {
                "F032_Password", "TrySpy12",
                "smart_pass", "A007"
        };

        for (String i : passwords)
            System.out.println(pattern.matcher(i).matches() + ":\t" + i);
    }
}
