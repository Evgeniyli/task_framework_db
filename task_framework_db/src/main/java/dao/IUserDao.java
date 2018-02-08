package dao;

import bean.User;

import java.util.List;

public interface IUserDao {

    User getUserFromDb(String userName) throws Exception;

    List<User> createUsers();

    void getAllUsers();
}
