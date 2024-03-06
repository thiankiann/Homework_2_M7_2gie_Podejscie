package com.example.homework_2_m7_2gie_podejscie.service;

import com.example.homework_2_m7_2gie_podejscie.proxy.GitHubServerProxy;
import com.example.homework_2_m7_2gie_podejscie.proxy.dto.GitHubResult;
import com.example.homework_2_m7_2gie_podejscie.validation.UserNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@Log4j2
@Service
public class GitHubService {

    GitHubServerProxy gitClient;

    GitHubMapper gitHubMapper;

    public GitHubService(GitHubServerProxy gitClient, GitHubMapper gitHubMapper) {
        this.gitClient = gitClient;
        this.gitHubMapper = gitHubMapper;
    }
    public List<GitHubResult> fetchAllRepos(String username) {
        try {
            String json = gitClient.makeGetRequest(username);
            return gitHubMapper.mapJsonToGitHubResultList(json)
                    .stream()
                    .filter(gitHubResult -> !gitHubResult.fork())
                    .toList();
        }catch (HttpClientErrorException ex){
            throw new UserNotFoundException("User: " + username + " not found" );
        }
    }
}
