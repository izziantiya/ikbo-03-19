package mirea.PR9;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LabClassDriver {
    LabClass labClass;

    public LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void create() {
        System.out.println("Введите имя и оценку(от 0 до 100) студента (end - выход): ");
        String name;
        int GPA;
        Scanner sc = new Scanner(System.in);
        do {
            name = (sc.next()).toLowerCase();
            if (!name.equals("end")) {
                GPA = sc.nextInt();
                labClass.addStudent(new Student(GPA, name));
                System.out.println("Введите имя и оценку(от 0 до 100) студента (end - выход): ");
            }

        } while (!name.equals("end"));
    }
}
