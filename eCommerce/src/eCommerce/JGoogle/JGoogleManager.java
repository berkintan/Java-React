package eCommerce.JGoogle;

import eCommerce.entities.concretes.User;

public class JGoogleManager {
    public void login(User user) {
        System.out.println("Login successful with Google for: " + user.getFirstName() + " " + user.getLastName());
    }
}
