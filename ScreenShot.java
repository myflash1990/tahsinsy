import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenShot {

    public static void main(String[] args) throws IOException {
        String name = "ScreenShot.png";

        try {
            Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = new Robot().createScreenCapture(rect);
            File file = new File(name);
            ImageIO.write(image,"png",file);


        } catch (AWTException e) {

            e.printStackTrace();
        }
    }
}
/Users/macbookpro/Desktop/JavaPrograms/takingScreenShot/src/ScreenShot.java
