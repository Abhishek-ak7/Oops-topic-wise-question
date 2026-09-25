/*
Level 1 — Easy

Create:

class Student

with:

name
age
static college

Create 2 objects:

Abhishek, 23
Rahul, 22

Set:

college = "LPU"

Display all information.

Expected:

Name: Abhishek
Age: 23
College: LPU

Name: Rahul
Age: 22
College: LPU
 */

package Static;
class Student{
    private String name;
    private int age;

    public static String college="LPU";

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void display(){
        System.out.println("Name: "+name+"\n"+
                            "Age: "+age+"\n"+
                            "College: "+Student.college);
    }
}
public class Level_1 {
    public static void main(String[] args){
        Student s1= new Student("Abhishek",23);
        Student s2= new Student("Rahul", 22);

        s1.display();
        s2.display();
    }
}
