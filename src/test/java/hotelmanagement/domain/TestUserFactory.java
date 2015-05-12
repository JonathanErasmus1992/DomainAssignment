package hotelmanagement.domain;

import hotelmanagement.conf.UserFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;

/**
 * Created by student on 2015/05/05.
 */
public class TestUserFactory {
    private User user;
    private User newUser;
    @Before
    public void setUp()
    {
        user = UserFactory.createUser("John", "1234");

    }
    @Test
    public void testCreate() throws Exception
    {
        Assert.assertEquals("John", user.getUsername());
    }
    @Test
    public void testUpdate() throws Exception
    {
        newUser = new User
                .Builder(user.getUsername())
                .copy(user)
                .password("4321")
                .build();
        Assert.assertEquals("John", newUser.getUsername());
        Assert.assertEquals("4321", newUser.getPassword());
    }
    @After
    public void tearDown()
    {

    }
}
