package com.home.employeService.service;

import java.io.IOException;
import java.util.List;

import com.home.employeService.model.EmployeXLS;

public interface ExcelFileService 
{
	
	 List<EmployeXLS> readExcel(String path) throws IOException;

}
