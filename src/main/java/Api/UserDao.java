package Api;

import Enity.User;
import java.util.List;

public interface UserDao
{
    void saveUser(User user);
    void saveUsers(List<User> users);
    void removeUserById(int id);
    void removeUserByLogin(String login);
    List<User> getAllUsers();
    User getUserById(int id);
    User getUserByLogin(String login);
}
