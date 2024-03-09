package com.example.homework_2_m7_2gie_podejscie.controller;

import com.example.homework_2_m7_2gie_podejscie.service.GitHubMapper;
import com.example.homework_2_m7_2gie_podejscie.service.GitHubRetriever;
import com.example.homework_2_m7_2gie_podejscie.service.GitHubService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@AllArgsConstructor
@RestController
@RequestMapping("/repos")
public class GitHubRestController {

//    GitHubMapper gitHubMapper;
//    GitHubService gitHubService;
////    GitHubAdder gitHubAdder;
////    GitHubDeleter gitHubDeleter;
//    GitHubRetriever gitHubRetriever;
////    GitHubUpdater gitHubUpdater;
//
//
//    @GetMapping("/{user}")
//    public ResponseEntity<GitHubListAllResult> getAllInfo(@PathVariable String user) {
//        List<AllInfo> allInfoList = gitHubService.fetchAllInformation(user).allInfoList();
//        gitHubService.databaseAdder(allInfoList);
//        GitHubListAllResult response = new GitHubListAllResult(allInfoList);
//        return ResponseEntity.ok(response);
//    }
}
