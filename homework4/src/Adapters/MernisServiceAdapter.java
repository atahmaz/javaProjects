package Adapters;

import java.rmi.RemoteException;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {
	
	private boolean result = false;
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		try {
			     result = proxy.TCKimlikNoDogrula(
				 	customer.getNationatilyId().longValue(), 
					customer.getFirstName().toUpperCase(),
		            customer.getLastName().toUpperCase(), 
		            customer.getDateOfBirth().getYear()); 
		}  catch (RemoteException e) {
			System.out.println("Not a valid person");
	}
		return result;
	}
}
