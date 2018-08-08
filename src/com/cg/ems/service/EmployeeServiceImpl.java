package com.cg.ems.service;

import java.util.Collection;

import com.cg.ems.dao.EmployeeDAO;
import com.cg.ems.dao.EmployeeDAOImpl;
import com.cg.ems.pojo.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	public void addNewEmployee(Employee employee) {
		dao.addNewEmployee(employee);

	@Override
	public Collection<Employee> viewAllEmployees(){
		return dao.viewAllEmployees();

	@Override
	public Employee getemployeeById(int empId) {
		return dao.getemployeeById(empId);

	@Override
	public void deleteEmployee(int empId) {
		dao.deleteEmployee(empId);
	}
}
