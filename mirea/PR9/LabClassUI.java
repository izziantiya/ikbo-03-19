package mirea.PR9;

import java.util.Scanner;

public class LabClassUI {
    LabClass labClass;

    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        driver.create();
    }

    public void find(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя студента, которого хотите найти: ");
        String name = null;
        try {
            name = (sc.next()).toLowerCase();
            if (name.isEmpty()) {
                throw new EmptyStringException("Вы ввели пустую строку!");
            }
        } catch (EmptyStringException e) {
            System.err.println(e.getMessage());
            System.out.println();
            find();
        }
        try {
            System.out.println(labClass.findStudent(name).toString());
        } catch (StudentNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        LabClassUI run = new LabClassUI();
        run.find();
    }
}
