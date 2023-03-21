/**
 * 
 */
package com.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service2.domain.Address;
import com.service2.service.AddressService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author mahak
 *
 */
@RestController
@RequestMapping("/api")
public class MongoReactiveController {
	@Autowired
	public AddressService addressService;
	@GetMapping("/")
	public Mono<String> greeting(){
		return Mono.just("Welcome in Mongo Reactive Application.");
	}
	@GetMapping("/address")
	public Flux<Address> getAddresses(){
		return this.addressService.getAddresses();
	}
	@GetMapping("/address/{id}")
	public Mono<Address> getAddress(@PathVariable("id") String id){
		return this.addressService.getAddressById(id);
	}
	
	@PostMapping("/address")
	public Mono<Address> saveAddress(@RequestBody Address address){
		return this.addressService.saveAddress(address);
	}

}
