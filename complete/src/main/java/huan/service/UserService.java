package huan.service;


import huan.model.User;

public interface UserService {
    User getUser(String name);
    User save(User user);
}