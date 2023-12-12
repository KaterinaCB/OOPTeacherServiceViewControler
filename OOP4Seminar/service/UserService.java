package service;

import model.User;

public interface UserService<T extends User> {
    void create(String firstName, String secondName, String lastName);
}
