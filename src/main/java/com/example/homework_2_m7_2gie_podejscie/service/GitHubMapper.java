package com.example.homework_2_m7_2gie_podejscie.service;

import com.example.homework_2_m7_2gie_podejscie.dto.GitHubResult;
import com.example.homework_2_m7_2gie_podejscie.dto.GitHubResultView;
import com.example.homework_2_m7_2gie_podejscie.model.GitHubResultDatabaseObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Log4j2
@Component
public class GitHubMapper {

    private final ObjectMapper objectMapper;

    public GitHubMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    List<GitHubResult> mapJsonToGitHubResultList(String json) {
        try {
            return objectMapper.readValue(json, new TypeReference<>() {
            });
        } catch (JsonProcessingException e) {
            log.error(e.getMessage());
            return Collections.emptyList();
        }
    }

    public List<GitHubResult> mapResultToResultWithoutFork(List<GitHubResult> result) {
        return result.stream()
                .filter(gitHubResult -> !gitHubResult.fork())
                .toList();
    }
//    public List<GitHubResultView> mapResultWithoutForkToModel(List<GitHubResult> result) {
//        List<GitHubResultView> list = result.stream()
//                .filter(gitHubResult -> gitHubResultView)
//                .toList();
//        return list;
//    }


}
