package MathsAidApp;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    public Button _createButton;
    public TextField _createField;

    public void handleCreateClick() {
    	CreateCreation createCreation = new CreateCreation(_createField.getText());
    	createCreation.create();
    	_createField.clear();
    }
    
    public void handleDeleteClick() {
    	System.out.println("Delete Here");
    }
    
    public void handlePlayClick() {
    	System.out.println("Play here");
    }

}