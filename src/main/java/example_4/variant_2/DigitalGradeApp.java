package example_4.variant_2;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitalGradeApp {
    ArrayList<Integer> grades = new ArrayList<>();
    boolean itIsNotAllGrades = true;
    Scanner intScanner = new Scanner(System.in);
    Scanner strScanner = new Scanner(System.in);

    public void writeGrades() {
        System.out.print("Enter the grade: ");
        while (itIsNotAllGrades) {
            int grade = intScanner.nextInt();
            if (grade >= 1 && grade <= 10) {
                grades.add(grade);
            }
            System.out.print("If you want to enter another grade, press Y; if not, press N : ");
            String step = strScanner.nextLine();
            if (step.equalsIgnoreCase("N")) {
                return;
            }
            if (step.equalsIgnoreCase("Y")) {
                System.out.print("Enter the grade: ");
            } else {
                System.out.println("wrong symbol");
            }
        }
        System.out.println("You have entered all the grades." );
    }
    public void calculateAverage() {
        if (grades.isEmpty()) {
            System.out.println("No grades! I can`t calculate average");
            return;
        }
        int gradeSum = 0;
        for (int grade : grades) {
            gradeSum += grade;
        }
        double gradesAverage = (double) gradeSum / grades.size();
        System.out.println("Grades average is : " + gradesAverage);
    }

}







