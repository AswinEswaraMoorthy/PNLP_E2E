package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class loadProperties{
	
	public static String getProperties(String key) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\aswin.moorthy\\Automation\\PNLP_BDD\\config.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        return properties.getProperty(key);
    }

	
}
