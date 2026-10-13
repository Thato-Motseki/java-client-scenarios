public class MaxMinArray {

    public static void main(String[] args) {
        int[] numbers = {14, 6, 22, 8, 30, 19, 11, 27};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Array values: 14, 6, 22, 8, 30, 19, 11, 27");
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);
    }
}
