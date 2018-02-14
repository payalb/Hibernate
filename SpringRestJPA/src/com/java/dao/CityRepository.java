package com.java.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.java.dto.City;


public interface CityRepository {
	Page<City> findByNameContainingAndCountryContainingAllIgnoringCase(String name,
			String country, Pageable pageable);

	City findByNameAndCountryAllIgnoringCase(String name, String country);

}
