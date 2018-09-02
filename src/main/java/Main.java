import Api.ProductDao;
import Api.UserDao;
import Dao.ProductDaoImpl;
import Dao.UserDaoImpl;
import Enity.Boots;
import Enity.Cloth;
import Enity.User;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        User user = new User(1, "admin", "admin");
        User user1 = new User(2, "user1", "user1");
        Cloth cloth = new Cloth(1, "T-shirt", 35.9, 0.3, "Black", 10,"XL", "Cotton");
        Cloth cloth1 = new Cloth(2, "T-shirt", 53.9, 0.3, "White", 50,"L", "Cotton");
        Boots boots = new Boots(1, "High heels", 99.9, 0.5, "Red", 12, 35, false);
        Boots boots1 = new Boots(2, "High heels", 199.9, 0.5, "Grey", 35, 42, true);

        ProductDao productClothDao = new ProductDaoImpl("clothes.txt", "Cloth");
        productClothDao.saveProduct(cloth);
        productClothDao.saveProduct(cloth1);

        ProductDao productBootsDao = new ProductDaoImpl("boots.txt", "Boots");
        productBootsDao.saveProduct(boots);
        productBootsDao.saveProduct(boots1);

        UserDao userDao = UserDaoImpl.getInstance();
        userDao.saveUser(user);
        userDao.saveUser(user1);
    }
}
