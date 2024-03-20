package studentdatabase;

// Imports
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author masonmcquiggin
 */

// This class implements the Initializable interface, which means that 
// it must implement the initialize() method.
public class SearchByIdController implements Initializable {

    // These are the names for vthe fx:id's and handlers.
    // @FXML allows the controller to access and manipulate the UI in the FXML file.
    @FXML
    private Button returnButton;
    @FXML
    private TextField IdTextField;
    @FXML
    private TextArea IdTextArea;
    @FXML
    private Button searchIdButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // This return action button when pressed will return the user back to the main menu.
    @FXML
    private void returnButtonHandler(ActionEvent event) throws Exception {
        Utility.changeToScene(getClass(), event, "database.fxml");
    }

    // This searchId action button will search through the arrayList to see if a student exists with the inputted ID.
    @FXML
    private void searchIdButtonHandler(ActionEvent event) {

        String displayS = ""; // Define displayS outside of the for loop
        // Before we can search for the ID we need to make sure the user enters the correct information in the textFields.
        // We are going to create a boolean to check if the data is valid.
        // If we find a problem with the input we are going to change the boolean to false
        // This will just display the most recent error and prompt the user to fix it.
        boolean isDataValid = true;

        if (isDataValid == true) {
            // This block is going to check if the ID text field is empty or not.
            if (IdTextField.getText().trim().length() == 0) {
                // If the ID text field is left empty, display error.
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: ID cannot be left blank.");
                alert.showAndWait();
                isDataValid = false;
            }
        }

        if (isDataValid == true) {
            boolean idFound = false; // Add a boolean to check if a student with the ID exists
            for (Student s : AddRecordController.students) {
                // Loop through the students in the arrayList to see if the id matches with the one beiong searched.
                if (IdTextField.getText().trim().equals(s.getId())) {
                    displayS += s.toString() + "\n"; // Append s.toString() and a newline character to displayS
                    idFound = true; // Set the boolean to true if a student with the ID is found
                }
            }
            
            if (!idFound) { // If the boolean is false, no student with the ID exists
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: No student with that ID exists");
                alert.showAndWait();
            }
        }

        IdTextArea.setText(displayS); // Set the text of IdTextArea to displayS after the for loop is done
    }
}
