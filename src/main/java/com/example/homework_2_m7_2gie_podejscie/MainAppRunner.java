package com.example.homework_2_m7_2gie_podejscie;

import com.example.homework_2_m7_2gie_podejscie.service.GitHubService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class MainAppRunner {

    GitHubService gitHubService;
    GitHubService gitHubRetriever;

    public MainAppRunner(GitHubService gitHubService, GitHubService gitHubRetriever) {
        this.gitHubService = gitHubService;
        this.gitHubRetriever = gitHubRetriever;
    }

    public void start() {
       // log.info(gitHubService.fetchAllRepos("kalqa"));
        log.info(gitHubRetriever.fetchAllRepos("kalqa"));
    }
}