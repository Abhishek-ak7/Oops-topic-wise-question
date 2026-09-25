/*
🟡 Level 2 — this in Method

Create a class Employee:

name
salary

Create:

setDetails(String name, double salary)

and:

display()

Use this to distinguish instance variables from parameters.

Example:

Employee e1 = new Employee();
e1.setDetails("Rahul", 50000);
e1.display();

Expected:

Name: Rahul
Salary: 50000.0
 */

package This_keyword;
class Employee{
    private String name;
    private double salary;

    public void setDetails(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public void display(){
        System.out.println("Name: "+name+"\n"+
                            "Salary: "+salary);
    }
}

public class Level_2 {
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.setDetails("Rahul",50000);
        e1.display();
    }
}
