package constans;

public class Constants {
    public static final String SELECT_FIRST_NAME = "SELECT * FROM users WHERE first_name = ?";
    public static final String OPEN_CONNECTION = "----------------------Open connection---------------------";
    public static final String CLOSED_CONNECTION = "-------------------Closed connection-------------------";
    public static final String DRIVER_LOADED = "Driver loaded";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS users(id INT(11) NOT NULL AUTO_INCREMENT, first_name VARCHAR(45),last_name VARCHAR(45),age INT (45),PRIMARY KEY (id))";
    public static final String INSERT_INTO_USERS = "INSERT INTO users (id,first_name,last_name,age)";
}
