/*
Complete this:

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student("Abhishek");

        // Make the object eligible for GC
    }
}

Task: Ek line add karo.
 */
package Garbage_Collection;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

public class Level_1 {
    public static void main(String[] args) {

        Student s1 = new Student("Abhishek");

        s1=null;
    }
}
