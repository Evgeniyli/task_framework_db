package helper;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static constans.Constants.*;

public class DbConnection {
    public static Connection connection = null;

    private DbConnection() {
    }

    public static Connection dbConnection() throws SQLException {
        if (connection == null) {
            connection();
        }
        return connection;
    }

    private static void connection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println(DRIVER_LOADED);
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/db.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");
            System.out.println("Database url: " + url);
            System.out.println("User: " + user);
            connection = DriverManager.getConnection(url, user, password);
            System.out.println(OPEN_CONNECTION);

        } catch (SQLException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

