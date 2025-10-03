package home.dend.taskmngr.repository;

import home.dend.taskmngr.models.Task;
import home.dend.taskmngr.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> getAllByUserId(Long id);
}
