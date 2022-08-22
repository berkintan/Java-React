package eCommerce.business.concretes;

import eCommerce.JGoogle.JGoogleManager;
import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.core.concretes.JGoogleManagerAdapter;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {

    private UserDao userDao;
    private LoggerService loggerService;

    public UserManager() {

    }

    public UserManager(UserDao userDao, LoggerService loggerService) {
        this.userDao = userDao;
        this.loggerService = loggerService;
    }

    public void login(User user) {
        System.out.println("done");
    }
    @Override
    public void addUser(User user) {
        if(UserManagerValidator.emailValidation(user.getEmail()) && UserManagerValidator.nameValidation(user.getFirstName(),
                user.getLastName()) && UserManagerValidator.passwordValidation(user.getPassword()) && UserManagerValidator.validateSameEmail(user,user.getEmail())) {
            System.out.println("Registration successful!");
            userDao.add(user);
            UserManagerValidator.addToList(user,user.getEmail());
        } else {
            System.out.println("Please meet the min. criteria for creating an account!");
        }
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
