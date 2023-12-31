package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("==== TEST 1: department findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("\n==== TEST 2: department findAll ====");
		List<Department> departmentList = new ArrayList<>();
		departmentList = departmentDao.findAll();
		for (Department department2 : departmentList) {
			System.out.println(department2);
		}

//		System.out.println("\n==== TEST 3: department insert ====");
//		department = new Department(7, "ME APAGUE");
//		departmentDao.insert(department);
//		System.out.println("Inserted! New Id = " + department.getId());

//		System.out.println("\n==== TEST 4: department update ====");
//		department = departmentDao.findById(6);
//		department.setName("Toys");
//		departmentDao.update(department);
//		System.out.println("Update completed");
		
		System.out.println("\n==== TEST 5: department delete ====");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");

	}

}
