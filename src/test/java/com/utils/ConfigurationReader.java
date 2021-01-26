package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties  = new Properties();

    static {

        try {

            InputStream  inputStream= new FileInputStream("configuration.properties");
            properties.load(inputStream);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration.properties file!");

        }

    }

    public static String getProperty(String key){

        return properties.getProperty(key);
    }


}
