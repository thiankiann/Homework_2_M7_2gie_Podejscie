package com.example.homework_2_m7_2gie_podejscie.service;

import com.example.homework_2_m7_2gie_podejscie.model.GitHubResultDatabaseObject;
import com.example.homework_2_m7_2gie_podejscie.repository.GitRepository;
import jakarta.transaction.Transactional;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@Transactional
public class GitHubAdder {

    private final GitRepository gitRepository;


    public GitHubAdder(GitRepository gitRepository) {
        this.gitRepository = gitRepository;
    }

    public GitHubResultDatabaseObject addInfoToDb(GitHubResultDatabaseObject result){
        log.info("adding info to db");
        gitRepository.save(result);
        return result;
    }
}
