# GreenCity Library

A console-based Java library management application demonstrating inheritance, abstract classes, interfaces, polymorphism, collections, and basic validation.

## Client Brief

GreenCity Library wants a small system for managing different types of library items.

The system should:

* Store books and reference books.
* Display library items.
* Allow borrowable books to be borrowed.
* Allow borrowed books to be returned.
* Prevent reference books from being borrowed.
* Search for items using their IDs.
* Track whether a book is currently borrowed.
* Handle invalid operations without crashing.

## Java Concepts Practiced

This project introduces several important object-oriented programming concepts:

* Abstract classes
* Inheritance
* Interfaces
* Polymorphism
* Method overriding
* Encapsulation
* Constructors
* `super`
* `ArrayList`
* `instanceof`
* Type casting
* Loops
* Exception handling
* `Scanner`

## Project Structure

```text
06-greencity-library/
├── README.md
└── src/
    ├── Item.java
    ├── Book.java
    ├── ReferenceBook.java
    ├── Borrowable.java
    ├── Library.java
    └── GreenCityLibrary.java
```

## Class Responsibilities

### `Item`

An abstract superclass containing properties shared by all library items:

* ID
* Title

It also defines the abstract `displayDetails()` method.

### `Book`

Extends `Item` and implements `Borrowable`.

A book contains:

* Author
* Borrowed status
* Due period

Books can be borrowed and returned.

### `ReferenceBook`

Extends `Item`.

Reference books contain a subject but cannot be borrowed.

This demonstrates that different subclasses can have different behaviors.

### `Borrowable`

An interface defining borrowing-related behavior:

```java
void borrow();
void returnItem();
boolean isBorrowed();
```

### `Library`

Manages the collection of library items using:

```java
ArrayList<Item>
```

It handles:

* Adding items
* Finding items
* Displaying items
* Borrowing items
* Returning items

### `GreenCityLibrary`

Contains the main program and provides the console menu.

## Object-Oriented Design

The application uses the following relationship:

```text
                  Item
                   ▲
          ┌────────┴────────┐
          │                 │
        Book          ReferenceBook
          │
          │ implements
          ▼
     Borrowable
```

Because both `Book` and `ReferenceBook` inherit from `Item`, they can be stored in the same collection:

```java
ArrayList<Item>
```

Polymorphism allows the program to call:

```java
item.displayDetails();
```

while Java executes the appropriate implementation for the actual object.

## Borrowing Rules

Regular books can be borrowed for 14 days.

A book that is already borrowed cannot be borrowed again.

A book that has not been borrowed cannot be returned.

Reference books cannot be borrowed or returned.

## Program Flow

```text
Start
  ↓
Create Library
  ↓
Add Books and Reference Books
  ↓
Display Menu
  ↓
Choose Operation
  ├── Display Items
  ├── Borrow Book
  ├── Return Book
  ├── Find Item
  └── Exit
  ↓
Continue until Exit
```


## Future Improvements

Possible future versions could include:

* Member registration
* Member borrowing limits
* Real calendar-based due dates
* Overdue detection
* Late-return fines
* Persistent file storage
* Database storage
* Search by title or author
* GUI interface
* Login and user roles

## Status

**Completed**

This exercise expands the project from individual classes into a small object-oriented system where inheritance, interfaces, polymorphism, and collections work together.
