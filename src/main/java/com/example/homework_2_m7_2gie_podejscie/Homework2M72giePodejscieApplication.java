package com.example.homework_2_m7_2gie_podejscie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class Homework2M72giePodejscieApplication {

//    private final MainAppRunner mainAppRunner;
//
//    public Homework2M72giePodejscieApplication(MainAppRunner mainAppRunner) {
//        this.mainAppRunner = mainAppRunner;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Homework2M72giePodejscieApplication.class, args);
    }

//    @EventListener(ApplicationStartedEvent.class)
//    public void run() {
//        mainAppRunner.start();
//    }

}
