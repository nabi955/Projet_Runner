import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Load sprite sheet
        Image spriteSheet = new Image("file:../img/heros.png");

        // Create ImageView
        ImageView sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20, 0, 65, 100));
        sprite.setX(200);
        sprite.setY(300);

        // Create Camera
        Camera camera = new Camera(0, 0);

        // Create Group and add ImageView
        Group root = new Group(sprite);

        // Create GameScene with the Group and Camera
        GameScene gameScene = new GameScene(root, 800, 600, camera);

        // Set up the stage
        primaryStage.setScene(gameScene);
        primaryStage.setTitle("Image Display");
        primaryStage.show();

        // Print Camera coordinates
        System.out.println("Initial Camera Coordinates: " + camera);
    }


    public static void main(String[] args) {
        launch(args);
    }
}