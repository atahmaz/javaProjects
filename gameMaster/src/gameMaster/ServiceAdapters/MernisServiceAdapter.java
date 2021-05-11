package gameMaster.ServiceAdapters;

import java.rmi.RemoteException;

import gameMaster.Abstract.UserCheckService;
import gameMaster.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean IfUserRealPerson(User user) {
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		boolean result=false;
		
		try {
			result=proxy.TCKimlikNoDogrula(user.getIdentityNumber(), 
					user.getFirstName().toUpperCase(), 
					user.getLastName().toUpperCase(), 
					user.getDateOfBirth().getYear());
			
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} return result;
	}

}