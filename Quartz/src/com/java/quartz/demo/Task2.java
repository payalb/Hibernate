package com.java.quartz.demo;

import java.time.LocalDateTime;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Task2 implements Job{


	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Task2 "+LocalDateTime.now());
		
	}
}
