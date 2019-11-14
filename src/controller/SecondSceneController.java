package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Friend;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static controller.Main.sceneController;

public class SecondSceneController {
    public static List<Friend> friendList;
    private ObservableList<Friend> myObservableList;
    private static String filePath = "";

    public void setFilePath(String filePath) {
        SecondSceneController.filePath = filePath;
    }

    @FXML
    private ListView listView;

    @FXML
    public void initialize() {
        friendList = new ArrayList<>();
        getFriendList();
        myObservableList = FXCollections.observableArrayList(friendList);
        listView.setStyle("-fx-font-size: 24px; -fx-background-color: #BC8F8F;" +
                "-fx-control-inner-background: #FFFFE0;");
        listView.setItems(myObservableList);

    }


    @FXML
    private void onButtonClick() {
        sceneController.setCurrentSceneState(SceneStates.THIRD_SCENE);

    }


    private void getFriendList() {
        File file = new File(filePath);
        int count = 0;

        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                    count++;

                    String str = input.nextLine();
                    str = str.trim().substring(1,str.length()-1);
                    String[] parts = str.split("\",\"");
                    friendList.add(new Friend(""+count,parts[1],parts[0]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
