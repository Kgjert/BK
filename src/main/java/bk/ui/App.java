package bk.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application{

    @Override
    public void start(final Stage stage) throws Exception{
        final FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("App.fxml"));
        final Parent root = fxmlLoader.load();
        final BkController controller = fxmlLoader.getController();

        final Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(final String[] args){
        launch(args);
    }

}
