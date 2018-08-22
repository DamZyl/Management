package Dao;

import Api.UserDao;
import Enity.User;

import java.util.List;

public class UserDaoImpl implements UserDao
{
    private final String fileName;

    public UserDaoImpl(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void saveUser(User user)
    {
        List<User> users = this.getAllUsers();
        users.add(user);
        this.saveUsers(users);
    }

    @Override
    public void saveUsers(List<User> users)
    {

    }

    @Override
    public void removeUserById(int id)
    {

    }

    @Override
    public void removeUserByLogin(String login)
    {

    }

    @Override
    public List<User> getAllUsers()
    {
        return null;
    }

    @Override
    public User getUserById(int id)
    {
        return null;
    }

    @Override
    public User getUserByLogin(String login)
    {
        return null;
    }
}
