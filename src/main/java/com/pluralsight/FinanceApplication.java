package com.pluralsight;
import com.pluralsight.finance.*;
import java.math.BigDecimal;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);
        // try to deposit money into both accounts
        account1.deposit(100);

        //Changed the following line as it will result in an error
        //account2.deposit(100);
        ((BankAccount)account2).deposit(100);

    }

    /*

Did the deposit work for both accounts? Why or why not?

Th Deposit worked for account1. It did not work for account2.

What methods are available for account1?

BankAccount, Deposit, Withdraw, getValue

What methods are available for account2?

getValue

Why?

The compiler will check which method we can call from a reference according to the type
of reference and not according to the object referred by the reference.
*/
}
