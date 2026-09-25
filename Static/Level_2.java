/*
Level 2 — Static Sharing

Create:

class Employee

with:

name
static company

Create two employees:

Abhishek
Rahul

Initially:

company = "TCS"

Then change:

Employee.company = "Google";

Display both employees.

Observe: dono employees ka company change hona chahiye.
 */

package Static;

import java.sql.SQLOutput;

class Employee{
    private String name;
    static String company="TCS";

    public Employee(String name){
        this.name=name;
    }
}

public class Level_2 {
    public static void main(String[] args) {
        Employee e1= new Employee("Abhishek");
        Employee e2= new Employee("Rahul");

        System.out.println(Employee.company);
        Employee.company="Google";
        System.out.println(e1.company);
        System.out.println(e2.company);
        System.out.println(Employee.company);
    }
}
