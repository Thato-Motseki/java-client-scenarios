# DriveEasy Car Rental

A console-based Java application that calculates car rental costs based on vehicle type and rental duration.

## Client Brief

DriveEasy Car Rental needs a simple rental calculator for customers renting Economy, SUV, and Luxury vehicles.

The application should:

* Allow the customer to select a car type.
* Calculate the rental cost based on the number of days.
* Apply a 10% discount to rentals of 7 or more days.
* Reject invalid rental periods.
* Handle invalid user input without crashing.
* Display a clear rental summary.

## Rental Rates

| Car Type | Daily Rate |
| -------- | ---------: |
| Economy  |       M400 |
| SUV      |       M650 |
| Luxury   |       M950 |

### Discount Rule

Rentals of **7 or more days** receive a **10% discount** on the total rental cost.

For example:

```text
Economy × 7 days

M400 × 7 = M2800
10% discount = M280
Final cost = M2520
```

## Java Concepts Practiced

This project introduces:

* Enums
* Classes and objects
* Constructors
* Encapsulation
* Methods
* Exception handling
* Custom exceptions
* `try-catch`
* `InputMismatchException`
* `switch`
* Conditional statements
* Loops
* `Scanner`
* Formatted output

## Project Structure

```text
05-driveeasy-rental/
├── README.md
└── src/
    ├── Car.java
    ├── CarType.java
    ├── InvalidRentalException.java
    └── DriveEasy.java
```

## Class Responsibilities

### `CarType`

An enum containing the supported vehicle types and their daily rental rates.

### `Car`

Represents a rental vehicle and calculates the rental cost.

It also validates the rental period and throws `InvalidRentalException` when an invalid period is supplied.

### `InvalidRentalException`

A custom exception created specifically for invalid rental requests.

### `DriveEasy`

Contains the main program and handles:

* User input
* Car selection
* Rental duration
* Exception handling
* Rental summary output

## Program Flow

```text
Start
  ↓
Display car types
  ↓
Customer selects car
  ↓
Enter rental period
  ↓
Validate rental period
  ↓
Calculate rental cost
  ↓
Apply 10% discount if 7+ days
  ↓
Display rental summary
  ↓
Return to menu
```

## Error Handling

The application handles invalid situations such as:

* Rental period of `0` days
* Negative rental periods
* Invalid menu selections
* Non-numeric input

Invalid rental periods are handled using the custom `InvalidRentalException`.

Invalid numeric input is handled using Java's `InputMismatchException`.

The application displays an error message instead of terminating unexpectedly.

## Future Improvements

Possible future versions could include:

* Customer details
* Vehicle availability
* Multiple vehicle bookings
* Rental receipts
* Return-date tracking
* File-based rental records
* A graphical user interface

