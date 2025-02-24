# Tax Calculation System

## Description
This is a simple Java application that calculates the taxes paid by individuals and companies based on their annual income. The project was created as part of my learning process on **abstract classes** and **polymorphism** in Java.

## Learning Concepts
### 1. Abstract Classes
- The class `TaxPayer` is an **abstract class** that serves as a base for `Individual` and `Company`.
- It defines the common attributes `name` and `annualIncome`.
- It declares an **abstract method** `tax()` that must be implemented by subclasses.

### 2. Polymorphism
- The list `List<TaxPayer> taxPayers` stores both `Individual` and `Company` objects.
- At runtime, each object calls its own overridden `tax()` method, demonstrating **dynamic method dispatch**.
- This allows for flexibility in handling different tax calculations depending on whether the taxpayer is an individual or a company.

## How to Run
1. Clone this repository:
   ```sh
   git clone https://github.com/taxSystem.git
   ```
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA, Eclipse, VS Code).
3. Compile and run `Program.java`.
4. Follow the prompts to enter tax payer details and get the tax calculations.

## Example Usage
```
Enter the number of tax payers: 2
Tax payer #1 data:
Individual or company (i/c)? i
Name: John Doe
Annual income: 30000.00
Health expenditures: 2000.00

Tax payer #2 data:
Individual or company (i/c)? c
Name: ACME Inc.
Annual income: 500000.00
Number of employees: 25

TAXES PAID:
John Doe: $ 7000.00
ACME Inc.: $ 70000.00

TOTAL TAXES: $ 77000.00
```

## Future Improvements
- Add more types of taxpayers.
- Implement a GUI for better user experience.
- Store data in a database instead of using user input every time.

## Author
- **Emanuel Silva**
- Learning Java and Object-Oriented Programming

Feel free to contribute and suggest improvements!

