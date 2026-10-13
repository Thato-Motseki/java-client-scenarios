public class AverageArray {

    public static void main(String[] args) {
        double[] values = {78.5, 82.0, 91.5, 68.0, 74.5, 86.0};

        double total = 0;

        for (double value : values) {
            total += value;
        }

        double average = total / values.length;

        System.out.println("Values: 78.5, 82.0, 91.5, 68.0, 74.5, 86.0");
        System.out.printf("Average = %.2f%n", average);
    }
}
