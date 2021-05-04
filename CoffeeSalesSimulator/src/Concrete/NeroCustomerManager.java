package Concrete;

import Entities.Customer;

public class NeroCustomerManager implements CustomerService{
	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Kullan�c� sisteme eklendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� g�ncellendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
