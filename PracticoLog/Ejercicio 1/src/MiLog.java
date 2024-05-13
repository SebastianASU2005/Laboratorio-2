import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MiLog {


    static {
        try (InputStream inputStream = MiLog.class.getResourceAsStream("/logging.properties")) {
            LogManager.getLogManager().readConfiguration(inputStream);
        } catch (IOException e) {
            System.err.println("Error al cargar la configuración de logging: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        logger.info("Se inicio la aplicacion");
    }
}