public class GreenCityHigh {

    public static void main(String[] args) {

        String[] studentNames = {
                "Thato","Mpho","Lerato","Kabelo","Neo","Palesa","Tebogo","Naledi","Keneilwe","Mosa","Boitumelo","Lebohang","Refilwe","Karabo","Lineo" };

        int[] scores = {
                88,72,64,91,55,78,48,85,67,73,59,82,45,76,69 };

        // total score
        int totalScore = 0;

        for (int score : scores) {
            totalScore += score;
        }

        // class average
        double classAverage = (double) totalScore / scores.length;

        System.out.println("==========================================");
        System.out.println("       GREEN CITY HIGH SCHOOL");
        System.out.println("             GRADE REPORT");
        System.out.println("==========================================");

        System.out.printf("%-15s %-10s %-10s%n",
                "Student", "Score", "Grade");

        System.out.println("------------------------------------------");

        // student's grade
        for (int i = 0; i < studentNames.length; i++) {

            char grade;

            if (scores[i] >= 80) {
                grade = 'A';
            } else if (scores[i] >= 70) {
                grade = 'B';
            } else if (scores[i] >= 60) {
                grade = 'C';
            } else if (scores[i] >= 50) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.printf("%-15s %-10d %-10c%n",
                    studentNames[i],
                    scores[i],
                    grade);
        }

        System.out.println("------------------------------------------");
        System.out.printf("Class Average: %.2f%n", classAverage);

        // Display students below class average
        System.out.println("\nStudents Below Class Average:");
        System.out.println("------------------------------------------");

        for (int i = 0; i < studentNames.length; i++) {

            if (scores[i] < classAverage) {
                System.out.printf("%-15s %d%n",
                        studentNames[i],
                        scores[i]);
            }
        }

        System.out.println("==========================================");
    }
}