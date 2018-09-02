package Api;

import Enity.User;
import Exception.UserShortLengthPasswordException;
import Exception.UserShortLengthLoginException;
import Exception.UserLoginAlredyExistException;
import java.io.IOException;
import java.util.List;

public interface UserService
{
    List<User> getAllUsers() throws IOException;
    void addUser(User user) throws IOException, UserShortLengthPasswordException, UserShortLengthLoginException, UserLoginAlredyExistException;
    void removeUserById(int userId) throws IOException;
}
