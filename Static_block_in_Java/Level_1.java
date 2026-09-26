/*
Write this program yourself:

Student
  ↓
static block → "College loaded"
  ↓
constructor → "Student created"

Create 2 Student objects.

Expected output:

College loaded
Student created
Student created
 */

package Static_block_in_Java;

class Student{
    static{
        System.out.println("College loaded");
    }
    public Student(){
        System.out.println("Student created");
    }
}

public class Level_1 {
    public static void main(String[] args) {

        Student s1= new Student();
        Student S2= new Student();
    }
}
