package com.java.quartz.demo;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class MyJobListener implements JobListener{

	@Override
	public String getName() {
		return "MyJobListener";
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		System.out.println(context.getJobDetail().getKey() +" vetoed called");
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		System.out.println(context.getJobDetail().getKey().toString()+" job called");
		
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context,
			JobExecutionException arg1) {
		System.out.println(context.getJobDetail().getKey().toString()+" job finished");
	}

}
