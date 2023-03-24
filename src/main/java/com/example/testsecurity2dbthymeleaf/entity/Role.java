package com.example.testsecurity2dbthymeleaf.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false,unique = true)
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<User> users = new ArrayList<>();
}
