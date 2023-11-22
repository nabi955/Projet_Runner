import javafx.scene.image.Image;

import javax.swing.text.Element;
import javax.swing.text.html.ImageView;

public class StaticThing {
    private ImageView imageView;
    private double sizeX;
    private double sizeY;


    public StaticThing( double sizeX, double sizeY, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image image = new Image(fileName);
        this.imageView = new ImageView((Element) image);

    }

    public ImageView getImageView() {
        return imageView;
    }

}
