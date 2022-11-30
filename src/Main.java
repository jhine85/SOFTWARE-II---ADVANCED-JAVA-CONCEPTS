import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    /**
     * Loads login GUI
     * @param primaryStage the stage to be loaded
     * @throws Exception if the file is not found
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("welcome.fxml")));
        primaryStage.setTitle("Welcome");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     *
     * @param fxml the fxml file to be loaded.
     * @return the parent fxml loader.
     * @throws IOException if the file cannot be found.
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Loads main GUI.
     * @param file the FXML file to be loaded.
     * @throws IOException if the file cannot be found.
     */
    public static void loadHome(String file) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(file), 1400, 800);
        stage.setTitle("Dashboard");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        stage.setMaxHeight(stage.getHeight());
        stage.setMaxWidth(stage.getWidth());
    }

    /**
     * Loads add customer GUI.
     * @param file the FXML file to be loaded.
     * @throws IOException if the file cannot be found.
     */
    public static void loadAddCustomer(String file) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(file), 439, 454);
        stage.setTitle("Add Customer");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        stage.setMaxHeight(stage.getHeight());
        stage.setMaxWidth(stage.getWidth());
    }

    /**
     * Loads upcoming appointment GUI.
     * @param file the FXML file to be loaded.
     * @throws IOException if the file cannot be found.
     */
    public static void loadUpcomingAppointment(String file) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(file), 439, 235);
        stage.setTitle("Upcoming Appointment");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        stage.setMaxHeight(stage.getHeight());
        stage.setMaxWidth(stage.getWidth());
    }

    /**
     * Loads the add appointment GUI.
     * @param file the FXML file to be loaded.
     * @throws IOException if the file cannot be found.
     */
    public static void loadAddAppointment(String file) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(file), 660, 450);
        stage.setTitle("Add Appointment");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        stage.setMaxHeight(stage.getHeight());
        stage.setMaxWidth(stage.getWidth());
    }

    /**
     * Loads the modify customer GUI.
     * @param file the FXML file to be loaded.
     * @throws IOException if the file cannot be found.
     */
    public static void loadModifyCustomer(String file) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(file), 1481, 454);
        stage.setTitle("Modify Customer");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        stage.setMaxHeight(stage.getHeight());
        stage.setMaxWidth(stage.getWidth());
    }

    /**
     * Loads the modify appointment GUI.
     * @param file the FXML file to be loaded.
     * @throws IOException if the file cannot be found.
     */
    public static void loadModifyAppointment(String file) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(file), 1424, 566);
        stage.setTitle("Modify Appointment");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        stage.setMaxHeight(stage.getHeight());
        stage.setMaxWidth(stage.getWidth());
    }

    /**
     * Loads report GUI.
     * @param file the FXML file to be loaded.
     * @throws IOException if the file cannot be found.
     */
    public static void loadReports(String file) throws IOException {
        Stage stage = new Stage();
        Scene scene = new Scene(loadFXML(file), 880, 415);
        stage.setTitle("Reports");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
        stage.setMaxHeight(stage.getHeight());
        stage.setMaxWidth(stage.getWidth());
    }


    /**
     * Main method
     * @param args starting arguments
     */
    public static void main(String[] args) {
        JDBC.makeConnection();
        launch(args);
        JDBC.closeConnection();
    }
}
