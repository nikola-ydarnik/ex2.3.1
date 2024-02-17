package app.dao;

import app.model.User;

import java.util.List;

public interface UserDAO {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    void updateUser(int id, User user);

    void deleteUser(int id);

}
