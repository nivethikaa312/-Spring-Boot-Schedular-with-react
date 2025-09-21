 package com.example.sheduler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

     @Scheduled(cron = "0 * 19 * * ?")
    public void scheduleTask() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss.SSS");
        String now = LocalDateTime.now().format(formatter);

        System.out.println(" Scheduler triggered at: " + now);
    }
}
