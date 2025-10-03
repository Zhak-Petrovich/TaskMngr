package home.dend.taskmngr.services;

import home.dend.taskmngr.models.Task;
import home.dend.taskmngr.models.User;
import home.dend.taskmngr.repository.TaskRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks(User user) {
        return taskRepository.getAllByUserId(user.getId());
    }

    public Task getTaskById(Long id) {
        return taskRepository.getReferenceById(id);
    }
    //TODO think about it
    public void saveTask(User user, Task task) {

    }
}
