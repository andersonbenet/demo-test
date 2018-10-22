package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.github.javafaker.Faker;

import page.CustomerPage;

/*
 * Author: andersondacruzbenet@gmail.com
 */
public class CustomerTest {
	Faker faker = new Faker();
	CustomerPage customerPage = new CustomerPage();

	@Before
	public void openApplication() {		
		customerPage.setup();

	}
	
	@Category(CustomerTest.class)
	@Test
	public void desafio1() throws InterruptedException {
		int opcao = 2; // [1]Bootstrap V3 Theme [2]"Bootstrap V4 Theme"
		String msg_expected = "Your data has been successfully stored into the database.";
		String url = "https://www.grocerycrud.com/demo/bootstrap_theme";

		String name = faker.name().firstName(); 
		String lastName = "Teste";
		String contactFirstName = "seu nome";
		String phone = "51 9999-9999";
		String addressLine1 = "Av Assis Brasil, 3970";
		String addressLine2 = "Torre D";
		String city = "Porto Alegre";
		String state = "RS";
		String postalCode = "91000-000";
		String country = "Brasil";
		int employeer = 8;
		String creditLimit = "200";
		
		customerPage.openPage(url);
		
		customerPage.updateVersion(opcao);
		
		customerPage.addCustomer(name, lastName, contactFirstName, phone,
				addressLine1, addressLine2, city, state, postalCode, country,
				employeer, creditLimit);
		customerPage.saveCustomer();
		
		assertEquals(customerPage.getMenssageSaveCustomerSuccess().substring(0, 57), msg_expected);


	}
	
	
	@Category(CustomerTest.class)
	@Test
	public void desafio2() throws InterruptedException {
		int opcao = 2; // [1]Bootstrap V3 Theme [2]"Bootstrap V4 Theme"
		String msg_DeleteItens = "Are you sure that you want to delete this 1 item?";
		String msg_ConfirmDelete = "Your data has been successfully deleted from the database.";
		
		String url = "https://www.grocerycrud.com/demo/bootstrap_theme";

		String name = faker.name().firstName();
		String lastName = "Teste";
		String contactFirstName = "seu nome";
		String phone = "51 9999-9999";
		String addressLine1 = "Av Assis Brasil, 3970";
		String addressLine2 = "Torre D";
		String city = "Porto Alegre";
		String state = "RS";
		String postalCode = "91000-000";
		String country = "Brasil";
		int employeer = 8;
		String creditLimit = "200";
		
		customerPage.openPage(url);
		customerPage.updateVersion(opcao);
		customerPage.addCustomer(name, lastName, contactFirstName, phone,
				addressLine1, addressLine2, city, state, postalCode, country,
				employeer, creditLimit);
		
		customerPage.saveAndGoBackList();
		customerPage.searchCustomer(name);
		customerPage.deleteCustomer();
		assertEquals(msg_DeleteItens,customerPage.msgDeleteCustomer());
		customerPage.confirmButtonDeleteCustomer();
		assertEquals(msg_ConfirmDelete,customerPage.getMenssageDeleteCustomerSuccess());
		
	}
	
	
	@After
	public void closeApplication(){
		customerPage.close();
	}

}
