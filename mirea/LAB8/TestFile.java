package lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFile {
    public static void writeFileOne (String filepath, String text){
        try {
            FileWriter writeFile = new FileWriter(filepath, false);

            writeFile.write(text);
            writeFile.flush();

        } catch (IOException e) {
            e.getMessage();
        }
    }
    public static void writeFileTwo (String filepath, String text){
        try {
            FileWriter writeFile = new FileWriter(filepath, true);

            writeFile.write(text + '\n');
            writeFile.flush();

        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void readerFile (String filepath) {
        try {
            FileReader readerFile = new FileReader(filepath);

            int c;
            while((c=readerFile.read())!=-1){
                System.out.print((char)c);
            }

        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        String text;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст для записи в файл: ");
        text = sc.nextLine();
        writeFileOne("src/lab8/fileOne.txt", text);
        writeFileTwo("src/lab8/fileTwo.txt", text);

        System.out.println("Содержимое файла:");
        readerFile("src/lab8/fileOne.txt");
        System.out.println();

        System.out.println("Введите повторно текст для записи или перезаписи в файл: ");
        text = sc.nextLine();
        writeFileOne("src/lab8/fileOne.txt", text);
        writeFileTwo("src/lab8/fileTwo.txt", text);

        System.out.println("Содержимое первого файла:");
        readerFile("src/lab8/fileOne.txt");
        System.out.println('\n');
        System.out.println("Содержимое второго файла:");
        readerFile("src/lab8/fileTwo.txt");
    }
}
