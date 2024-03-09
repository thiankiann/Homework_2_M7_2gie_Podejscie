package com.example.homework_2_m7_2gie_podejscie.service;

import com.example.homework_2_m7_2gie_podejscie.controller.GitHubServerProxy;
import com.example.homework_2_m7_2gie_podejscie.dto.GitHubResult;
import com.example.homework_2_m7_2gie_podejscie.model.GitHubResultDatabaseObject;
import com.example.homework_2_m7_2gie_podejscie.validation.UserNotFoundException;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service
public class GitHubService {

    GitHubServerProxy gitClient;

    GitHubMapper gitHubMapper;
    GitHubAdder gitHubAdder;

    public GitHubService(GitHubServerProxy gitClient, GitHubMapper gitHubMapper) {
        this.gitClient = gitClient;
        this.gitHubMapper = gitHubMapper;
    }
    public List<GitHubResult> fetchAllRepos(String username) {
        try {
            String json = gitClient.makeGetRequest(username);
            List<GitHubResult> result = gitHubMapper.mapJsonToGitHubResultList(json);
            List<GitHubResult> mapResultToResultWithoutFork =gitHubMapper.mapResultToResultWithoutFork(result);
            List<GitHubResult> mapResultWithoutForkToModel =gitHubMapper.mapResultWithoutForkToModel(result);
//            databaseAdder(mapResultWithoutForkToModel);
            return mapResultWithoutForkToModel;
        }catch (HttpClientErrorException ex){
            throw new UserNotFoundException("User: " + username + " not found" );
        }
    }
//    public void databaseAdder(List<GitHubResult> allInfoList){
//        for (GitHubResult info:
//                allInfoList) {
//            gitHubAdder.addInfoToDb(new GitHubResultDatabaseObject(info.name(),info.owner().login()));
//        }
//
//    }
}
