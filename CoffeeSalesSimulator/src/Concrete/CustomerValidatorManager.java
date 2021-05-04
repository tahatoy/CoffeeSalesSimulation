package Concrete;

import Entities.Customer;

public class CustomerValidatorManager implements CustomerValidatorService {

	@Override
	public Boolean validate(Customer customer) {
			if(customer.getIdentityNumber().length()==11 && customer.getFirstName().length()>2 && customer.getLastName().length()>2) {
				return true;
			}
			else
				return false;
	
	}
	
	

}
