public class SumArray {

    public static void main(String[] args) {
        int[] numbers = {12, 9, 7, 18, 24, 5, 31, 13};

        int total = 0;

        for (int value : numbers) {
            total += value;
        }

        System.out.println("Array values: 12, 9, 7, 18, 24, 5, 31, 13");
        System.out.println("Sum of array values = " + total);
    }
}
