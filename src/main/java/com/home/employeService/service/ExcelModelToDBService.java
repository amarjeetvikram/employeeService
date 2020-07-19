package com.home.employeService.service;

import java.util.List;

import com.home.employeService.model.EmployeXLS;

public interface ExcelModelToDBService 
{
	String excelToDb(List<EmployeXLS> empList);
}
