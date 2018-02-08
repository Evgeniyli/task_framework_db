package repository;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IRowMapper<T> {
    T unmap(ResultSet resultSet) throws SQLException;
}
