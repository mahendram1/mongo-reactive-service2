/**
 * 
 */
package com.service2.service;

import com.service2.domain.Address;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author mahak
 *
 */
public interface AddressService {
	
	public Mono<Address> saveAddress(Address address);
	public Flux<Address> getAddresses();
	public Mono<Address> getAddressById(String id);

}
