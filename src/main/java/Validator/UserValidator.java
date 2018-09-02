package Validator;

import Api.UserDao;
import Dao.UserDaoImpl;
import Enity.User;
import Exception.UserShortLengthPasswordException;
import Exception.UserShortLengthLoginException;
import Exception.UserLoginAlredyExistException;

import java.io.IOException;

public class UserValidator
{
    private final int MIN_PASSWORD_LENGTH = 6;
    private final int MIN_LOGINM_LENGTH = 4;
    private UserDao userDao = UserDaoImpl.getInstance();

    private static UserValidator instance = null;

    public static UserValidator getInstance()
    {
        if(instance == null)
        {
            instance = new UserValidator();
        }

        return instance;
    }

    private UserValidator()
    {

    }

    public boolean isValidate(User user) throws UserShortLengthPasswordException, UserShortLengthLoginException, UserLoginAlredyExistException
    {
        if(isPasswordLengthEnough(user.getPassword()))
        {
            throw new UserShortLengthPasswordException("Password is too short!");
        }

        if(isLoginLengthEnough(user.getLogin()))
        {
            throw new UserShortLengthLoginException("Login is too short!");
        }

        if(isLoginExist(user.getLogin()))
        {
            throw new UserLoginAlredyExistException("Login is already exist!");
        }

        return true;
    }

    private boolean isPasswordLengthEnough(String password)
    {
        return password.length() >= MIN_PASSWORD_LENGTH;
    }

    private boolean isLoginLengthEnough(String login)
    {
        return login.length() >= MIN_LOGINM_LENGTH;
    }

    private boolean isLoginExist(String login)
    {
        User user = null;

        try
        {
            user = userDao.getUserByLogin(login);
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }

        if(user == null)
        {
            return false;
        }

        return true;
    }
}
