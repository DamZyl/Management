package Enity;

public class User
{
    public final static String USER_SEPARATOR = "|";

    private int id;
    private String login;
    private String password;

    public User(int id, String login, String password)
    {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId()
    {
        return id;
    }

    public String getLogin()
    {
        return login;
    }

    public String getPassword()
    {
        return password;
    }

    @Override
    public String toString()
    {
        return id + USER_SEPARATOR + login + USER_SEPARATOR + password;
    }
}
