package Concrete;

import Entities.Customer;

public class NeroCustomerManager implements CustomerService{
	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Kullanýcý sisteme eklendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanýcý güncellendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanýcý silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
