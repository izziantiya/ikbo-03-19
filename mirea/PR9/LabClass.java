package mirea.PR9;

import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Student> University;
    Student findStudent = null;

    public LabClass() {
        this.University = new ArrayList<>();
    }

    public void addStudent(Student student) {
        University.add(student);
        University.sort(Student::compareTo);
        System.out.println(University.size());
    }

    public Student findStudent(String name) throws StudentNotFoundException {
        for (int i = 0; i < University.size(); i++) {
            if (University.get(i).getName().equals(name))
                findStudent = University.get(i);
        }
        if (findStudent == null)
            throw new StudentNotFoundException("Студент " + name + " не найден.");
        return findStudent;
    }

    public Student remove() {
        return University.remove(0);
    }

    public boolean isEmpty() {
        return University.isEmpty();
    }
}
