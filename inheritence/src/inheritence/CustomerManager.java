package inheritence;

public class CustomerManager {
	
	//public void add(IndividualCustomer customer) {
	//	System.out.println(customer.customerNumber + " kaydedildi.");
		
	//  }
	//public void add(CorporateCustomer customer) {
	//	System.out.println(customer.customerNumber + " kaydedildi.");
		
	//  }
	
	//yukardakiler yerine sadece aşağıdakini de yazabiliriz.Buna polimorfizm denir.
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}
	
	//bulk insert
	public void addMultiple (Customer [] customers) {
		for (Customer customer : customers) {
			add(customer);
			
		}
		
		
	}
}

