import javax.swing.*;
import java.awt.*;

public class BigBird extends Bird
{
    private static Image image;
    private static int COUNT = 0;

    public BigBird(int cordX, int cordY) {
        super(cordX, cordY);
        COUNT++;
    }
    public void drawBird(Graphics g) {
        g.drawImage(image, cordX, cordY, null);
}

    @Override
    public void move(int dX, int dY) {
        cordX += dX;
        cordY += dY;
//        System.out.println("BigBird moved to (" + cordX + ";" + cordY + ")");
    }

    public static void SET_IMAGE(String imagePath) {
        image = new ImageIcon(imagePath).getImage();
    }

    public static void ZERO_COUNT() {
        COUNT = 0;
    }

    public static int GET_COUNT() {
        return COUNT;
    }

    public static Image GET_IMAGE() {
        return image;
    }

    @Override
    public String toString() {
        return "BigBird in " +  cordX + ";" + cordY;
    }
}
