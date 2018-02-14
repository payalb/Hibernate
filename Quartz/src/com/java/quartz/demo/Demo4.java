package com.java.quartz.demo;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Demo4 {

	public static void main(String[] args) throws SchedulerException {
		SchedulerFactory factory= new StdSchedulerFactory();
		Scheduler scheduler= factory.getScheduler();
		scheduler.start();
		
		Trigger trigger1= TriggerBuilder.newTrigger().withIdentity("trigger1","group1").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
				.build();
		
		Trigger trigger2= TriggerBuilder.newTrigger().withIdentity("trigger2","group1").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
				.build();
		JobDetail job1= JobBuilder.newJob(Task1.class).withIdentity("task1", "group1").build();
		JobDetail job2= JobBuilder.newJob(Task2.class).withIdentity("task2", "group1").build();
		scheduler.scheduleJob(job1,trigger1);
		scheduler.scheduleJob(job2,trigger2);
	}

}
