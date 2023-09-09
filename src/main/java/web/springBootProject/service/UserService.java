package web.springBootProject.service;


import web.springBootProject.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User showId(int id);
    void save(User user);
    void update(int id, User user);
    void delete(int id);

}
