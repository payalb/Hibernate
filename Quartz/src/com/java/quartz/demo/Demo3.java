package com.java.quartz.demo;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.matchers.KeyMatcher;

public class Demo3 {

	public static void main(String[] args) throws SchedulerException {
		SchedulerFactory factory= new StdSchedulerFactory();
		Scheduler scheduler= factory.getScheduler();
		JobKey jk= new JobKey("task1","group1");
		scheduler.getListenerManager().addJobListener(new  MyJobListener(),KeyMatcher.keyEquals(jk));
		scheduler.start();
		
		Trigger trigger= TriggerBuilder.newTrigger().withIdentity("trigger1","group1").startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever())
				.build();
		
		JobDetail job= JobBuilder.newJob(Task1.class).withIdentity(jk).build();
		scheduler.scheduleJob(job,trigger);
	}

}
