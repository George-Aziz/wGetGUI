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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Georg
 */
public class StandardModeController implements Initializable {
    
    private static boolean selectAllChecked = false;
    
    @FXML
    private Label label;
    @FXML
    private Button simpleBtn;
    @FXML
    private Button stdBtn;
    @FXML
    private Button batBtn;
    @FXML
    private AnchorPane sideMenu;
    @FXML
    private Button hostBtn;
    @FXML
    private Button fileBtn;
    @FXML
    private Button behBtn;
    @FXML
    private Button runBtn;
    @FXML
    private Button retBtn;
    @FXML
    private Line hostLine;
    @FXML
    private Line fileLine;
    @FXML
    private Line behLine;
    @FXML
    private Line runLine;
    @FXML
    private Line retLine;
    @FXML
    private ImageView hostImg;
    @FXML
    private ImageView fileImg;
    @FXML
    private ImageView behImg;
    @FXML
    private ImageView runImg;
    @FXML
    private ImageView retImg;
    @FXML
    private AnchorPane hostPane;
    @FXML
    private AnchorPane filePane;
    @FXML
    private AnchorPane behPane;
    @FXML
    private AnchorPane runPane;
    @FXML
    private AnchorPane retPane;
    @FXML
    private CheckBox selectAllCheck;
    @FXML
    private CheckBox htmlCheck;
    @FXML
    private CheckBox gifCheck;
    @FXML
    private CheckBox zipCheck;
    @FXML
    private CheckBox txtCheck;
    @FXML
    private CheckBox exeCheck;
    @FXML
    private CheckBox docCheck;
    @FXML
    private CheckBox jpgCheck;
    @FXML
    private CheckBox otherCheck;
    @FXML
    private ImageView saveIcon;
    @FXML
    private TextField directoryPath;
    @FXML
    private TextField includeBox;
    @FXML
    private TextField excludeBox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        hostBtn.getStylesheets().add(getClass().getResource("activeSideMenuButton.css").toExternalForm());
        hostImg.setImage(new Image("file:Images/HostIcon - Active.png"));
        fileImg.setImage(new Image("file:Images/FileIcon - Inactive.png"));
        behImg.setImage(new Image("file:Images/DownloadIcon - Inactive.png"));
        runImg.setImage(new Image("file:Images/RunIcon - Inactive.png"));
        retImg.setImage(new Image("file:Images/RetrievalIcon - Inactive.png")); 
        saveIcon.setImage(new Image("file:Images/SaveIcon.png"));
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
    { }
    
