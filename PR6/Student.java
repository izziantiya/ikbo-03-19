package PR6;

public class Student{
    private final String name;
    private final int ID;
    private final int GPA;

    public Student(String name, int ID, int GPA) {
        this.name = name;
        this.ID = ID;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", GPA=" + GPA +
                '}';
    }
}
