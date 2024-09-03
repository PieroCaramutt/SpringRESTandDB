package com.pieroCaramutti.foodMacronutrients.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pieroCaramutti.foodMacronutrients.entity.foodInformation;

public interface foodMacrosRepository extends CrudRepository<foodInformation, Integer> {

	List<foodInformation> findByfoodName(String name);
	List<foodInformation> findBygrams(Double grams);
}
