package pr6;

public class IDNumber {
    private Student[] University;
    private int size;

    public IDNumber(int N) {
        this.University = new Student[N];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void addStudent(Student student) {
        University[size] = student;
        size++;
    }

    public Student getStudent(int index) {
        return University[index];
    }

    public void InsertionSort() {
        for (int left = 1; left < University.length; left++) {
            Student value = University[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.getID() < University[i].getID()) {
                    University[i + 1] = University[i];
                } else {
                    break;
                }
            }
            University[i + 1] = value;
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