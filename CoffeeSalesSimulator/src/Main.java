import Concrete.CustomerValidatorManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		StarbucksCustomerManager stcustomer1=new StarbucksCustomerManager(new CustomerValidatorManager());
		stcustomer1.add(new Customer(1,"Taha","Toy",0,"12346578912"));
		System.out.println("--------------------");
		stcustomer1.addCoffee(3);
		System.out.println("--------------------");
	     stcustomer1.update(new Customer(
	             1,
	             "Mehmet",
	             "Toy",
	             5,
	             "123456478912"
	     ));
	 	System.out.println("--------------------");
	 	
		NeroCustomerManager nrcustomer1=new NeroCustomerManager();
		nrcustomer1.add(new Customer(1,"Oðuzhan","Öztürk","12345678945"));
		
	}

}
