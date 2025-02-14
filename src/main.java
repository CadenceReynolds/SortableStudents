import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student keith = new Student("Keith", 3.73);
        Student allen = new Student("Allen", 3.68);
        Student joe = new Student("Mama", 6.9);

        List<Student> students = new ArrayList<>();

        students.add(keith);
        students.add(allen);
        students.add(joe);

        Collections.sort(students);


    }
}
