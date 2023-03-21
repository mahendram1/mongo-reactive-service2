/**
 * 
 */
package com.service2.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.service2.domain.Address;


/**
 * @author mahak
 *
 */
public interface AddressRepository extends ReactiveMongoRepository<Address, String> {

}
