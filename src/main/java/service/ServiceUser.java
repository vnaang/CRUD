package service;

import model.User;

import java.util.List;

public interface ServiceUser {

    void addUser(User user);

    User getUserById(long id);

    void deleteUserById(User user);

    List<User> getAllUsers();

    void updateUser(User userChanges);
}
