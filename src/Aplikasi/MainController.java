/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplikasi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Griya Salbini
 */
public class MainController implements Initializable {

    @FXML
    TreeView <String> treeView;
    
    // Library Gambar Icon
//    Image icon = new Image (getClass().getResourceAsStream("/Resource/icon.png"));
    Image icon = new Image("/Resource/icon.png", 15, 15, false, false);

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon));
        root.setExpanded(true); //Folder root terexpand
        
        TreeItem<String> nodeA = new TreeItem<>("node A", new ImageView(icon));
        TreeItem<String> nodeB = new TreeItem<>("node B", new ImageView(icon));
        TreeItem<String> nodeC = new TreeItem<>("node C", new ImageView(icon));
        root.getChildren().addAll(nodeA,nodeB,nodeC);
        
        TreeItem<String> nodeA1 = new TreeItem<>("node A1", new ImageView(icon));
        TreeItem<String> nodeB1 = new TreeItem<>("node B1", new ImageView(icon));
        TreeItem<String> nodeC1 = new TreeItem<>("node C1", new ImageView(icon));
        nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);
        
        treeView.setRoot(root);
    }
    
    // Event mouse click
    public void mouseClick (MouseEvent mouseEvent){
        if (mouseEvent.getClickCount() == 2) {
            TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
            System.out.println(item.getValue());
        }
    }
}
