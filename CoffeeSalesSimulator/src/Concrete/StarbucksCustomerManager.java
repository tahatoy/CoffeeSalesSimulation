package Concrete;

import Entities.Customer;

public class StarbucksCustomerManager implements CustomerService {

	CustomerValidatorService customerValidatorService;
	
	public StarbucksCustomerManager(CustomerValidatorService customerValidatorService) {
		this.customerValidatorService=customerValidatorService;
	}

	@Override
	public void add(Customer customer) {
		if(customerValidatorService.validate(customer)==true) {
			System.out.println("Kullan�c� sisteme eklendi: "+customer.getFirstName()+" "+customer.getLastName());
		}
		else
			System.out.println("Do�rulama hatas� olu�tu!!");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� g�ncellendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}
	public void addCoffee(int starPoint) {
	     System.out.println("Hesab�n�za "+starPoint+" y�ld�z eklenmi�tir.");
	
	}
}
