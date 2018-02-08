package steps;

import bean.User;
import core.Hook;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.testng.Assert;

public class SearchingUser extends Hook {

    private User user = new User();

    @Given("I find a user by named <FirstName>")
    public void findingUserFromDbByName(@Named("FirstName") String name) throws Exception {
        user = userDao.getUserFromDb(name);
        System.out.println("User " + userDao.getUserFromDb(name).toString());
    }

    @Then("I check user is <FirstName> firsName")
    public void checkFirstNameOfUser(@Named("FirstName") String firstName) throws Exception {
        String firstUserName = user.getFirstName();
        Assert.assertEquals(firstUserName, firstName);
    }

    @Then("I check user is <LastName> lastName")
    public void checkLastNameOfUser(@Named("LastName") String lastName) throws Exception {
        String lastUserName = user.getLastName();
        Assert.assertEquals(lastUserName, lastName);
    }

    @Then("I check  age of a user is <Age> years")
    public void checkAgeOfUser(@Named("Age") int age) throws Exception {
        int userAge = user.getAge();
        Assert.assertEquals(userAge, age);
    }
}
