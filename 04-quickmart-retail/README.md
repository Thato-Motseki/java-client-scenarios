# QuickMart Retail — Stock Level Checker

A Java console application that monitors product stock levels and identifies products that need to be reordered.

## Client Brief

QuickMart Retail has approximately 20 products. Each product has:

* A name
* A quantity currently in stock
* A reorder threshold

The client needs a report that identifies products whose stock has fallen below their reorder threshold.

## Requirements

The application must:

* Represent products using a custom `Product` class.
* Store multiple products in a collection.
* Display each product's current stock.
* Display its reorder threshold.
* Flag products below their reorder threshold with `REORDER`.
* Display products that have sufficient stock as `OK`.
* Count the total number of products requiring a reorder.

## Business Rule

A product requires reordering when:

```text
Quantity in stock < Reorder threshold
```

For example:

```text
Stock: 5
Threshold: 8

5 < 8 → REORDER
```

A product at exactly its threshold does **not** require a reorder.

```text
Stock: 8
Threshold: 8

8 < 8 → false → OK
```

## Concepts Practised

* Classes
* Objects
* Constructors
* Encapsulation
* `private` fields
* Getter methods
* `ArrayList`
* Enhanced `for` loops
* Conditional statements
* Object collections
* Basic inventory business rules

## Class Design

### Product

The `Product` class represents one inventory item.

```text
Product
├── name
├── quantity
└── reorderThreshold
```

The fields are private and accessed through getter methods.

### QuickMart

The `QuickMart` class:

* Creates the product objects.
* Stores them in an `ArrayList`.
* Loops through the inventory.
* Determines the stock status.
* Counts products requiring reorder.

## Program Flow

```text
Create Product objects
        ↓
Add products to ArrayList
        ↓
Loop through products
        ↓
Compare quantity with threshold
        ↓
REORDER or OK
        ↓
Count products requiring reorder
        ↓
Display stock report


## Future Improvements

Possible improvements include:

* Allowing staff to add products through user input.
* Updating stock after sales or deliveries.
* Adding product prices.
* Adding product IDs.
* Searching for individual products.
* Sorting products by stock level.
* Connecting the inventory to a database.
* Adding a graphical user interface.

## Status

Completed.
