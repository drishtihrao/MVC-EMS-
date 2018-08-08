package com.cg.ems.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.ems.pojo.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private Map<Integer, Employee> employeeDB = new HashMap<>();
	
	@Override
	public void addNewEmployee(Employee employee) {
		employeeDB.put(employee.getEmpId(), employee);
	}
	

	@Override
	public Collection<Employee> viewAllEmployees(){
		return employeeDB.values();
	}

	@Override
	public Employee getemployeeById(int empId) {
		return employeeDB.get(empId);
	}

	@Override
	public void deleteEmployee(int empId) {
		employeeDB.remove(empId);
	}
}
