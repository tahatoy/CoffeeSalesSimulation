package Concrete;

import Entities.Customer;

public class NeroCustomerManager implements CustomerService{
	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Kullanici sisteme eklendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanici guncellendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanici silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
