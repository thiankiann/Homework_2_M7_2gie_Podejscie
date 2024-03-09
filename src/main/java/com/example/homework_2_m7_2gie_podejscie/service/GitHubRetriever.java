package com.example.homework_2_m7_2gie_podejscie.service;

import com.example.homework_2_m7_2gie_podejscie.repository.GitRepository;
import com.example.homework_2_m7_2gie_podejscie.model.GitHubResultDatabaseObject;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class GitHubRetriever {

    private final GitRepository gitRepository;

    public GitHubRetriever(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
    }

    public List<GitHubResultDatabaseObject> findAll(){
        log.info("retrieving all repos:");
        return gitRepository.findAll();
    }

}
