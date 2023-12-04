# Java-Fundamentals
1.create a class with Strings declared String s = "Hello" and String s1= "Hello" and String s2= new String("Hello") and evaluate s==s1 and s1==s2.(P1.java)<br>
2.Write a program that solves the following equation and displays the value for x and y: 3.4x + 50.2y = 44.5,2.1x + .55y = 5.9 (P7.java)
<br>
3.Design a shape hierarchy (circle, rectangle, and triangle) with a common interface for calculating area. Create a method that takes an array of shapes and prints the area of each shape without knowing the specific type of each shape at compile time. (P2.java)
<br>
4.Model a company's employee hierarchy. Define a base class for employees with common attributes (name, ID, salary) and methods. Create subclasses for different types of employees (full-time, part-time, and contract) with specific attributes and methods (P3.java)
<br>
5.Simulate a vehicle manufacturing system where you have different types of vehicles (car, bike, and truck) and different features (electric, hybrid, diesel). Implement classes using multiple inheritance to handle various combinations of vehicle types and features.
Interface1 : FuelType
interface 2 : VehicleType
base Class: Vehicle
Child classes : Car, Bike implemnts 2 interface and extends 1 class (P4.java)

Design an Online Banking System that represents various entities within the banking domain. Implement the following requirements:
1. *Entities:*
  - Create a base class Account with attributes like accountId (private), accountHolderName, balance, and methods deposit() and withdraw().
  - Implement two subclasses: SavingsAccount and CheckingAccount, each extending the Account class.
2. *Interfaces:*
  - Create two interfaces, TransactionHistory and OverdraftProtection.
  - TransactionHistory should have a method viewTransactionHistory() to display the transaction history of an account.
  - OverdraftProtection should have a method applyOverdraftProtection() to handle overdraft situations in the CheckingAccount.
3. *Access Modifiers:*
  - Use appropriate access modifiers for class attributes and methods.
  - Demonstrate the use of public, private, protected, and default access modifiers.
4. *Method Overloading and Overriding:*
  - Implement method overloading for the deposit() and withdraw() methods in the Account class, considering different parameters.
  - Override the withdraw() method in each subclass to provide account-specific behavior.
5. *Type Conversion:*
  - Implement a method in the CheckingAccount class that takes a check as an argument and converts it to a digital format for processing.
6. *Interface Implementation:*
  - Implement the TransactionHistory interface in both SavingsAccount and CheckingAccount to view transaction history.
  - Implement the OverdraftProtection interface in the CheckingAccount to handle overdraft situations.
<br>Ensure to create an application (OnlineBankingApp) that demonstrates the functionalities of different accounts within the Online Banking System.
This should involve creating instances of various accounts, depositing and withdrawing money, viewing transaction history, applying overdraft protection, 
and showcasing the use of different access modifiers, method overloading, overriding, type conversion, and interfaces.
