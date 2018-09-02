package Service;

import Enity.User;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImplTest
{
   /* @Test
    public void testGetAllUsers()
    {
        //is
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "admin", "admin"));
        users.add(new User(2, "dam", "zyl"));

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }

    @Test
    public void testAddUser()
    {
        //is
        List<User> users = new ArrayList<User>();
        User user = new User(1, "admin", "admin");
        users.add(user);

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        userService.addUser(user);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }


    @Test
    public void testRemoveUserById()
    {
        //is
        List<User> users = new ArrayList<User>();
        User admin = new User(1, "admin", "admin");
        User dam = new User(2, "dam", "zyl");
        users.add(admin);
        users.add(dam);

        //then
        UserServiceImpl userService = new UserServiceImpl(users);
        userService.removeUserById(1);
        users.remove(admin);
        List<User> usersFromTestClass = userService.getAllUsers();

        //expected
        Assert.assertEquals(users, usersFromTestClass);
    }*/
}
