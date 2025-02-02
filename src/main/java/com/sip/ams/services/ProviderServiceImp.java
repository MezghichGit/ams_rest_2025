package com.sip.ams.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;

@Service
public class ProviderServiceImp implements ProviderService {

	private final ProviderRepository providerRepository;

	public ProviderServiceImp(ProviderRepository providerRepository) {
		this.providerRepository = providerRepository;
	}

	@Override
	public List<Provider> listProviders() {
		return (List<Provider>) this.providerRepository.findAll();
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
	public void deleteProvider(long id) {

		this.providerRepository.deleteById(id);

	}

}
