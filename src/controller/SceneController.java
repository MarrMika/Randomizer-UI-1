package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    private static SceneController obj = new SceneController();
    private Stage stage;
    private SceneStates currentSceneState;

    private SceneController() {
    }

    public static SceneController getObj() {
        return obj;
    }

    public void init(Stage stage) {
        this.stage = stage;
        stage.setResizable(false);
    }

    public void setCurrentSceneState(SceneStates currentSceneState) {
        this.currentSceneState = currentSceneState;
        handleSceneState();
    }

    private void handleSceneState() {
        Scene mainScene = null;
        Parent root = null;
        try {
            switch (currentSceneState) {
                case MAIN_SCENE:
                    root = FXMLLoader.load(getClass().getResource("/view/mainScene.fxml"));
                    mainScene = new Scene(root,800,800);
                    break;

                case SECOND_SCENE:
                    mainScene = new Scene(FXMLLoader.load(getClass().getResource("/view/scene2.fxml")), 800, 800,Color.CHOCOLATE);
                    break;

                case THIRD_SCENE:
                    mainScene = new Scene(FXMLLoader.load(getClass().getResource("/view/scene3.fxml")), 800, 800,Color.CHOCOLATE);
                    break;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        mainScene.getStylesheets().add("style/style.css");
        stage.setScene(mainScene);
        stage.show();
    }


}
