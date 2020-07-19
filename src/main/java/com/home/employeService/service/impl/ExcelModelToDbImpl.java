package com.home.employeService.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.employeService.dao.EmployeeEntity;
import com.home.employeService.dto.ExcelToDbDTO;
import com.home.employeService.model.EmployeXLS;
import com.home.employeService.repository.EmployeRepository;
import com.home.employeService.service.ExcelModelToDBService;

@Service
public class ExcelModelToDbImpl implements ExcelModelToDBService
{
	@Autowired
	EmployeRepository employeRepository;
	@Override
	public String excelToDb(List<EmployeXLS> empList)
	{
		List<EmployeeEntity> list = new ArrayList();
		
		for(EmployeXLS e:empList)
		{
			EmployeeEntity et = new EmployeeEntity();
			BeanUtils.copyProperties(e, et);
			list.add(et);
		}
		
		System.err.println(list);
		System.err.println("\n\n\n"+employeRepository);
		
		employeRepository.saveAll(list);
		
		Long l = employeRepository.count();
		
		System.out.println(l);
		
		
		return "Inserted to Db";
	}

}
