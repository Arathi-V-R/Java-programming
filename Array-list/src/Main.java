import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        int[] marks = {97,98,100};
        Student student = new Student("Ram",marks);

        int number = student.getNumberOfMarks();
        System.out.println("number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum mark : " + maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum mark: " + minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average mark: " + average);

        System.out.println(student);

        student.addNewMark(35);
        System.out.println(student);

        student.removeMark(1);
        System.out.println(student);
    }
}
