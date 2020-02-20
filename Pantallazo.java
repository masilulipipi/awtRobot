import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
 
class Pantallazo {
  public static void capturarPantalla(String Nombre) throws
           AWTException, IOException {
     BufferedImage captura = new Robot().createScreenCapture(
           new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()) );
 
     // Guardar Como JPEG
     File file = new File(Nombre + ".jpg");
     ImageIO.write(captura, "jpg", file);
  }
}