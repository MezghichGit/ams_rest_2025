package com.sip.ams.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sip.ams.entities.Provider;
import com.sip.ams.services.ProviderService;

@RestController
@RequestMapping("/providers")
public class ProviderController {
	
	private final ProviderService providerService;
	
	public ProviderController(ProviderService providerService) {
		super();
		this.providerService = providerService;
	}

	@GetMapping("/")
	List<Provider> getAllProviders()
	{
		return this.providerService.listProviders();
	}
	
	@PostMapping("/")
	Provider addProvider(@RequestBody Provider provider)
	{
		return this.providerService.saveProvider(provider);
	}
	
	@GetMapping("/{id}")
	Provider getProviderById(@PathVariable("id") long id)
	{
		return this.providerService.getProvider(id);
	}

}
