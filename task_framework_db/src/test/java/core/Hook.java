package core;

import dao.DaoDbImpl;
import dao.IDaoDb;
import dao.IUserDao;
import dao.UserDaoImpl;
import helper.DbConnection;
import org.jbehave.core.annotations.AfterStories;

import java.sql.SQLException;

import static constans.Constants.CLOSED_CONNECTION;

public class Hook {

    protected static IUserDao userDao;
    protected static IDaoDb iDaoDb;

    protected static void createDaoImpl() throws SQLException {
        userDao = new UserDaoImpl();
        iDaoDb = new DaoDbImpl();
    }

    @AfterStories
    public void close() throws SQLException {
        System.out.println(CLOSED_CONNECTION);
        DbConnection.dbConnection().close();
    }
}
