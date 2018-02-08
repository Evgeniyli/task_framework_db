package dao;

import bean.User;
import helper.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static constans.Constants.CREATE_TABLE;
import static constans.Constants.INSERT_INTO_USERS;

public class DaoDbImpl implements IDaoDb {

    private static Connection getConnection;

    @Override
    public void createTableByName() throws SQLException {
        try {
            getConnection = DbConnection.connection;
            PreparedStatement create = getConnection.prepareStatement(CREATE_TABLE);
            create.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Table successfully created");
        }
    }

    @Override
    public void insertUsersInDb() {
        getConnection = DbConnection.connection;
        for (User user : UserDaoImpl.getAllUsersFromList()) {
            try {
                PreparedStatement posted = getConnection.prepareStatement(INSERT_INTO_USERS + "VALUES('" + user.getId() + "','" + user.getFirstName() + "','" + user.getLastName() + "','" + user.getAge() + "')");
                posted.execute();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Insert is successful ");
            }
        }
    }
}

