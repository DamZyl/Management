package Service;

import Api.UserDao;
import Api.UserService;
import Dao.UserDaoImpl;
import Enity.User;
import Validator.UserValidator;
import Exception.UserShortLengthPasswordException;
import Exception.UserShortLengthLoginException;
import Exception.UserLoginAlredyExistException;
import java.io.IOException;
import java.util.List;

public class UserServiceImpl implements UserService
{
    private UserDao userDao = UserDaoImpl.getInstance();
    private UserValidator userValidator = UserValidator.getInstance();
    private static UserServiceImpl instance = null;

    public static UserServiceImpl getInstance()
    {
        if(instance == null)
        {
            instance = new UserServiceImpl();
        }

        return instance;
    }

    private UserServiceImpl()
    {

    }

    @Override
    public List<User> getAllUsers() throws IOException
    {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) throws IOException, UserShortLengthPasswordException, UserShortLengthLoginException, UserLoginAlredyExistException
    {
        if(userValidator.isValidate(user))
        {
            userDao.saveUser(user);
        }
    }

    @Override
    public void removeUserById(int userId) throws IOException
    {
        userDao.removeUserById(userId);
    }
}
