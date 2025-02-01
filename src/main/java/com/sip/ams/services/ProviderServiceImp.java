package com.sip.ams.services;

import java.util.List;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;

public class ProviderServiceImp implements ProviderService{

	
	private final ProviderRepository providerRepository;
	
	public ProviderServiceImp(ProviderRepository providerRepository) {
		this.providerRepository = providerRepository;
	}

	@Override
	public List<Provider> listProviders() {
		return (List<Provider>)this.providerRepository.findAll();
	}

	@Override
	public Provider getProvider(long id) {
		return this.providerRepository.findById(id).get();
	}

	@Override
	public Provider saveProvider(Provider provider) {
		return this.providerRepository.save(provider);
	}

	@Override
	public Provider deleteProvider(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
