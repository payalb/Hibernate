package com.java.business;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.java.dto.Report;

public class ReportFieldSetMapper implements FieldSetMapper<Report>{
	private SimpleDateFormat dateFormatObj = new SimpleDateFormat("dd/MM/yyyy");
	static Report reportObj;
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		reportObj= new Report();
		reportObj.setId(fieldSet.readInt(0));
		reportObj.setSales(fieldSet.readBigDecimal(1));
		reportObj.setQty(fieldSet.readInt(2));
		reportObj.setStaffName(fieldSet.readString(3));
		 String csvDate = fieldSet.readString(4);
		 try {
			reportObj.setDate(dateFormatObj.parse(csvDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reportObj;
	}

}
