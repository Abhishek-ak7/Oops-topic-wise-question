/*
🟢 Level 1 — Basic

Create a class Student with:

name
age

Create a parameterized constructor that initializes both using this.

Expected usage:

Student s1 = new Student("Abhishek", 22);
s1.display();

Expected output:

Name: Abhishek
Age: 22

Condition: Constructor ke andar this.name and this.age use karna hai.
 */
package This_keyword;
class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name+"\n"+
                            "Age: "+age);
    }
}
public class Level_1 {
    public static void main(String[] args){
        Student s1=new Student("Abhishek",23);
        s1.display();
    }
}
