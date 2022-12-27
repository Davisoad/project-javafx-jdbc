package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

    @FXML 
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private Label labelErrorName;

    @FXML 
    private Button btnSave;

    @FXML
    private Button btnCancel;

    @FXML
    public void onBtnSaveAction() {
        System.out.println("save");
    }

    @FXML
    public void onBtnCancelAction() {
        System.out.println("Cancel");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {   
        initializeNodes();
    }
    
    private void initializeNodes() {
        Constraints.setTextFieldInteger(txtID);
        Constraints.setTextFieldMaxLength(txtName, 30);
    }
}
