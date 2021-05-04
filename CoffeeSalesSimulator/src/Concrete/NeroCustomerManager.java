package Concrete;

import Entities.Customer;

public class NeroCustomerManager implements CustomerService{
	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Kullanıcı sisteme eklendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullanıcı güncellendi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullanıcı silindi: "+customer.getFirstName()+" "+customer.getLastName());
		
	}

}
