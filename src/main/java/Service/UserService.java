package Service;

public class UserService
{
    private String[] users;

    public UserService(String[] users)
    {
        this.users = users;
    }

    public boolean isUserExist(String login)
    {
        for(String user: users)
        {
            if(user.equals(login))
            {
                return true;
            }
        }

        return false;
    }

    public int getUsersCount()
    {
        return users.length;
    }

    public int getCountRepeatsByLogin(String login)
    {
        int repeatsCounter = 0;

        for(String user: users)
        {
            if(user.equals(login))
            {
                repeatsCounter++;
            }
        }

        return repeatsCounter;
    }
}
