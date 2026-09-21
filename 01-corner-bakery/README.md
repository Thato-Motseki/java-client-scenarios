# Corner Bakery — Order Total Calculator

A console-based Java application that calculates customer orders for a small bakery and produces an itemised receipt.

## Client Brief

Corner Bakery sells cupcakes for M2.50 each and cakes for M18.00 each.

Customers ordering 6 or more cupcakes receive a 10% discount on the cupcake portion of their order.

The application is intended as a simple till-side calculator before the bakery introduces a full point-of-sale system.

## Requirements

The application must:

* Accept the number of cupcakes ordered.
* Accept the number of cakes ordered.
* Calculate the cupcake subtotal.
* Apply a 10% discount when 6 or more cupcakes are ordered.
* Calculate the cake subtotal.
* Calculate the grand total.
* Display an itemised receipt.

## Business Rules

| Item    |  Price |
| ------- | -----: |
| Cupcake |  M2.50 |
| Cake    | M18.00 |

Cupcake discount:

6 or more cupcakes → 10% discount
Less than 6 cupcakes → No discount

The discount applies only to the cupcake subtotal.

## Concepts Practised

* Variables
* Constants
* User input
* Arithmetic operators
* Conditional statements
* Basic methods
* Formatted output

## Example


===== CORNER BAKERY =====

Cupcakes: 6
Cupcake subtotal: M15.00
Discount: M1.50

Cakes: 2
Cake subtotal: M36.00

-------------------------
Grand Total: M49.50
-------------------------

## Future Improvements

Possible future improvements include:

* Support for more bakery products.
* Receipt numbers.
* Customer details.
* Input validation.
* A graphical user interface.
* Database storage.
