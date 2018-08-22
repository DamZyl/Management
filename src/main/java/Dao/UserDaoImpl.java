package Dao;

import Api.UserDao;
import Enity.Parser.UserParser;
import Enity.User;
import Utils.FileUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao
{
    private final String fileName;

    public UserDaoImpl(String fileName) throws IOException
    {
        this.fileName = fileName;
        FileUtils.createNewFile(fileName);
    }

    @Override
    public void saveUser(User user) throws IOException
    {
        List<User> users = this.getAllUsers();
        users.add(user);
        this.saveUsers(users);
    }

    @Override
    public void saveUsers(List<User> users) throws FileNotFoundException
    {
        FileUtils.clearFile(fileName);
        PrintWriter printWriter = new PrintWriter(fileName);

        for(User user: users)
        {
            printWriter.println(users.toString());
        }

        printWriter.close();
    }

    @Override
    public void removeUserById(int id) throws IOException
    {
        List<User> users = this.getAllUsers();

        for(User user: users)
        {
            if(user.getId() == id)
            {
                users.remove(user);
                break;
            }
        }

        this.saveUsers(users);
    }

    @Override
    public void removeUserByLogin(String login) throws IOException
    {
        List<User> users = this.getAllUsers();

        for(User user: users)
        {
            if(user.getLogin().equals(login))
            {
                users.remove(user);
                break;
            }
        }

        this.saveUsers(users);
    }

    @Override
    public List<User> getAllUsers() throws IOException
    {
        List<User> users = new ArrayList<User>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String readLine = reader.readLine();
        while(readLine != null)
        {
            User user = UserParser.stringToUser(readLine);

            if(user != null)
            {
                users.add(user);
            }

            readLine = reader.readLine();
        }

        reader.close();

        return users;
    }

    @Override
    public User getUserById(int id) throws IOException
    {
        List<User> users = this.getAllUsers();

        for(User user: users)
        {
            if(user.getId() == id)
            {
                return user;
            }
        }

        return null;
    }

    @Override
    public User getUserByLogin(String login) throws IOException
    {
        List<User> users = this.getAllUsers();

        for(User user: users)
        {
            if(user.getLogin().equals(login))
            {
                return user;
            }
        }

        return null;
    }
}
