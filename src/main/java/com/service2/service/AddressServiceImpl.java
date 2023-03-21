/**
 * 
 */
package com.service2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.service2.dao.AddressRepository;
import com.service2.domain.Address;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author mahak
 *
 */
@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	public RestTemplate restTemplate;
	@Autowired
	public AddressRepository addressRepository;
	@Override
	public Mono<Address> saveAddress(Address address) {
		return this.addressRepository.insert(address);
		
	}

	@Override
	public Flux<Address> getAddresses() {
		return this.addressRepository.findAll();
	}

	@Override
	public Mono<Address> getAddressById(String id) {
		return this.addressRepository.findById(id);
	}

}
