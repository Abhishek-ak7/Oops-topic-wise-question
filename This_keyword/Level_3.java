/*
Level 3 — Constructor Chaining

Create a Book class:

title
author
price

Create these constructors:

Book()
Book(String title)
Book(String title, String author, double price)

The first constructor should call the second using this().

The second should call the third using this().

Concept:

Book()
   ↓
Book(title)
   ↓
Book(title, author, price)
 */

package This_keyword;
class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this("PK");
    }

    public Book(String title) {
        this(title, "abhishek", 99);
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display(){
        System.out.println("Title: "+title+"\n"+
                            "Author: "+author+"\n"+
                            "Price: "+price);
    }
}

public class Level_3{
    public static void main(String[] args){
        Book b1=new Book();
        b1.display();
    }
}

