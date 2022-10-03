package ca.sait.services;

import ca.sait.models.User;

/**
 * Service provider for account
 * @author alexa
 */
public class AccountService {
    public User login(String username, String password) {
        if ("abe".equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        } else if ("barb".equals(username) && "password".equals(password)) {
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }
    }
}
