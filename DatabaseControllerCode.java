// THE CONTROLLERS FOR FXML 
// MAIN MENU OF THE PROGRAM WHERE THE USER CAN NAVIGATE

package studentdatabase;

// Imports
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author masonmcquiggin
 */

// Main menu of the program where the user can navigate to different scenes.
public class databaseController implements Initializable {

    
    // These are the names for vthe fx:id's and handlers.
    // @FXML allows the controller to access and manipulate the UI in the FXML file.
    private Label label;
    @FXML
    private Button addRecordButton;
    @FXML
    private Button displayStudentButton;
    @FXML
    private Button exitButton;
    @FXML
    private Button searchByIdButton;
    @FXML
    private Button searchByNameButton;
    @FXML
    private ImageView ConnorAndMasonImage;
    @FXML
    private Button displayStatsButton;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // Takes the user to the AddRecord window.
    @FXML
    private void addRecordButtonHandler(ActionEvent event) throws Exception {
        Utility.changeToScene(getClass(), event, "AddRecord.fxml");
    }

    @FXML
    // Takes the user to the Student Display window.
    // If the Student arrayList is empty than stop the changing of windows.
    private void displayStudentButtonHandler(ActionEvent event) throws Exception {
        if (Student.getNumStudents() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Error: There is no students in the database.");
            alert.showAndWait();
        } else {
            Utility.changeToScene(getClass(), event, "StudentDisplay.fxml");
        }
    }

    // If the user presses exit then terminate the program.
    @FXML
    private void exitButtonHandler(ActionEvent event) {
        System.exit(0);
    }

    // Take the user to the SearchById window.
    // If the Student arrayList is empty than stop the changing of windows.
    @FXML
    private void searchByIdButtonHandler(ActionEvent event) throws Exception {
        if (Student.getNumStudents() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Error: There is no students in the database.");
            alert.showAndWait();
        } else {
            Utility.changeToScene(getClass(), event, "SearchById.fxml");
        }
    }
    
    // Take the user to the searchByName window.
    // If the Student arrayList is empty than stop the changing of windows.
    @FXML
    private void searchByNameButtonHandler(ActionEvent event) throws Exception {
        if (Student.getNumStudents() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Error: There is no students in the database.");
            alert.showAndWait();
        } else {
            Utility.changeToScene(getClass(), event, "SearchByName.fxml");
        }
    }

    // Take the user to the DisplayStats window.
    // If the Student arrayList is empty than stop the changing of windows.
    @FXML
    private void displayStatsButtonHandler(ActionEvent event) throws Exception {
        if (Student.getNumStudents() == 0) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Error: There is no students in the database.");
            alert.showAndWait();
        } else {
            Utility.changeToScene(getClass(), event, "DisplayStats.fxml");
        }
    }

}

-----------------------------------------------------------------------------------------

// INITIALIZES THE CONTROLLER TO ALLOW THE MOVEMENT BETWEEN MENUS.

package studentdatabase;

// Imports.
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
public class StudentDisplayController implements Initializable {

        // These are the names for vthe fx:id's and handlers.
        // @FXML allows the controller to access and manipulate the UI in the FXML file.
    @FXML
    private Button returnButton;
    @FXML
    private TextArea displayTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // This is going to loop though the arrayList and add the toString for each student to be displayed.
        String displayS = "";
        for (Student s : AddRecordController.students) {
            displayS += (s.toString() + "\n");
        }

        // Add the displayS string to the text area in the student display.
        displayTextArea.setText(displayS);

    }

    // This button is going to return the user back the the main menu.
    @FXML
    private void returnButtonHandler(ActionEvent event) throws Exception {
        Utility.changeToScene(getClass(), event, "database.fxml");
    }

}

