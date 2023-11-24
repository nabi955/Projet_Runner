import javafx.scene.Parent;
import javafx.scene.Scene;



public class GameScene extends Scene {
    private Camera camera;
    private StaticThing backgroundLeft;
    private StaticThing backgroundRight;



    public GameScene(Parent root, double width, double height, Camera camera) {
        super(root, width, height);
        this.camera = camera;

        backgroundLeft = new StaticThing(width, height, "file:../img/background_left.png");
        backgroundRight = new StaticThing(width, height, "file:../img/background_right.png");

    }
    public void render() {
        // Modify positions based on the camera
        backgroundLeft.getImageView().getView(camera.getX());
        backgroundRight.getImageView().getView((int) (camera.getX() + getWidth()));
    }

}
