package steps;
import core.Hook;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

import java.sql.SQLException;


public class CreatingUsers extends Hook {

    @Given("I connect to database")
    public void connectDb() throws SQLException {
        createDaoImpl();
    }

    @When("I create users with parameters")
    public void createUsersWithParameters(){
        userDao.createUsers();
    }

    @When("I get users from list")
    public void getUserFromList(){
        userDao.getAllUsers();
    }

    @When("I create table by name")
    public void createTableByName() throws SQLException {
        iDaoDb.createTableByName();
        iDaoDb.insertUsersInDb();
    }
}
