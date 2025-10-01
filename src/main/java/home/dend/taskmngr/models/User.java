package home.dend.taskmngr.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users", schema = "public")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "password")
    private String password;

    @Column(name = "email", unique = true)
    @Email
    private String email;

    @Column(name = "isUser")
    private Boolean isRealUser;

    @Column(name = "isAdmin")
    private Boolean isAdmin;

    @Column(name = "registered")
    private LocalDateTime registeredDate;

    @Column(name = "modified")
    private LocalDateTime modifiedDate;

    @OneToMany
    private List<Task> tasks;

}
