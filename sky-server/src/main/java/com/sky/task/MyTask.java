package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Description TODO
 * @Version 1.0.0
 * @Date 2024/7/11 14:05
 * @Github https://github.com/Programmer-Kenton
 * @Author Kenton
 */

@Component
@Slf4j
public class MyTask {

    /**
     * 定时任务 每隔五秒触发一次
     */
    // @Scheduled(cron = "0/5 * * * * ?")
    public void executeTask(){
        log.info("定时任务开始执行:{}",new Date());
    }
}
