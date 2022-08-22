package eCommerce.business;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.JGoogleManagerAdapter;
import eCommerce.dataAccess.concretes.HibarnateProductDao;
import eCommerce.entities.concretes.User;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserManager(new HibarnateProductDao(),new JGoogleManagerAdapter());
        userService.addUser(new User("Berkin","Tan","berkin.tan@ozu.edu.tr","1234567")); // first user
        userService.addUser(new User("BBB", "TTT","berkin.tan@ozu.edu.tr","12345678")); // second user with the same e-mail
        User user = new User("bbt","ttt","berkintan2000@gmail.com","abcacb123");
        userService.addUser(user);

    }
}
