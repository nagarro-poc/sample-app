package com.test.logee;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Scheduler {
	
	@Scheduled(fixedRate = 3000)
	public void cronInfoLog() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.info("App 2 - infoLog: Created info log at :" + localDateTime);
	}
	
	@Scheduled(fixedRate = 3000)
	public void cronErrorLog() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.error("App 2 - errorLog: Created error log at :" + localDateTime);
	}
	
	@Scheduled(fixedRate = 3000)
	public void cronTraceLog() {
		LocalDateTime localDateTime = LocalDateTime.now();
		log.trace("App 2 - traceLog: Created trace log at :" + localDateTime);
	}
}
