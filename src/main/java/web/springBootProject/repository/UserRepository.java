package web.springBootProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web.springBootProject.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
