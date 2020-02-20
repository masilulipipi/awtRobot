
import java.awt.Color;
import java.awt.Robot;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;

public class ColorPickerDemo {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            System.out.println("Hola, voy a intentar capturar la pantalla en el momento de la falla...");
            System.out.println("Diseñado e implementado por Lenardo Baini");
           while(true) {
           
            Color color = robot.getPixelColor(20, 20);
            if(color.getRed()+color.getBlue()+color.getGreen()==0) {// Es pantalla negra
            	 Pantallazo.capturarPantalla(dameFechaDeHoyConFormatoX("YYYY-MM-DD-hh-mm-ss"));
            	 System.out.println(dameFechaDeHoyConFormatoX("YYYY-MM-DD-hh-mm-ss")+" Pantalla Negra detectada!!!!");
            }
           
            TimeUnit.SECONDS.sleep(1);
            System.out.println(dameFechaDeHoyConFormatoX("YYYY-MM-DD-hh-mm-ss")+" Todo ok ");
           
           }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public static String dameFechaDeHoyConFormatoX(String formatoFechaseparadoXguionyGuionEntreComillas){//el MM va con mayuscula
        SimpleDateFormat formateador = new SimpleDateFormat(formatoFechaseparadoXguionyGuionEntreComillas, new Locale("es_ES"));
        Date fechaDate = new Date();
        String fecha=formateador.format(fechaDate);
         
    
   return fecha;
   }
    
}