package home.dend.taskmngr;

import home.dend.taskmngr.services.MailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskMngrApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskMngrApplication.class, args);
    }

}
