package Enity;

public class User
{
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
        return "User{" +
                "id = " + this.getId() +
                ", login = '" + this.getLogin() + '\'' +
                ", password = '" + this.getPassword() + '\'' +
                '}';
    }
}
