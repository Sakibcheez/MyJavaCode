
package PersonStudentTeacher;


public class TestPST {
   
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Alice", "123 Main St");
        student1.addCourseGrade("Math", 90);
        student1.addCourseGrade("History", 85);

        // Display student information
        System.out.println(student1);

        // Create a Teacher object
        Teacher teacher1 = new Teacher("Mr. Smith", "456 Elm St");
        teacher1.addCourse("Computer Science");
        teacher1.addCourse("Physics");

        // Display teacher information
        System.out.println(teacher1);
    }
}
    

