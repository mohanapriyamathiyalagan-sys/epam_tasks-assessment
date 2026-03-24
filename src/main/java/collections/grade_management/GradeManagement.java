package collections.grade_management;

import java.util.ArrayList;
import java.util.TreeMap;

public class GradeManagement {
    private TreeMap<Integer, Student> map = new TreeMap<>();

    // Add student
    public void addStudent(int id, String name, ArrayList<Double> grades) {
        map.put(id, new Student(name, grades));
    }

    // Update grades
    public void updateGrades(int id, ArrayList<Double> newGrades) {
        Student s = map.get(id);
        if (s != null) {
            s.setGrades(newGrades);
        }
    }

    // Get average
    public double getAverageGrade(int id) {
        Student s = map.get(id);
        if (s != null) {
            return s.getAverage();
        }
        return 0;
    }

    // Print all students (optional)
    public void printAll() {
        for (Integer id : map.keySet()) {
            Student s = map.get(id);
            System.out.println(id + " " + s.getName() + " Avg: " + s.getAverage());
        }
    }
}
