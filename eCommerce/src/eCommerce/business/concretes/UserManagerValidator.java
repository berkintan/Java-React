package eCommerce.business.concretes;

import eCommerce.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManagerValidator {

    private static List<String> userList = new ArrayList<>();

    public static boolean passwordValidation(String password) {
        if(password.length() <= 6) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean nameValidation(String firstName, String lastName) {
        if(firstName.length() < 2 || lastName.length() < 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean emailValidation(String email) {
        return validate(email);
    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    private static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    public static boolean validateSameEmail(User user,String email) {
        if(userList.contains(user.getEmail())) {
            return false;
        } else {
            return true;
        }
    }

    public static void addToList(User user, String email) {
        userList.add(user.getEmail());
    }
}

