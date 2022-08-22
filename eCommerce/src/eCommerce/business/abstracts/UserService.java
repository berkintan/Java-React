package eCommerce.business.abstracts;

import eCommerce.entities.concretes.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getAll();
    }

