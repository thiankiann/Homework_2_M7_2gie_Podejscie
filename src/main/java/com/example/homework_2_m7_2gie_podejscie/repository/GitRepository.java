package com.example.homework_2_m7_2gie_podejscie.repository;

import com.example.homework_2_m7_2gie_podejscie.model.GitHubResultDatabaseObject;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional

public interface GitRepository extends Repository<GitHubResultDatabaseObject,Long> {

    List<GitHubResultDatabaseObject> findAll();
}
