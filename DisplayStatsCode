
package studentdatabase;

// imports
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author masonmcquiggin
 */

// This class implements the Initializable interface, which means that 
// it must implement the initialize() method.
public class DisplayStatsController implements Initializable {
    
    // These are the names for vthe fx:id's and handlers.
    // @FXML allows the controller to access and manipulate the UI in the FXML file.
    @FXML
    private Button returnButton;
    @FXML
    private TextArea displayStatsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // The totalScore is used to help find average scores.
        double totalScore = 0.0;
        // Initialize to 0 so the grades can only get higher.
        double highestScore = 0;
        // Initialize to 100 because that the highest grade the student can get so it can only be lower.
        double lowestScore = 100;
        // numA,B,C,D,F are the count for letter grades in the array.
        int numA = 0, numB = 0, numC = 0, numD = 0, numF = 0;
        
        // Loop through the students in the addRecord arrayList to get there finalGrades.
        for (Student s : AddRecordController.students) {
            
            // Takes the finalGrades from each student in the arrayList and adds them to totalScore.
            double score = s.getFinalGrade();
            // Adds the score to totalScore to be used to find averageScore.
            totalScore += score;

            // These if statements find the highest and lowest score from all the students.
            // If the score is higher than the most recent highestScore, replace it.
            if (score > highestScore) {
                highestScore = score;
            }
            // If the score is lower than the most recent lowestScore, replace it.
            if (score < lowestScore) {
                lowestScore = score;
            }

            // Declare and assign the letterGrade of each student and save it to letterGrade.
            char letterGrade = s.getLetterGrade();

            // If else statements that increments your letterGrade, to track total letter grades.
            if (letterGrade == 'A') {
                numA++;
            } else if (letterGrade == 'B') {
                numB++;
            } else if (letterGrade == 'C') {
                numC++;
            } else if (letterGrade == 'D') {
                numD++;
            } else {
                numF++;
            }
        
        } // Loop restarts and check the next student.

        // To find the averageScore we divide the totalScore of all students by the amount of students in the arrayList.
        double averageScore = totalScore / AddRecordController.students.size();
        // Each letterGrade amount represents the percentage of the class so each needs their own equation.
        // Divide the amount of letterGrades in each respective category by the number of students in the array multiply by 100 to get a percent.
        double percentA = (double) numA / AddRecordController.students.size() * 100;
        double percentB = (double) numB / AddRecordController.students.size() * 100;
        double percentC = (double) numC / AddRecordController.students.size() * 100;
        double percentD = (double) numD / AddRecordController.students.size() * 100;
        double percentF = (double) numF / AddRecordController.students.size() * 100;
        
        // Create a String that will be printed for the class stats.
        String s = "";
        s += String.format("   Total number of student records: %d\n", AddRecordController.students.size());
        s += String.format("   Average Score: %.2f\n", averageScore);
        s += String.format("   Highest Score: %.2f\n", highestScore);
        s += String.format("   Lowest Score:  %.2f\n", lowestScore);
        s += String.format("   Total 'A' Grades:   %d ( %.2f%% of class)\n", numA, percentA);
        s += String.format("   Total 'B' Grades:   %d ( %.2f%% of class)\n", numB, percentB);
        s += String.format("   Total 'C' Grades:   %d ( %.2f%% of class)\n", numC, percentC);
        s += String.format("   Total 'D' Grades:   %d ( %.2f%% of class)\n", numD, percentD);
        s += String.format("   Total 'F' Grades:   %d ( %.2f%% of class)\n", numF, percentF);
        System.out.println("");

        // Going to set the text into the displayStatsTextArea so we can see it when we click on the displayStats button.
        displayStatsTextArea.setText(s);
    }

    // This return action button will return the user back to the main menu.
    @FXML
    private void returnButtonHandler(ActionEvent event) throws Exception {
        Utility.changeToScene(getClass(), event, "database.fxml");
    }

}
