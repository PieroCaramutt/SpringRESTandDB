package com.pieroCaramutti.foodMacronutrients.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pieroCaramutti.foodMacronutrients.model.foodMacros;

@RestController
@RequestMapping("/foodmacros")
public class foodAPIService {
	
	foodMacros foodmacros;
	
	@GetMapping("{foodId}")
	public foodMacros getFoodMacrosDetails(String foodId) {
		return new foodMacros(1, "Beef Crossribs", 100.0, 19.4, 0.0, 7.9);
	}
	
	@PostMapping
	public String createFoodMacrosDetails(@RequestBody foodMacros foodmacros) {
		this.foodmacros = foodmacros;
		return "foodMacros succcessfully createed";
	}
	
	@PutMapping
	public String updateFoodMacrosDetails(@RequestBody foodMacros foodmacros) {
		this.foodmacros = foodmacros;
		return "foodMacros succcessfully updated";
	}
	
	@DeleteMapping
	public String deleteFoodMacrosDetails(@RequestBody foodMacros foodmacros) {
		this.foodmacros = foodmacros;
		return "foodMacros succcessfully deleted";
	}
}
