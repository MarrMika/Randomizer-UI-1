package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class MainSceneController {
    private SecondSceneController secondSceneController = new SecondSceneController();
    private String filePath = null;
    private SceneController sceneController = SceneController.getObj();


    @FXML
    private TextField filePathTextField;


    @FXML
    private void onButtonClickSelectFile() {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            filePath = selectedFile.getAbsolutePath().trim();
            secondSceneController.setFilePath(filePath);
            filePathTextField.setText(filePath);
        } else {
            filePathTextField.setText("Виберіть файл");
        }


    }

    @FXML
    private void onButtonClickReadFile() {

        if (filePath != null) {
            sceneController.setCurrentSceneState(SceneStates.SECOND_SCENE);
        } else {
            filePathTextField.setText("Виберіть файл");
        }

    }


}
