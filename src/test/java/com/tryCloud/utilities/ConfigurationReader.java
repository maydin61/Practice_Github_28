package com.tryCloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1- Create the object of Properties
    private static Properties properties = new Properties();

    //run before the all the logic once a time
    static{

        try {

            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");
            // can read any file : FileInputStream
            //3- Load the properties object using FileInputStream object
            properties.load(file);

            //close the file
            file.close();


        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class(file).");
            e.printStackTrace();
        }

    }

    public static String getProperty(String keyword){
        // keyword ==> will check the file in configuration.properties file to match
        // one of them and use it.
        return properties.getProperty(keyword);
    }
}
