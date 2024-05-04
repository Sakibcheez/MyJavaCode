
package Lab6_Stduent;


public class StudentTest {
    
        public static void main(String[] args)
        {
        // Create a Student object
        Student student1 = new Student("Alice", 101);

        // Get student ID
        int id = student1.getId();
        System.out.println("Student ID: " + id);

        // Get student email
        String email = student1.getEmail();
        System.out.println("Student Email: " + email);

        // Create another Student object
        Student student2 = new Student("Bob", 102);
        
      
        System.out.println("Student ID: " +student2.getId());

        // Get student email
       
        System.out.println("Student Email: " +student2.getEmail());

        // Display total number of students
        System.out.println("Total Students: " + Student.getTotalStudents());
    }
    
}
