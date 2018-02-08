package dao;

import java.sql.SQLException;

public interface IDaoDb {
    void createTableByName() throws SQLException;

    void insertUsersInDb();
}
