package com.sip.ams.services;
import com.sip.ams.entities.Provider;
import java.util.List;

import org.springframework.stereotype.Service;


public interface ProviderService {
	
	List<Provider>listProviders();
	Provider getProvider(long id);
	Provider saveProvider(Provider provider);
	Provider deleteProvider(long id);

}
