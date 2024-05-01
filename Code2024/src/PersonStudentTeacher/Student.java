
package PersonStudentTeacher;


    
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
        // Implementation for adding course and grade
    }

    public void printGrades() {
        // Implementation for printing grades
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
    