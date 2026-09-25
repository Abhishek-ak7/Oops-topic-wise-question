/*
Create:

class Calculator

with static methods:

add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)

Call them without creating an object:

Calculator.add(10, 20);
 */
package Static;

class Calculator{
    public static int add(int a,int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}

public class Level_3 {
    public static void main(String[] args) {
        System.out.println(Calculator.add(70,30));
    }
}
