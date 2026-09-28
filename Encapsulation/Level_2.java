/*
🟡 Level 2 — Validation

Create:

class BankAccount

with:

private double balance;

Create:

deposit(double amount)
withdraw(double amount)
getBalance()

Rules:

deposit > 0
withdraw > 0
withdraw <= balance

For invalid operations, don't modify the balance.

Example:

Initial balance = 1000

deposit(500)
→ 1500

withdraw(300)
→ 1200

withdraw(2000)
→ Invalid withdrawal
→ balance remains 1200
Important:

Don't create setBalance().

I specifically want you to understand why.
 */
package Encapsulation;

class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public void withdraw(double amount){
        if(amount>0 && balance>=amount){
            balance-=amount;
            System.out.println("Withdraw successful total balance: "+balance);
        }else {
            System.out.println("Invalid withdrawal");
        }
    }
    public String getBalance(){
        return "balance remains "+balance;
    }
}

public class Level_2 {
    public static void main(String[] args) {
        BankAccount b1= new BankAccount(1000);
        b1.deposit(500);
        b1.withdraw(300);
        System.out.println(b1.getBalance());

    }
}
