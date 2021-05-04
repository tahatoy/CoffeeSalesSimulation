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
			System.out.println("Kullanýcý sisteme eklendi: "+customer.getFirstName()+" "+customer.getLastName());
		}
		else
			System.out.println("Doðrulama hatasý oluþtu!!");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanýcý güncellendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}
	public void addCoffee(int starPoint) {
	     System.out.println("Hesabýnýza "+starPoint+" yýldýz eklenmiþtir.");
	
	}
}
