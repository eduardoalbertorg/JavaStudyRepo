package homeworks;

import java.util.HashMap;
import java.util.Map;

public class SchoolGrades {
    public static Map<String, Integer> getGradesAfterFirstTest(){
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Ana", 24);
        grades.put("Daniel", 50);
        grades.put("Alejandro", 79);
        grades.put("Laura", 32);
        grades.put("Kelly", 80);
        grades.put("Ivan", 40);
        grades.put("Maria", 59);
        grades.put("Melanie", 55);
        grades.put("Diego", 95);
        grades.put("Miguel", 63);
        return grades;
    }

    public static Map<String, Integer> getGradesAfterSecondTest(){
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Ana", 97);
        grades.put("Daniel", 89);
        grades.put("Alejandro", 79);
        grades.put("Laura", 82);
        grades.put("Kelly", 76);
        grades.put("Ivan", 98);
        grades.put("Maria", 80);
        grades.put("Melanie", 95);
        grades.put("Diego", 90);
        grades.put("Miguel", 62);
        return grades;
    }

    public static void main(String[] args) {
        Map<String, Integer> finalGrades = new HashMap<>();
        Map<String, Integer> firstGrades = getGradesAfterFirstTest();
        Map<String, Integer> secondGrades = getGradesAfterSecondTest();
        firstGrades.forEach((personName, grade) ->
                finalGrades.put(personName, grade > secondGrades.get(personName) ? grade : secondGrades.get(personName))
        );
        System.out.println(finalGrades);
    }

}
