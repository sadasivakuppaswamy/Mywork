package jaya;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by Sadasiva.Kuppaswamy on 28-08-2015.
 */
public class ReadPropertiesFile {
    public static void main(String[] args) throws Exception{
        try {
           File file = new File("src\\test.properties");
          //  InputStream in=getClass().getClassLoader().getResourceAsStream("app.properties");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInput);
         //   fileInput.close();

            /*Enumeration enuKeys = properties.keys();
            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                System.out.println(key + ": " + value);*/
           System.out.println(properties.getProperty("userName"));
            System.out.print(properties.getProperty("password"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
