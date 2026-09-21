# Green City High School — Grade Report Generator

A Java console application that generates a grade report for a class of 15 students.

The program calculates the class average, assigns each student a letter grade, and identifies students who scored below the class average.

## Client Brief

Green City High School has a class of 15 students who completed a test scored out of 100.

The school needs a simple program that can:

* Display each student's score.
* Assign a letter grade.
* Calculate the class average.
* Identify students who scored below the class average.

## Requirements

The application must:

* Store 15 student names.
* Store their corresponding test scores.
* Calculate the total class score.
* Calculate the class average.
* Assign each student a letter grade.
* Display all student results.
* List students whose scores are below the class average.

## Grading Scale

|  Score | Grade |
| -----: | :---: |
| 80–100 |   A   |
|  70–79 |   B   |
|  60–69 |   C   |
|  50–59 |   D   |
|   0–49 |   F   |

## Concepts Practised

* Arrays
* Array indexes
* Traditional `for` loops
* Enhanced `for` loops
* Conditional statements
* Arithmetic
* Type casting
* `String` arrays
* Integer arrays
* Formatted output

## Program Flow

```text
Store student names and scores
          ↓
Calculate total score
          ↓
Calculate class average
          ↓
Loop through students
          ↓
Assign letter grades
          ↓
Display grade report
          ↓
Compare scores against average
          ↓
Display students below average
```

## Design Notes

Two arrays are used to maintain the relationship between students and their scores.

```java
studentNames[i]
scores[i]
```

The same index refers to the same student.

An enhanced `for` loop is used when calculating the total because the index is not required.

A traditional `for` loop is used when generating the student report because both the student's name and score must be accessed using the same index.

## Future Improvements

Possible improvements include:

* Accepting student information through user input.
* Using `ArrayList` instead of arrays.
* Creating a `Student` class.
* Calculating the highest and lowest scores.
* Identifying the top-performing student.
* Exporting the report to a file.
* Adding a graphical user interface.

## Status

Completed.
