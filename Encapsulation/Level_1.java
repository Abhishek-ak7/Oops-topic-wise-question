/*
🟢 Level 1

Create:

class Student

with:

private String name;
private int age;

Create:

setName()
getName()

setAge()
getAge()

Then in main():

Name: Abhishek
Age: 23

Use this inside setters.
 */
package Encapsulation;

class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}

public class Level_1 {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.setName("Abhishek");
        s1.setAge(23);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
