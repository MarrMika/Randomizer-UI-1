import controller.SceneController;
import controller.SceneStates;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static SceneController sceneController = SceneController.getObj();

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.getIcons().add(new Image("res/icon.png"));
        sceneController.init(primaryStage);
        sceneController.setCurrentSceneState(SceneStates.MAIN_SCENE);
    }
}
