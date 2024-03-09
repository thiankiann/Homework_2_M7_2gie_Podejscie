package com.example.homework_2_m7_2gie_podejscie.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Entity
@Getter
@Setter
@Table(name = "repo")
public class GitHubResultDatabaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;
    String owner;
    public GitHubResultDatabaseObject() {
    }

    public GitHubResultDatabaseObject(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    public GitHubResultDatabaseObject(Long id, String name, String owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }
}
