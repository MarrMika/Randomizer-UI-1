package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import model.Friend;

import static controller.Main.sceneController;

public class ThirdSceneController {


    @FXML
    private Label nameLabel;
    @FXML
    private Label URLLabel;


    @FXML
    public void initialize() {
        randomFriend();

    }

    @FXML
    private void onButtonClick() {
        sceneController.setCurrentSceneState(SceneStates.SECOND_SCENE);

    }

    private void randomFriend() {
        int number = (int) (Math.random() * SecondSceneController.friendList.size());
        Friend friend = SecondSceneController.friendList.get(number);
        nameLabel.setText(friend.getName());
        URLLabel.setText(friend.getURl());
    }




}
