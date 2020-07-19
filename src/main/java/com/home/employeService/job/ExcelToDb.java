package com.home.employeService.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import com.home.employeService.model.EmployeXLS;
import com.home.employeService.service.ExcelFileService;
import com.home.employeService.service.ExcelModelToDBService;

@Configuration
public class ExcelToDb 
{

	@Autowired
	private ExcelFileService excelFileService;
	
	@Autowired
	ExcelModelToDBService excelModelToDBService;

	@Value("${excel.location.path}")
	private String path;

	

	@Scheduled(cron="0 * * ? * *")
	public void runJob() 
	{
		List<EmployeXLS> empList = null;
		
		try
		{
			empList = excelFileService.readExcel(path);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		excelModelToDBService.excelToDb(empList);
		
		
	}



}

