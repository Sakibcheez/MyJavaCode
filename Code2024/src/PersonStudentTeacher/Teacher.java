
package PersonStudentTeacher;

public class Teacher extends Person {
    
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[10];
    }

    public boolean addCourse(String course) {
        // Implementation for adding course
        return false;
    }

    public boolean removeCourse(String course) {
        // Implementation for removing course
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + " (Teacher)";
    }
}