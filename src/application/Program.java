package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

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

//		System.out.println("\n==== TEST 4: seller insert ====");
//		Seller newSeller = new Seller("Greg", "greg@gmail.com", new Date(), 4000.00, department);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New Id = " + newSeller.getId());

		System.out.println("\n==== TEST 5: seller update ====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");

		System.out.println("\n==== TEST 6: seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();
	}

}
