
package code2024;

//Object Casting 
public class oneinone {
    
    public static void main(String[] args) {
        m(new GraduateStudent()); //Class passing through a method 
        m(new Student());
        m(new Person());
        m(new Object());
        
    }
    
    /**
     *
     * @param x
     */
    

//In Java documentation comments, @param is a tag used to describe a method or constructor parameter.
//It provides information about the purpose and expected behavior of a particular parameter.

    public static void m(Object x) //Object Class type Variable 
    {
        System.out.println(x.toString());
    }
    
}

class GraduateStudent extends Student
{

}

class Student extends Person
{
@Override
public String toString(){
    return "Student";
}
}

class Person extends Object // java object Class 
{
@Override

public String toString(){

return "Person";
}

}
