package com.java.quartz.demo;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Demo2 {

	public static void main(String[] args) throws SchedulerException {
		SchedulerFactory factory= new StdSchedulerFactory();
		Scheduler scheduler= factory.getScheduler();
		scheduler.start();
		
		Trigger trigger= TriggerBuilder.newTrigger().withIdentity("trigger1","group1")
				.withSchedule(CronScheduleBuilder.cronSchedule("1 * * * * ?"))
				.build();
		//minute(0-59) hour(0-23) day(1-31) month(1-12) dayOfWeek(0-6)
		JobDetail job= JobBuilder.newJob(Task1.class).withIdentity("task1", "group1").build();
		scheduler.scheduleJob(job,trigger);
	}

}
