package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();		
		System.out.println("=== Test 1 : department findById =====");	
		
		
		Department department =  departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== Test 2: seller findByDepartment=====");
		List<Department> list = departmentDao.findAll();		
		for (Department d : list) {
			System.out.println(d);
		}

	}

}
