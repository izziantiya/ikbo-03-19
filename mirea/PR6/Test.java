package PR6;

import java.util.Arrays;
import java.util.Random;

public class Test {
    static int i = 0;
    public static Student getStudent() {
        Random rand = new Random();
        return new Student("Student_" + (i++), rand.nextInt(1000), rand.nextInt(100));
    }


    public static Student[] mergeSort(Student[] arr1, Student[] arr2){
        Student[] arr3 = new Student[arr1.length + arr2.length];
        int i = 0, j = 0;

        for (int k = 0; k < arr3.length; k++) {

            if (i > arr1.length - 1) {
                Student student = arr2[j];
                arr3[k] = student;
                j++;
            }
            else if (j > arr2.length-1) {
                Student student = arr1[i];
                arr3[k] = student;
                i++;
            }
            else if (arr1[i].getGPA() < arr2[j].getGPA()) {
                Student student = arr1[i];
                arr3[k] = student;
                i++;
            }
            else {
                Student student = arr2[j];
                arr3[k] = student;
                j++;
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        //1 задание
        IDNumber list1 = new IDNumber(10);
        for(int i = 0; i < 10; i++) {
            Student student = getStudent();
            list1.addStudent(student);
        }

        System.out.println(list1);
        list1.InsertionSort();
        System.out.println(list1);
        System.out.println("_____________________________________________________________");

        //2 задание
        SortingStudentsByGPA list2 = new SortingStudentsByGPA(10);
        for(int i = 0; i < 10; i++) {
            Student student = getStudent();
            list2.addStudent(student);
        }

        System.out.println(list2);
        list2.quickSort(0, 9);
        System.out.println(list2);

        //3 задание
        Student[] students1 = new Student[5];
        Student[] students2 = new Student[5];
        for (int i = 0; i < 5; ++i) {
            students1[i] = getStudent();
            students2[i] = getStudent();
        }
        System.out.println(Arrays.toString(students1));
        System.out.println(Arrays.toString(students2));
        System.out.println(Arrays.toString(mergeSort(students1, students2)));
    }
}
