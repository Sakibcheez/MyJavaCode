
package PersonStudentTeacher;

import java.util.Arrays;


    
    public class Student extends Person 
    {
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[10];
        grades = new int[10];
    }

    public void addCourseGrade(String course, int grade) {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        System.out.println("Your Grade is " +Arrays.toString(grades));
    }

    public double getAverageGrade() {
        // Implementation for calculating average grade
        return 0.0;
    }

    @Override
    public String toString() {
        return " Student:" +super.toString()  ;
    }
}
    