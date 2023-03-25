package quiz;

import java.util.ArrayList;
import java.util.List;

public class Examen {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Juan");
        students.add("Leonardo");
        students.add("Patricia");
        students.add("Diego");
        students.add("Elizabeth");
        students.add("Maria");
        students.add("Rosa");
        students.add("Luis");
        students.add("Mariel ");
        students.add("Enrique");

        for (String student: students) {
            System.out.println(student);
        }

    }
}
