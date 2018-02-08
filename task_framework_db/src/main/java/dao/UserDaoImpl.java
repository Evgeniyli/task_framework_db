package dao;

import bean.User;
import helper.DbConnection;
import repository.UserRowMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static constans.Constants.SELECT_FIRST_NAME;

public class UserDaoImpl implements IUserDao {
    private static List<User> gettingAllUsers;

    public UserDaoImpl() throws SQLException {
        DbConnection.dbConnection();
    }

    static List<User> getAllUsersFromList() {
        return gettingAllUsers;
    }

    @Override
    public User getUserFromDb(String userName) throws Exception {
        PreparedStatement statement = DbConnection.dbConnection().prepareStatement(SELECT_FIRST_NAME);
        statement.setString(1, userName);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            return new UserRowMapper().unmap(resultSet);
        } else {
            return null;
        }
    }

    @Override
    public List<User> createUsers() {
        List<User> usersList = new ArrayList<>();
        User jeck = new User("Jeck", "Poter", 23);
        User polly = new User("Polly", "Molly", 35);
        User jennifer = new User("Jenifer", "Simpson", 18);
        User kate = new User("Kate", "Simpson", 25);
        User donald = new User("Donald", "Trump", 35);
        User joe = new User("Joe", "Peterson", 40);
        User jecki = new User("Jecki", "Jan", 35);
        usersList = Arrays.asList(jeck, polly, jennifer, kate, donald, joe, jecki);
        return usersList;
    }

    @Override
    public void getAllUsers() {
        gettingAllUsers = createUsers();
    }
}
