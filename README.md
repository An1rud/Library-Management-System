# Library Management System

## Description
The Library Management System is a simple console-based application written in Java. It provides functionalities to manage library resources such as books and members, handle book borrowing and returning, and manage member transactions.

## Features
- **Book Inventory Management**: Add books to the library inventory.
- **Member Registration and Management**: Register and manage library members.
- **Book Borrowing and Returning System**: Borrow and return books.
- **Fine Calculation for Overdue Books**: (To be implemented) Calculate fines for overdue books.

## Project Structure
The project consists of the following classes:
- **Book**: Represents a book with attributes such as title, author, ISBN, and borrowed status.
- **Member**: Represents a library member with attributes such as name, member ID, and a list of borrowed books.
- **Library**: Manages the collection of books and registered members. Handles book borrowing and returning operations.
- **LibraryManagementSystem**: The main class that provides a console interface for interacting with the system.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Compilation and Execution

1. **Clone the repository or download the source code**.
   ```sh
   git clone https://github.com/An1rud/Library-Management-System.git
   cd library-management-system
   ```

2. **Compile all classes**:
   ```sh
   javac Book.java Member.java Library.java LibraryManagementSystem.java
   ```

3. **Run the main class**:
   ```sh
   java LibraryManagementSystem
   ```

### Usage
1. **Run the application**.
2. **Select an option from the menu**:
   - 1: Add a new book.
   - 2: Register a new member.
   - 3: Borrow a book.
   - 4: Return a book.
   - 5: Exit the application.

## Example

```
Library Management System:
1. Add Book
2. Register Member
3. Borrow Book
4. Return Book
5. Exit
Enter your choice: 1
Enter title: The Great Gatsby
Enter author: F. Scott Fitzgerald
Enter ISBN: 9780743273565
Book added successfully!
```
