package com.wecp.progressive.config;
<<<<<<< HEAD
 
import java.io.IOException;
=======

>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
<<<<<<< HEAD
 
public class DatabaseConnectionManager {
private static final Properties properties = new Properties();
static{
    loadProperties();
}
private static void loadProperties(){
    try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
        if(input == null){
            throw new IllegalStateException("resource.properties not found in classpath");
        }
        properties.load(input);
    } catch (IOException e) {
        throw new RuntimeException("Error loading properties file",e);
    }
}
public static Connection getConnection() throws SQLException{
    return DriverManager.getConnection(properties.getProperty("spring.datasource.url"), properties.getProperty("spring.datasource.username"), properties.getProperty("spring.datasource.password"));
}
}
=======

public class DatabaseConnectionManager {
    private static final Properties properties = new Properties();
    static{
        loadProperties();
    }
    private static void loadProperties(){
        try (InputStream input = DatabaseConnectionManager.class.getClassLoader().getResourceAsStream("application.properties")) {
            if(input == null){
                throw new IllegalStateException("resourse.properties not found in classpath");
            }
            properties.load(input);
            
        } catch (Exception e) {
            throw new RuntimeException("Error loading properties filr", e);
        }
    }
        public static Connection getConnection() throws SQLException{
            String url =properties.getProperty("spring.datasource.url");
            String user =properties.getProperty("spring.datasource.username");
            String password =properties.getProperty("spring.datasource.password");
            return DriverManager.getConnection(url,user,password);
        
        } 
    
    

}
>>>>>>> 23c4a4a596aa7175a7aaebb34068c3fe7893923b
