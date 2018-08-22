package Enity.Parser;

import Enity.User;

public class UserParser
{
    public static User stringToUser(String userStr)
    {
        String[] userInfo = userStr.split(User.USER_SEPARATOR);

        int id = Integer.parseInt(userInfo[0]);
        String login = userInfo[1];
        String password = userInfo[2];

        return new User(id, login, password);
    }
}
