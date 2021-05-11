package inheritence;  //2 tane sınıf var ve bu sınıflardaki bazı operasyonlar otak yapıya sahipse inheritance kullanılır

public class main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12345";
		


        CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		CustomerManager customermanager = new CustomerManager();
		//customermanager.add(hepsiBurada);
		//customermanager.add(engin);
		//customermanager.add(abc);
		
		Customer[] customers = {engin, hepsiBurada, abc};
		customermanager.addMultiple(customers);
	}

}
