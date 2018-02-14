package com.java.business;


import com.java.dto.Report;

import org.springframework.batch.item.ItemProcessor;
public class CustomItemProcessor implements ItemProcessor<Report, Report>{

	public Report process(Report report) throws Exception {
		System.out.println("Processing report: "+ report);
		return report;
	}



}
