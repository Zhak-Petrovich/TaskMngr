package home.dend.taskmngr.repository;

import home.dend.taskmngr.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
