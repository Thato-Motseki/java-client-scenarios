# 10 - Sum Array

A short Java exercise that demonstrates how to loop through an array and calculate the total.

## Example

```java
int[] numbers = {12, 9, 7, 18, 24, 5};
int total = 0;

for (int value : numbers) {
    total += value;
}
```

## Run

```bash
javac -d out src\SumArray.java
java -cp out SumArray
```
