package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import model.Friend;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class ThirdSceneController {

    private SceneController sceneController = SceneController.getObj();

    @FXML
    private Label nameLabel;
    @FXML
    private Hyperlink hyperlink;


    @FXML
    public void initialize() {
        randomFriend();

    }

    @FXML
    private void onButtonClick() {
        sceneController.setCurrentSceneState(SceneStates.SECOND_SCENE);
    }

    @FXML
    private void onHyperlinkClick() throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI(hyperlink.getText()));
    }


    private void randomFriend() {
        int number = (int) (Math.random() * SecondSceneController.friendList.size());
        Friend friend = SecondSceneController.friendList.get(number);
        nameLabel.setText(friend.getName());
        hyperlink.setText(friend.getURl());
    }


}
