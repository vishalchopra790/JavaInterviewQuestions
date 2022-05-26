package utilities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

public class FileFormat {
    public static void main(String[] args) {
        try {
            URL url=new URL("https://images-eu.ssl-images-amazon.com/images/G/31/img21/CEPC/Clearance/May21/D23947948_IN_CEPC_Clearance-store_May21_rush_1500x300.jpg");
            BufferedImage image=ImageIO.read(url);
            ImageIO.write(image,"png",new File("./ref.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
