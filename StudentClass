package studentdatabase;

// Create a student class to help enter students to the database.
public class Student {

    // Data Members.
    private String firstName;
    private String lastName;
    private String id;
    private String exam1grade;
    private String exam2grade;
    private String exam3grade;
    private char letterGrade;
    private double finalGrade;

    // The variable belongs to the class rather than to any individual object of the class.
    // The purpose of this variable is to keep track of the number of Student objects that have been created
    private static int numStudents = 0;

    // Default Constructor.
    public Student() {
    }

    // Constructor with the parameters for addRecord.
    public Student(String firstName, String lastName, String id, String exam1grade, String exam2grade, String exam3grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.exam1grade = exam1grade;
        this.exam2grade = exam2grade;
        this.exam3grade = exam3grade;

        // Using the weighted exam scores to get the final grade.
        this.finalGrade = ((0.3 * Integer.parseInt(exam1grade)) + (0.3 * Integer.parseInt(exam2grade)) + (0.4 * Integer.parseInt(exam3grade)));

        // Have a method that uses the final grade to find the lettergrade and that is return, so we can use it he;
        this.letterGrade = getLetterGrade();
    }

    // Getters and Setters.
    public String getExam1grade() {
        return exam1grade;
    }

    public void setExam1grade(String exam1grade) {
        this.exam1grade = exam1grade;
    }

    public String getExam2grade() {
        return exam2grade;
    }

    public void setExam2grade(String exam2grade) {
        this.exam2grade = exam2grade;
    }

    public String getExam3grade() {
        return exam3grade;
    }

    public void setExam3grade(String exam3grade) {
        this.exam3grade = exam3grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    // Other Methods:
    // This method takes the finalGrade and gives a corresponding letterGrade.
    public char getLetterGrade() {
        if (finalGrade >= 90) {
            return 'A';
        } else if (finalGrade >= 80) {
            return 'B';
        } else if (finalGrade >= 70) {
            return 'C';
        } else if (finalGrade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public static int getNumStudents() {
        return numStudents;
    }

    // This method just keeps count of the amount of students in the Student array.
    public static void increaseStudents() {
        numStudents++;
    }

    // Overridden toString().
    // Prints the details of the each student in a formatted String.
    @Override
    public String toString() {
        String s = "";
        s += String.format("ID:                     %s\n", id);
        s += String.format("First Name:   %s\n", firstName);
        s += String.format("Last Name:   %s\n", lastName);
        s += String.format("Exam 1:          %s\n", exam1grade);
        s += String.format("Exam 2:          %s\n", exam2grade);
        s += String.format("Exam 3:          %s\n", exam3grade);
        s += String.format("Final Grade:  %.2f (%c)\n", finalGrade, letterGrade);
        return s;
    }
}
