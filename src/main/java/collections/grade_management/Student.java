package collections.grade_management;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name, ArrayList<Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public double getAverage() {
        double sum = 0;

        for (Double g : grades) {
            sum += g;
        }

        return grades.size() == 0 ? 0 : sum / grades.size();
    }
}
