package web.springBootProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.springBootProject.model.User;
import web.springBootProject.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> getUsers() {

        return repository.findAll();
    }

    @Override
    public User showId(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(int id, User user) {
        user.setId(id);
        repository.save(user);
    }
}
