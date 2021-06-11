/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupx_wget_19765453;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Georg
 */
public class DirectBatAccessController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button simpleBtn;
    @FXML
    private Button stdBtn;
    @FXML
    private Button batBtn;
    @FXML
    private TextField wGetStartBox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private void handleSimpleBtn(ActionEvent event) throws Exception 
    {
        Parent root = FXMLLoader.load(getClass().getResource("SimpleMode.fxml"));
        
        Stage window = (Stage) stdBtn.getScene().getWindow();
        window.setScene(new Scene(root,1400,900));
    }
    
    @FXML
    private void handleStdBtn(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("StandardMode.fxml"));
        
        Stage window = (Stage) stdBtn.getScene().getWindow();
        window.setScene(new Scene(root,1400,900));
    }
    
    @FXML
    private void handleBatBtn(ActionEvent event) throws IOException 
    { }
    
    @FXML
    private void handleClearBtn(ActionEvent event) throws IOException 
    {
       wGetStartBox.clear();
    }
    
     
    @FXML
    private void handleImportBtn(ActionEvent event) throws Exception
    {
       FileChooser fileChooser = new FileChooser();
       fileChooser.setTitle("Import wGetStart.bat file");
       fileChooser.getExtensionFilters().add(new ExtensionFilter(".bat files", "*.bat"));
       fileChooser.showOpenDialog((Stage) stdBtn.getScene().getWindow());
    }
    
    @FXML
    private void handleSaveBtn(ActionEvent event) throws Exception
    {
       DirectoryChooser directoryChooser = new DirectoryChooser();
       directoryChooser.setTitle("Save File Location");
       File selectedDirectory = directoryChooser.showDialog((Stage) stdBtn.getScene().getWindow());
    }
}
