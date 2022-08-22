package eCommerce.dataAccess.concretes;

import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

import java.util.List;

public class HibarnateProductDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println("Added with Hibarnate " + user.getFirstName() + " " + user.getLastName());
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
