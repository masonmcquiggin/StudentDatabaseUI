package studentdatabase;

// The imports
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

// This class implements the Initializable interface, which means that 
// it must implement the initialize() method.
public class AddRecordController implements Initializable {

    // These are the names for vthe fx:id's and handlers.
    // @FXML allows the controller to access and manipulate the UI in the FXML file.
    @FXML
    private TextField idTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNametextField;
    @FXML
    private TextField exam1TextField;
    @FXML
    private TextField exam2TextField;
    @FXML
    private TextField exam3TextField;
    @FXML
    private Button addRecordButton;
    @FXML
    private Button returnButton;
    @FXML
    private Button clearAllButton;

    // Create a arrayList to save the student details into when the record is added.
    static ArrayList<Student> students;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        students = new ArrayList<Student>();
    }

    @FXML
    // ActionEvent is what happens when the addRecord button is clicked.
    // This button is going go through all the data validity checks prior to 
    // Adding the record to the list. If the inputs pass the error checks it
    // will be added.
    private void addRecordButtonHandler(ActionEvent event) {

        // This boolean is going help to only print the first error that occurs
        // Rather than all the errors after that as well.
        boolean isDataValid = true;

        // Before all the error checks make sure that the boolean is true so the code underneath executes.
        if (isDataValid == true) {
            // By using the fx:id we can get the text that the user has entered.
            // If the ID text area is empty the error will print.
            // .trim() removes all the whitespace.
            if (idTextField.getText().trim().length() == 0) {
                // Here we create a new error instance, which is a pop up window that displays a message.
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: ID cannot be left blank.");
                // .showAndWait() means we wait for the user the select an option to close the error.
                alert.showAndWait();
                // Finally change the boolean variable to false so it will not execute any other code blocks.
                isDataValid = false;

            } else {

                try {
                    // This try-catch code block is going to check if the input was an integer.
                    // If the String can change into a int than accept.
                    Integer.parseInt(idTextField.getText());

                } catch (NumberFormatException ex) { // Use a NumberFormatException a runtime exception.
                    // Else create and error and print it.
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Error: ID must be an integer.");
                    alert.showAndWait();
                    // Change boolean to false so it only prints the one error.
                    isDataValid = false;
                }
            }
        }

        // This block is checking if the first name input was left blank.
        if (isDataValid == true) {
            // To check if the textArea is empty we take the length of the text of the firstNameTextField.
            if (firstNameTextField.getText().trim().length() == 0) {
                // Show an error if it is.
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: First name cannot be left blank.");
                alert.showAndWait();
                // Change to false so the one error prints.
                isDataValid = false;
            }
        }

        // This block is checking if the last name input was left blank.
        if (isDataValid == true) {
            // Check if the last name textArea is empty.
            if (lastNametextField.getText().trim().length() == 0) {
                // If so, then create and print the error.
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: Last name cannot be left blank.");
                alert.showAndWait();
                isDataValid = false;
            }
        }

        // The code block is going to check if the exam 1 text area is either left blank
        // Between 0-100 and if its a number.
        if (isDataValid == true) {
            // Checks if the text area is empty.
            if (exam1TextField.getText().trim().length() == 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                // If so, create and print an error.
                alert.setHeaderText("Error: Exam 1 cannot be left blank.");
                alert.showAndWait();
                isDataValid = false;

            } else {

                try {
                    // This try-catch block is going to make sure that the String the user inputs
                    // Can be parsed into a int and if it cannot then we will print an error.
                    // On top of this, if the int is higher than 100 or lower than 0.
                    // Print another error saying that the number needs to be inbetween 0-100.
                    int exam1 = Integer.parseInt(exam1TextField.getText().trim());
                    // Checks if the exam score is inbetween 0-100.
                    if (exam1 < 0 || exam1 > 100) {
                        // Print error if it is not.
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText("Error: Exam 1 must be a number between 0 and 100.");
                        alert.showAndWait();
                        isDataValid = false;
                    }

                } catch (NumberFormatException ex) { // Using the NumberFormatException runtime error.
                    // Check if the input is an integer. Print the error if it cannot.
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Error: Exam 1 must be a number.");
                    alert.showAndWait();
                    isDataValid = false;
                }
            }
        }

        // This try-catch block is going to make sure that the String the user inputs
        // Can be parsed into a int and if it cannot then we will print an error.
        // On top of this, if the int is higher than 100 or lower than 0.
        // Print another error saying that the number needs to be inbetween 0-100.
        if (isDataValid == true) {
            // Checks in the textArea is empty.
            if (exam1TextField.getText().trim().length() == 0) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: Exam 2 cannot be left blank.");
                alert.showAndWait();
                isDataValid = false;

            } else {

                try {

                    int exam2 = Integer.parseInt(exam2TextField.getText().trim());
                    // Check if input is inbetween 0-100.
                    if (exam2 < 0 || exam2 > 100) {
                        // Print an error if it is not.
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText("Error: Exam 2 must be a number between 0 and 100.");
                        alert.showAndWait();
                        isDataValid = false;
                    }
                } catch (NumberFormatException ex) { // A runtime exception to check if it is a integer.
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Error: Exam 2 must be a number.");
                    alert.showAndWait();
                    isDataValid = false;
                }
            }
        }

        // This try-catch block is going to make sure that the String the user inputs
        // Can be parsed into a int and if it cannot then we will print an error.
        // On top of this, if the int is higher than 100 or lower than 0.
        // Print another error saying that the number needs to be inbetween 0-100.
        if (isDataValid == true) {
            if (exam1TextField.getText().trim().length() == 0) {
                // Check if the textArea is empty.
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText("Error: Exam 3 cannot be left blank.");
                alert.showAndWait();
                isDataValid = false;

            } else {

                try {
                    // Parse the String the the user inputted and check if it is inbetween 0-100
                    int exam3 = Integer.parseInt(exam3TextField.getText().trim());
                    if (exam3 < 0 || exam3 > 100) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText("Error: Exam 3 must be a number between 0 and 100.");
                        alert.showAndWait();
                        isDataValid = false;
                    }
                } catch (NumberFormatException ex) {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Error: Exam 3 must be a number.");
                    alert.showAndWait();
                    isDataValid = false;
                }
            }
        }

        // This block is going to check if a student in the students arrayList has the same ID.
        if (isDataValid == true) {
            // Loops through the students in Student arrayList.
            for (Student student : students) {
                // By getting the ID we can check if it equals the number in the ID textArea.
                if (student.getId().equals(idTextField.getText().trim())) {
                    // If the two numbers match then we print an error.
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setHeaderText("Error: ID already exists.");
                    alert.showAndWait();
                    isDataValid = false;
                    break;
                }
            }
        }

        // Add student if data is valid and ID doesn't already exist
        if (isDataValid == true) {
            // If all the data fields are inputted correctly then create a new student and save the details in the arrayList.
            Student s = new Student(firstNameTextField.getText().trim(), lastNametextField.getText().trim(), idTextField.getText().trim(), exam1TextField.getText().trim(), exam2TextField.getText().trim(), exam3TextField.getText().trim());
            // This adds the student.
            students.add(s);
            // This keeps count of the amount of students in the list.
            Student.increaseStudents();
            // Prints a message to the user that the student was created.
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Success! Record added.");
            // Prints contentText that displays the details back to the user.
            alert.setContentText(firstNameTextField.getText() + " " + lastNametextField.getText() + " (ID #" + idTextField.getText() + ") has been added to the FSC Grade Book.\n");
            alert.showAndWait();
        }
    }

    // This action button will return the user back to the main menu when pressed.
    // This has a checked exception and needed to be dealt with for the code to run.
    @FXML
    private void returnButtonHandler(ActionEvent event) throws Exception {
        Utility.changeToScene(getClass(), event, "database.fxml");
    }

    // The clear all action button will clear all the textArea field.
    @FXML
    private void clearAllButtonHandler(ActionEvent event) {
        firstNameTextField.setText("");
        lastNametextField.setText("");
        idTextField.setText("");
        exam1TextField.setText("");
        exam2TextField.setText("");
        exam3TextField.setText("");
    }

}

