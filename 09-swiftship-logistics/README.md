# SwiftShip Logistics

A small Java application that demonstrates package tracking and object serialization.

## Client Brief

SwiftShip Logistics needs a simple way to maintain package records and persist them to disk so delivery information remains available after the program closes.

## Java Concepts Practiced

* Classes and objects
* Enums
* Serialization
* File I/O
* Collections
* Console output

## Project Structure

```text
09-swiftship-logistics/
├── README.md
└── src/
    ├── PackageRecord.java
    └── SwiftShipLogistics.java
```

## What the program does

* Creates several package records
* Saves them to a serialized file named `shipments.ser`
* Loads the records back from disk
* Displays the tracking summary in the console

Run the program from this folder using:

```bash
javac -d out src\PackageRecord.java src\SwiftShipLogistics.java
java -cp out SwiftShipLogistics
```
