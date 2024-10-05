package example_4;

import java.util.Arrays;
import java.util.Scanner;

public class DigitalGradeApp {
    double[] grades = new double[5];
    Scanner scanner = new Scanner(System.in);
    boolean allGradesNotCollected = true;

    public void collectGrades() {
        int gradesQuantity = 0;
        while (allGradesNotCollected) {

            System.out.println(grades.length);

            System.out.print("\nEnter " + (gradesQuantity + 1) + " grade : ");
            double grade = scanner.nextDouble();
            if (grade >= 1 && grade <= 10) {
                grades[gradesQuantity] = grade;
                gradesQuantity += 1;

            } else {
                System.out.println("Grade can`t be zero, negative or more than ten.");
            }

            if (gradesQuantity == 5) {
                allGradesNotCollected = false;
            }
        }
        System.out.println(Arrays.toString(grades));
    }

    public void averageGrades() {

        double gradesSum = 0;
//        gradesSum = grades[0]+grades[1]+grades[2]+grades[3] + grades[4];

        for (int i = 0; i < grades.length; i++) {
            gradesSum += grades[i];
        }
        if (gradesSum <= 0) {
            System.out.println("No grades");
            return;
        }
        double gradesAverage = gradesSum / grades.length;
        System.out.println("Grades average: " + gradesAverage);
    }

}
