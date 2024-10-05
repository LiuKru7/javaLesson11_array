package example_4.variant_2;

public class DigitalGradeAppTester {
    public static void main(String[] args) {
        DigitalGradeApp firstPerson = new DigitalGradeApp();
        firstPerson.writeGrades();
        System.out.println(firstPerson.grades);
        firstPerson.calculateAverage();

    }


}
