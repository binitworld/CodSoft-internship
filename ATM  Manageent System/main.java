
//Bank-account  class

import java.util.InputMismatchException;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;

    }

    public double getBalance() {
        return balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;

        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
    // AtmMachine class

    class AtmMachine {
        private BankAccount account;

        public AtmMachine(BankAccount account) {
            this.account = account;
        }

        public void startATM() {
            Scanner in = new Scanner(System.in);
            int choice=0;
            do {
                try{
                    System.out.println("\n Welcome to ATM MACHINE");
                    System.out.println(" 1. Check Balance ");
                    System.out.println(" 2. Deposit Money");
                    System.out.println(" 3. Withdraw Money");
                    System.out.println(" 4. Exit !");
                    System.out.print("Enter Your Choice from above 1,2,3,4 as per options are given : ");
                    choice = in.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println("Current Saving Balance : Rs " + account.getBalance());
                            break;
                        case 2:
                            System.out.print(" Enter the  Amount to deposit :  ");
                            double depositAmount = in.nextDouble();
                            account.deposit(depositAmount);
                            System.out.println(" Deposited : Rs " + depositAmount);
                            break;
                        case 3:
                            System.out.print("Enter The amount to  Withdraw :  ");
                            double withdrawAmount = in.nextDouble();
                            if (account.withdraw(withdrawAmount)) {
                                System.out.println(" Withdrawal : Rs " + withdrawAmount);
                            } else {
                                System.out.println("Sorry! You are  Running out of Money / Insufficient Balance  ");
                            }
                            break;
                        case 4:
                            System.out.println("Exiting ATM / Thank's For Using our Bank !");
                        default:
                            System.out.println("Invalid Choice . Please Try Again!");
                            break;
                    }
                } catch(InputMismatchException e){
                    System.out.println("Invalid input . Please  enter a number.");
                    in.nextLine();
                }
            } while (choice != 4);
            in.close();
        }

    }

    // Main Class
public class main{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000); //Initial Balance  of ₹100000
        AtmMachine ATM = new AtmMachine(account);
        ATM.startATM();
    }
}