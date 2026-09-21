# FitZone Gym — Membership Fee Calculator

A console-based Java application that calculates FitZone Gym membership costs based on membership type, student status, and contract length.

## Client Brief

FitZone Gym offers two membership plans:

* Standard: M450 per month
* Premium: M700 per month

Students receive a 15% discount on either membership plan.

Customers who sign up for 12 months upfront receive an additional M5 discount per month.

The application allows reception staff to generate membership quotations and process multiple customers during one session.

## Requirements

The application must:

* Allow the user to select Standard or Premium membership.
* Determine whether the customer is a student.
* Accept the contract length in months.
* Apply the 15% student discount where applicable.
* Apply the additional M5 monthly discount for a 12-month contract.
* Calculate the total contract price.
* Display a membership quotation.
* Allow multiple customer enquiries in one run.
* Reject invalid membership types.
* Reject contract lengths of zero or less.

## Pricing Rules

| Membership | Monthly Fee |
| ---------- | ----------: |
| Standard   |        M450 |
| Premium    |        M700 |

Additional discounts:

| Condition         | Discount |
| ----------------- | -------: |
| Student           |      15% |
| 12-month contract | M5/month |

The discounts are applied sequentially to the monthly membership price.

## Concepts Practised

* Variables and constants
* `Scanner`
* `if/else` statements
* Boolean values
* Methods
* Method parameters
* Return values
* `do-while` loops
* Input validation
* Formatted output
* Basic business-rule implementation

## Program Flow

```text
Start
  ↓
Select membership
  ↓
Enter student status
  ↓
Enter contract length
  ↓
Validate input
  ↓
Calculate monthly fee
  ↓
Calculate total price
  ↓
Display quotation
  ↓
Process another customer?
  ↓
Yes → Repeat
No  → End
```

## Example

```text
==============================
         FITZONE GYM
==============================
1. Standard - M450/month
2. Premium  - M700/month
Select membership type: 2

Are you a student? (yes/no): yes
Enter contract length in months: 12

--------- MEMBERSHIP QUOTE ---------
Membership: Premium
Student: Yes
Contract: 12 months
Monthly fee: M590.00
Total price: M7080.00
------------------------------------
```

## Future Improvements

Possible future improvements include:

* Stronger input validation for text responses.
* A graphical user interface.
* Customer records.
* Membership IDs.
* Persistent customer data.
* Different contract-based benefits.
* Database storage.

## Status

Completed.
