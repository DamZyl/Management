package Service;

import Api.UserService;
import Enity.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService
{
    private List<User> users;

    public UserServiceImpl()
    {
        this.users = new ArrayList<User>();
    }

    public UserServiceImpl(List<User> users)
    {
        this.users = users;
    }

    @Override
    public List<User> getAllUsers()
    {
        return users;
    }

    @Override
    public void addUser(User user)
    {
        users.add(user);
    }

    @Override
    public void removeUserById(int userId)
    {
        for(User user: users)
        {
            if(user.getId() == userId)
            {
                users.remove(user);
                break;
            }
        }
    }
}
