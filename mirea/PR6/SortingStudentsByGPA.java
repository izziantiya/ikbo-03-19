package PR6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Student[] University;
    private int size;

    public SortingStudentsByGPA(int N) {
        this.University = new Student[N];
        this.size = size;
    }

    public void addStudent(Student student) {
        University[size] = student;
        size++;
    }

    @Override
    public int compare(Student obj1, Student obj2)
    {
        if (obj1.getGPA() > obj2.getGPA())
            return 1;
        else if (obj1.getGPA() < obj2.getGPA())
            return -1;
        else
            return 0;
    }

    public void quickSort(int low, int high) {
        if (University.length == 0)
            return;
        int i = low, j = high;
        Student middle = University[(low + high) / 2];

        do {
            while (compare(University[i], middle) < 0)
                i++;
            while(compare(University[j], middle) > 0)
                j--;

            if (i <= j) {
                if (i < j) {
                    Student tmp = University[i];
                    University[i] = University[j];
                    University[j] = tmp;
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (i < high) {
            quickSort(i, high);
        }
        if (low < j) {
            quickSort(low, j);
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("[ ");
        for (int i = 0; i < size; i++) {
            string.append(University[i]);
            if (i != size - 1) {
                string.append(" || ");
            }
        }
        string.append(" ]");
        return string.toString();
    }
}
