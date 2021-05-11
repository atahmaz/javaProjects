package homework4;

import java.time.LocalDate;

import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrates.NeroCustomerManager;
import Concrates.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(new Customer(1,"Ayça","Tahmaz",LocalDate.of(1994,5,7),11111111111L));
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(new Customer(1,"Ayça","Tahmaz",LocalDate.of(1994,5,7),111111111L));
		

	}

}
