# Sudoku Solver and Validator


This project is a Kotlin-based implementation of a Sudoku Solver and Validator. It allows for dynamic grid sizes and supports Test-Driven Development (TDD) to ensure reliability and correctness.

---

## **Features**

Supports dynamic grid sizes (3x3, 4x4, 9x9, 16x16).

Implements Sudoku validation rules for rows, columns, and sub-boxes.

Includes a solver that can find valid Sudoku solutions.

Uses TDD principles with extensive test cases.

---

## **Test Cases**

The program includes the following test cases:
- **Invalid Cases**:

- **Valid Cases**:

---

## **Technologies Used**
- **Kotlin**: Programming Language.
- **TDD**: Test-Driven Development for implementation.
- **IDE**: IntelliJ IDEA (or your favorite Kotlin IDE).

---

## **Equation Description**

### **This Equation to use in dynamic size of Sudoku board:**
### **Instead of using Quartet for O(n ^ 4) and equation take O(n ^ 2)**

val boxVal = board[boxSize * (i / boxSize) + j / boxSize][boxSize * (i % boxSize) + j % boxSize]
i → The index of the current row (0 to size-1)
j → The index of the current column (0 to size-1)
Row Index Calculation:
boxSize * (i / boxSize) + j / boxSize(i / boxSize) 
Determines which sub box row the element belongs to
boxSize * (i / boxSize) 
Converts the sub box row into the starting row index of that box
j / boxSize: 
Determines the row within the sub box
Column Index Calculation:
boxSize * (i % boxSize) + j % boxSize(i % boxSize) 
Determines which sub box column we are working with
boxSize * (i % boxSize)  
Converts the sub box column into the starting column index of that box
j % boxSize 
Determines the column within the sub box
---------------------------------------------------------------
Example in a 9×9 Sudoku boxSize = 3
i = 4 and j = 5.
Step 1: Find the Row Index
boxSize * (i / boxSize) + j / boxSize
= 3 * (4 / 3) + 5 / 3
= 3 * (1) + (1)
= 3 + 1
= 4
Row index is 4
Step 2: Find the Column Index
boxSize * (i % boxSize) + j % boxSize
= 3 * (4 % 3) + 5 % 3
= 3 * (1) + (2)
= 3 + 2
= 5
Column index is 5
---------------------------------
| The element boxVal at (4,5)   |
---------------------------------


---

*Flowchart*

The flowchart below explains the decision-making process of the IPv4 checker.


#### *Flowchart Description*

<img src="https://github.com/Ahmed7osny1/Sudoku-Checker/blob/master/Sudoku%20Checker%20Flow%20Chart.png?raw=true" alt="IPv4 Address Checker Flowchart Description" width="800" height="1000">

