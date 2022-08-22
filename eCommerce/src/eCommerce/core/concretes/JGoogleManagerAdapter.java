package eCommerce.core.concretes;

import eCommerce.JGoogle.JGoogleManager;
import eCommerce.core.abstracts.LoggerService;
import eCommerce.entities.concretes.User;

public class JGoogleManagerAdapter implements LoggerService {
    @Override
    public void logtoSystem(User user) {
        JGoogleManager manager = new JGoogleManager();
        manager.login(user);
    }
}
