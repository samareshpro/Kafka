/**
 * 
 */
package com.mc.main.repository;

import com.mc.main.domain.Temperature;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author SAMARESH
 *
 */
public interface TemperatureRepository extends MongoRepository<Temperature, Integer>{
	@Override
	default List<Temperature> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
