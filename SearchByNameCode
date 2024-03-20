package studentdatabase;

// Imports.
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
public class SearchByNameController implements Initializable {
    
    // These are the names for vthe fx:id's and handlers.
    // @FXML allows the controller to access and manipulate the UI in the FXML file.
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;
    @FXML
    private Button searchByNameButton;
    @FXML
    private TextArea searchByNameTextArea;
    @FXML
    private Button returnButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    // This block is going to search by name to see if there is any students in the arrayList matching the input.
    @FXML
    private void searchByNameButtonHandler(ActionEvent event) {
        
        // Save textFields to String variables to make the code cleaner.
        String firstName = firstNameTextField.getText().trim();
        String lastName = lastNameTextField.getText().trim();
        // Check if the inputs are valid.
        boolean isDataValid = true;
        // Check if the student is in the arrayList or not.
        boolean foundStudent = false;
        // The String that will display the details of the student found.
        String displayS = "";

        // Check if the first and last name text fields are empty or not.
        if (firstName.isEmpty() || lastName.isEmpty()) {
            // If so, create and print an error.
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Error: First Name and Last Name cannot be left blank.");
            alert.showAndWait();
            isDataValid = false;
        }

        // This block is going to loop through the arrayList and see if the both the first and last name text fields match the inputted first and last name.
        if (isDataValid) {
            // Loop through the arrayList.
            for (Student s : AddRecordController.students) {
                // Check if the inputs match the student, ignoring the case sensitivity.
                if (firstName.equalsIgnoreCase(s.getFirstName()) && lastName.equalsIgnoreCase(s.getLastName())) {
                    displayS += s.toString() + "\n"; // Add the student's stats to the displayS string.
                    foundStudent = true; // Change the boolean to true, indictating that the student was found.
                }
            }

            if (foundStudent) {
                // Set the text of searchByNameTextArea to displayS after the for loop is done.
                searchByNameTextArea.setText(displayS);
            
            } else {
                // If the first and last name do not match then print an error saying that there is no student with that name.
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: No student with that name exists.");
                alert.showAndWait();
                // Clear the users input.
                searchByNameTextArea.setText("");
            }
        }
    }
    
    // When the return button is pressed, return the user to the main menu.
    @FXML
    private void returnButtonHandler(ActionEvent event) throws Exception {
        Utility.changeToScene(getClass(), event, "database.fxml");
    }
}
