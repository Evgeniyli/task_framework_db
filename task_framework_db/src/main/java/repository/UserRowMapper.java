package repository;

import bean.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements IRowMapper {
    public User unmap(ResultSet resultSet) throws SQLException {
        User user = new User();
        user.setId(resultSet.getInt("id"));
        user.setFirstName(resultSet.getString("first_name"));
        user.setLastName(resultSet.getString("last_name"));
        user.setAge(resultSet.getInt("age"));
        return user;
    }
}