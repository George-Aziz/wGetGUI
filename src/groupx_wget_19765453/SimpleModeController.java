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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Georg
 */
public class SimpleModeController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button simpleBtn;
    @FXML
    private Button stdBtn;
    @FXML
    private Button batBtn;
    @FXML
    private RadioButton behBtn1;
    @FXML
    private RadioButton behBtn2;
    @FXML
    private RadioButton downloadBtn1;
    @FXML
    private RadioButton downloadBtn2;
    @FXML
    private RadioButton downloadBtn3;
    @FXML
    private RadioButton downloadBtn4;
    @FXML
    private RadioButton postDownloadBtn1;
    @FXML
    private RadioButton postDownloadBtn2;
    @FXML
    private RadioButton postDownloadBtn3;
    @FXML
    private RadioButton savingBtn1;
    @FXML
    private RadioButton savingBtn2;
    @FXML
    private RadioButton savingBtn3;
    @FXML 
    private ImageView saveIcon;
    @FXML
    private TextField directoryPath;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ToggleGroup behaviourGroup = new ToggleGroup();
        ToggleGroup downloadGroup = new ToggleGroup();
        ToggleGroup postDownloadGroup = new ToggleGroup();
        ToggleGroup savingGroup = new ToggleGroup();
        
        behBtn1.setToggleGroup(behaviourGroup);
        behBtn2.setToggleGroup(behaviourGroup);
        
        downloadBtn1.setToggleGroup(downloadGroup);
        downloadBtn2.setToggleGroup(downloadGroup);
        downloadBtn3.setToggleGroup(downloadGroup);
        downloadBtn4.setToggleGroup(downloadGroup);
        
        postDownloadBtn1.setToggleGroup(postDownloadGroup);
        postDownloadBtn2.setToggleGroup(postDownloadGroup);
        postDownloadBtn3.setToggleGroup(postDownloadGroup);
      
        savingBtn1.setToggleGroup(savingGroup);
        savingBtn2.setToggleGroup(savingGroup);
        savingBtn3.setToggleGroup(savingGroup);
        
        behBtn1.selectedProperty().set(true);
        downloadBtn1.selectedProperty().set(true);
        postDownloadBtn1.selectedProperty().set(true);
        savingBtn1.selectedProperty().set(true);
        
        saveIcon.setImage(new Image("file:Images/SaveIcon.png"));    
        saveIcon.cacheProperty().set(true);
    }  
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void handleSimpleBtn(ActionEvent event) throws Exception 
    { }
    
    @FXML
    private void handleStdBtn(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("StandardMode.fxml"));
        
        Stage window = (Stage) stdBtn.getScene().getWindow();
        //stdBtn.getScene().getStylesheets().add(getClass().getResource("wGetGUI.css").toExternalForm());
        window.setScene(new Scene(root,1400,900));
    }
    
    @FXML
    private void handleBatBtn(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("DirectBatAccess.fxml"));
        
        Stage window = (Stage) batBtn.getScene().getWindow();
        //batBtn.getScene().getStylesheets().add(getClass().getResource("wGetGUI.css").toExternalForm());
        window.setScene(new Scene(root,1400,900));
    }
    
    @FXML
    private void handleSaveIcon(MouseEvent event) throws Exception
    {
       DirectoryChooser directoryChooser = new DirectoryChooser();
       directoryChooser.setTitle("Save File Location");
       File selectedDirectory = directoryChooser.showDialog((Stage) simpleBtn.getScene().getWindow());
       if(selectedDirectory != null)
       {
           directoryPath.setText(selectedDirectory.getAbsolutePath());
       }
       else 
       {
            directoryPath.setText("Directory Path");
       }     
    }
}
