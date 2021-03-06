package principal;

import data.PaintThread;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import views.MainView;

/**
 * JavaFX ColorCanvas
 */
public class ColorCanvas extends Application {

    @Override
    public void start(Stage stage) {
        MainView mV = new MainView();
        Scene scene = new Scene(mV.getRoot(), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        PaintThread.killThread();
    }
    
    public static void main(String[] args) {
        launch();
    }

}