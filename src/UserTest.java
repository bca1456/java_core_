import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    private User user1;
    private User user2;
    private User user3;

    private User badUser1;
    private User badUser2;

    @Before
    public void setUp() {
        user1 = new User("Mike", 31, Sex.MALE);
        user2 = new User("Helen", 23, Sex.FEMALE);
        user3 = new User("John", 77, Sex.MALE);

        badUser1 = new User("", -4, null);
        badUser2 = new User(null, 0, Sex.MALE);
    }

    @Test
    public void getAllUsers() {
        //expected data from method
        List<User> expectedData = User.getAllUsers();

        //actual data
        List<User> actualData = new ArrayList<>();
        actualData.add(user1);
        actualData.add(user2);
        actualData.add(user3);

        Assertions.assertEquals(expectedData, actualData);
    }

    @Test
    public void isGetAllUsersNoNPE(){
        List<User> expectedData = User.getAllUsers();
        Assertions.assertNotNull(expectedData);
    }

    @Test
    public void isGetAllUsersByMALE(){
        List<User> expectedData = User.getAllUsers(Sex.MALE);

        List<User> actualData = new ArrayList<>();
        actualData.add(user1);
        actualData.add(user3);

        Assertions.assertEquals(expectedData, actualData);
    }

    @Test
    public void isGetAllUsersByMALE_NOT_NULL(){
        List<User> expectedData = User.getAllUsers(Sex.MALE);
        Assertions.assertNotNull(expectedData);
    }

    @Test
    public void isGetHowManyUsers(){
        int expected = User.getHowManyUsers();

        int actual = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isGetHowManyUsersByMALE(){
        int expected = User.getHowManyUsers(Sex.MALE);

        int actual = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void isNewUserHasEmptyName(){
        for (User user: User.getAllUsers()) {
            if(user.getName() != null && user.getName().isEmpty()){
                Assert.fail("Creating user with empty name");
            }
        }
    }
}