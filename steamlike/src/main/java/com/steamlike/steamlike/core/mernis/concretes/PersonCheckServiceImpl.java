package com.steamlike.steamlike.core.mernis.concretes;

import com.steamlike.steamlike.core.mernis.abstracts.PersonCheckService;
import com.steamlike.steamlike.entity.concretes.Gamer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class PersonCheckServiceImpl implements PersonCheckService {

	
	
	@Override
	public boolean isPersonExist(Gamer gamer) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try {
			
			return kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(gamer.getSsn()), 
					gamer.getFirstName(), 
					gamer.getLastName(), 
					gamer.getDateOfBirth());
		} catch (Exception exc) {
			
			exc.printStackTrace();
		}
		
		return true;
	}

	
}
