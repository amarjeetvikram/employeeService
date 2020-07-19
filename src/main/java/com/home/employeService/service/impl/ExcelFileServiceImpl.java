package com.home.employeService.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.employeService.model.EmployeXLS;
import com.home.employeService.service.ExcelFileService;
@Service
public class ExcelFileServiceImpl implements ExcelFileService {
	@Autowired
	private EmployeXLS employeXLS;

	int count;

	private List<EmployeXLS> empList = new ArrayList<>();

	public List<EmployeXLS> readExcel(String path) throws IOException 
	{

		if(count > 0)
		{
			return null;
		}
		else
		{
			count++;
		}
		FileInputStream file = new FileInputStream(new File(path));

		Workbook workbook = new HSSFWorkbook(file);
		workbook.getNumberOfSheets();

		Sheet sheet = workbook.getSheetAt(0);

		for (Row row : sheet) 
		{
			if (row.getRowNum() == 0)
				continue;
			try
			{
				for (Cell cell : row) 
				{
					int j = cell.getColumnIndex();
					if (j == 1) {
						char value[] = cell.getStringCellValue().toCharArray();
						employeXLS.setGender(value[0]);
					}
					if (j == 2) {
						Date bdate = cell.getDateCellValue();
						employeXLS.setBdate(bdate);
					}
					if (j == 5) {
						int salary = (int) cell.getNumericCellValue();
						employeXLS.setSalary(salary);
					}
					if (j == 6) {
						int salbegin = (int) cell.getNumericCellValue();
						employeXLS.setSalbegin(salbegin);
					}

				}
			}
			catch(Exception e)
			{
				continue;
			}

			empList.add(employeXLS);


		}

		return empList;
	}
}



