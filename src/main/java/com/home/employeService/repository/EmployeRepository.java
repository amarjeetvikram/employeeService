package com.home.employeService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.home.employeService.dao.EmployeeEntity;

@Repository
public interface EmployeRepository extends CrudRepository<EmployeeEntity, Long>
{

}
