package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("==== TEST 1: seller findById ====");
		Seller seller = sellerDao.findById(1);
		System.out.println(seller);

		System.out.println("\n==== TEST 2: seller findByDepartment ====");
		Department department = new Department(3, null);
		List<Seller> sellers = sellerDao.findByDepartment(department);
		for (Seller seller2 : sellers) {
			System.out.println(seller2);
		}

		System.out.println("\n==== TEST 3: seller findAll ====");
		sellers = sellerDao.findAll();
		for (Seller seller2 : sellers) {
			System.out.println(seller2);
		}

	}

}
