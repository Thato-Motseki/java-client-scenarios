# StarNight Events

A Java Swing ticket-booking application that demonstrates graphical user interfaces, event handling, input validation, and dynamic interface updates.

## Client Brief

StarNight Events needs a simple desktop application for booking tickets to events.

The application should:

* Allow customers to select an event.
* Accept the customer's name.
* Accept the number of tickets required.
* Track available seats.
* Prevent invalid ticket quantities.
* Prevent bookings when insufficient seats remain.
* Display booking confirmations.
* Allow the user to clear the form.

## Events

The application currently provides four events:

* Summer Music Festival
* Comedy Night
* Jazz Evening
* Cultural Night

The system starts with **100 available seats**.

## Java Concepts Practiced

This project introduces:

* Java Swing
* `JFrame`
* `JPanel`
* `JLabel`
* `JTextField`
* `JButton`
* `JComboBox`
* `GridLayout`
* `BorderLayout`
* Event handling
* `ActionListener`
* Lambda expressions
* GUI state
* Input validation
* Exception handling
* `SwingUtilities`
* `NumberFormatException`

## Project Structure

```text id="f1zj9p"
08-starnight-events/
├── README.md
└── src/
    ├── TicketBookingFrame.java
    └── StarNightEvents.java
```

## Class Responsibilities

### `TicketBookingFrame`

Creates and manages the application's graphical interface.

It handles:

* Event selection
* Customer information
* Ticket quantity
* Seat availability
* Booking validation
* Booking confirmation
* Form clearing

### `StarNightEvents`

Contains the application's `main()` method and starts the Swing interface.

The application is launched using:

```java id="3ihfka"
SwingUtilities.invokeLater(...)
```

This ensures the GUI is created on Swing's E
