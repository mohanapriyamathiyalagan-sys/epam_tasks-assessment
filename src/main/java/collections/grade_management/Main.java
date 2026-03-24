package collections.grade_management;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GradeManagement gm = new GradeManagement();

        ArrayList<Double> aliceGrades = new ArrayList<>();
        aliceGrades.add(85.0);
        aliceGrades.add(90.0);
        aliceGrades.add(78.0);

        ArrayList<Double> bobGrades = new ArrayList<>();
        bobGrades.add(88.0);
        bobGrades.add(92.0);
        bobGrades.add(80.0);

        gm.addStudent(1, "Alice", aliceGrades);
        gm.addStudent(2, "Bob", bobGrades);

        ArrayList<Double> newAliceGrades = new ArrayList<>();
        newAliceGrades.add(87.0);
        newAliceGrades.add(91.0);
        newAliceGrades.add(82.0);

        gm.updateGrades(1, newAliceGrades);

        System.out.println("Alice Avg: " + gm.getAverageGrade(1));
        System.out.println("Bob Avg: " + gm.getAverageGrade(2));
    }


}
