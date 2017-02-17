package jaya;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by Sadasiva.Kuppaswamy on 03-09-2015.
 */
public class Log4jExample {
    static Logger log = Logger.getLogger(Log4jExample.class.getName());

    public static void main(String[] args)throws IOException,SQLException {

        String log4JPropertyFile = "src/log4j2.properties";
        Properties p = new Properties();

        try {
            p.load(new FileInputStream(log4JPropertyFile));
            PropertyConfigurator.configure(p);
            log.info("Wow! I'm configured!");
        } catch (IOException e) {
            //DAMN! I'm not....

        }
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}
