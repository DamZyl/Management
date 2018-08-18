package Service;

import org.junit.Test;
import org.junit.Assert;

public class UserServiceTest
{
    @Test
    public void testGetUserCountNormal()
    {
        //is
        String[] users = {"Damian", "Marek"};
        UserService userService = new UserService(users);

        //then
        final int result = userService.getUsersCount();

        //expected
        Assert.assertEquals(2, result);
    }

    @Test
    public void testGetUserCountZero()
    {
        //is
        String[] users = {};
        UserService userService = new UserService(users);

        //then
        final int result = userService.getUsersCount();

        //expected
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCountRepeatsUserWithRepeats()
    {
        //is
        String[] users = {"Damian", "Marek", "Damian"};
        UserService userService = new UserService(users);

        //then
        final int result = userService.getCountRepeatsByLogin("Damian");

        //expected
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCountRepeatsUserWithoutRepeats()
    {
        //is
        String[] users = {"Damian", "Marek", "Damian"};
        UserService userService = new UserService(users);

        //then
        final int result = userService.getCountRepeatsByLogin("Wojciech");

        //expected
        Assert.assertEquals(0, result);
    }

    @Test
    public void testIsUserExistWhenUserExist()
    {
        //is
        String[] users = {"Damian", "Marek", "Damian"};
        UserService userService = new UserService(users);

        //then
        final boolean result = userService.isUserExist("Marek");

        //expected
        Assert.assertTrue(result);
    }

    @Test
    public void testIsUserExistWhenUserNoExist()
    {
        //is
        String[] users = {"Damian", "Marek", "Damian"};
        UserService userService = new UserService(users);

        //then
        final boolean result = userService.isUserExist("Wojciech");

        //expected
        Assert.assertFalse(result);
    }

}