    @FXML
    private void handleBatBtn(ActionEvent event) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("DirectBatAccess.fxml"));
        
        Stage window = (Stage) batBtn.getScene().getWindow();
        window.setScene(new Scene(root,1400,900));
    }
    
    @FXML
    private void handleSideMenu(ActionEvent event) throws Exception 
    {
        hostBtn.getStylesheets().clear();
        fileBtn.getStylesheets().clear();
        behBtn.getStylesheets().clear();
        runBtn.getStylesheets().clear();
        retBtn.getStylesheets().clear();  
        if(event.getSource() == hostBtn)
        {

            hostBtn.getStylesheets().add(getClass().getResource("activeSideMenuButton.css").toExternalForm());
            fileBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            behBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            runBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            retBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            hostBtn.styleProperty();
            hostLine.setVisible(true);
            fileLine.setVisible(false);
            behLine.setVisible(false);
            runLine.setVisible(false);
            retLine.setVisible(false);    
            
            //Image Set
            hostImg.setImage(new Image("file:Images/HostIcon - Active.png"));
            fileImg.setImage(new Image("file:Images/FileIcon - Inactive.png"));
            behImg.setImage(new Image("file:Images/DownloadIcon - Inactive.png"));
            runImg.setImage(new Image("file:Images/RunIcon - Inactive.png"));
            retImg.setImage(new Image("file:Images/RetrievalIcon - Inactive.png")); 
            
            hostPane.visibleProperty().set(true);
            filePane.visibleProperty().set(false);
            behPane.visibleProperty().set(false);
            runPane.visibleProperty().set(false);
            retPane.visibleProperty().set(false);
        }
        else if(event.getSource() == fileBtn)
        {
            hostBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            fileBtn.getStylesheets().add(getClass().getResource("activeSideMenuButton.css").toExternalForm());
            behBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            runBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            retBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
           
            hostLine.setVisible(false);
            fileLine.setVisible(true);
            behLine.setVisible(false);
            runLine.setVisible(false);
            retLine.setVisible(false);
            //Image Set
            hostImg.setImage(new Image("file:Images/HostIcon - Inactive.png"));
            fileImg.setImage(new Image("file:Images/FileIcon - Active.png"));
            behImg.setImage(new Image("file:Images/DownloadIcon - Inactive.png"));
            runImg.setImage(new Image("file:Images/RunIcon - Inactive.png"));
            retImg.setImage(new Image("file:Images/RetrievalIcon - Inactive.png"));   
            
            hostPane.visibleProperty().set(false);
            filePane.visibleProperty().set(true);
            behPane.visibleProperty().set(false);
            runPane.visibleProperty().set(false);
            retPane.visibleProperty().set(false);
        }
        else if(event.getSource() == behBtn)
        {
            hostBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            fileBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            behBtn.getStylesheets().add(getClass().getResource("activeSideMenuButton.css").toExternalForm());
            runBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            retBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            hostLine.setVisible(false);
            fileLine.setVisible(false);
            behLine.setVisible(true);
            runLine.setVisible(false);
            retLine.setVisible(false);
            //Image Set
            hostImg.setImage(new Image("file:Images/HostIcon - Inactive.png"));
            fileImg.setImage(new Image("file:Images/FileIcon - Inactive.png"));
            behImg.setImage(new Image("file:Images/DownloadIcon - Active.png"));
            runImg.setImage(new Image("file:Images/RunIcon - Inactive.png"));
            retImg.setImage(new Image("file:Images/RetrievalIcon - Inactive.png")); 
            
            hostPane.visibleProperty().set(false);
            filePane.visibleProperty().set(false);
            behPane.visibleProperty().set(true);
            runPane.visibleProperty().set(false);
            retPane.visibleProperty().set(false);
        }
        else if(event.getSource() == runBtn)
        {
            hostBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            fileBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            behBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            runBtn.getStylesheets().add(getClass().getResource("activeSideMenuButton.css").toExternalForm());
            retBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            hostLine.setVisible(false);
            fileLine.setVisible(false);
            behLine.setVisible(false);
            runLine.setVisible(true);
            retLine.setVisible(false);
            //Image Set
            hostImg.setImage(new Image("file:Images/HostIcon - Inactive.png"));
            fileImg.setImage(new Image("file:Images/FileIcon - Inactive.png"));
            behImg.setImage(new Image("file:Images/DownloadIcon - Inactive.png"));
            runImg.setImage(new Image("file:Images/RunIcon - Active.png"));
            retImg.setImage(new Image("file:Images/RetrievalIcon - Inactive.png")); 
            
            hostPane.visibleProperty().set(false);
            filePane.visibleProperty().set(false);
            behPane.visibleProperty().set(false);
            runPane.visibleProperty().set(true);
            retPane.visibleProperty().set(false);
        }
        else if(event.getSource() == retBtn)
        {
            hostBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            fileBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            behBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            runBtn.getStylesheets().add(getClass().getResource("inActiveSideMenuButton.css").toExternalForm());
            retBtn.getStylesheets().add(getClass().getResource("activeSideMenuButton.css").toExternalForm());
            hostLine.setVisible(false);
            fileLine.setVisible(false);
            behLine.setVisible(false);
            runLine.setVisible(false);
            retLine.setVisible(true);
            //Image Set
            hostImg.setImage(new Image("file:Images/HostIcon - Inactive.png"));
            fileImg.setImage(new Image("file:Images/FileIcon - Inactive.png"));
            behImg.setImage(new Image("file:Images/DownloadIcon - Inactive.png"));
            runImg.setImage(new Image("file:Images/RunIcon - Inactive.png"));
            retImg.setImage(new Image("file:Images/RetrievalIcon - Active.png")); 
            
            hostPane.visibleProperty().set(false);
            filePane.visibleProperty().set(false);
            behPane.visibleProperty().set(false);
            runPane.visibleProperty().set(false);
            retPane.visibleProperty().set(true);
        }
    }
    
    @FXML
    private void handleSelectAll (ActionEvent event) throws Exception 
    {
        if(selectAllChecked)
        {
            selectAllChecked = false;
            selectAllCheck.selectedProperty().set(false);
            htmlCheck.selectedProperty().set(false);
            gifCheck.selectedProperty().set(false);
            zipCheck.selectedProperty().set(false);
            txtCheck.selectedProperty().set(false);
            exeCheck.selectedProperty().set(false);
            docCheck.selectedProperty().set(false);
            jpgCheck.selectedProperty().set(false);
            otherCheck.selectedProperty().set(false);
           
        }
        else 
        {
            selectAllChecked = true;
            selectAllCheck.selectedProperty().set(true);
            htmlCheck.selectedProperty().set(true);
            gifCheck.selectedProperty().set(true);
            zipCheck.selectedProperty().set(true);
            txtCheck.selectedProperty().set(true);
            exeCheck.selectedProperty().set(true);
            docCheck.selectedProperty().set(true);
            jpgCheck.selectedProperty().set(true);
            otherCheck.selectedProperty().set(true);
        }
        
    }
    
    @FXML
    private void handleSaveIcon(MouseEvent event) throws Exception
    {
       DirectoryChooser directoryChooser = new DirectoryChooser();
       directoryChooser.setTitle("Save File Location");
       File selectedDirectory = directoryChooser.showDialog((Stage) stdBtn.getScene().getWindow());
       if(selectedDirectory != null)
       {
           directoryPath.setText(selectedDirectory.getAbsolutePath());
       }
       else 
       {
            directoryPath.setText("Directory Path");
       }     
    }
    
    @FXML
    private void handleClearInBtn(ActionEvent event) throws IOException 
    {
        includeBox.clear();
    }
    
    @FXML
    private void handleClearExBtn(ActionEvent event) throws IOException 
    {
       excludeBox.clear();
    }
}
