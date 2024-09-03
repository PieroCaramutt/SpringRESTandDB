package com.pieroCaramutti.foodMacronutrients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pieroCaramutti.foodMacronutrients.entity.foodInformation;
import com.pieroCaramutti.foodMacronutrients.repository.foodMacrosRepository;

@SpringBootApplication
public class FoodMacronutrientsApplication implements CommandLineRunner{
	
	@Autowired
	foodMacrosRepository fmr;
	public static void main(String[] args) {
		SpringApplication.run(FoodMacronutrientsApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		
		foodInformation foodInformationOne = new foodInformation("food1", 10.0, 3.5, 25.0, 2.3);
		
		fmr.save(foodInformationOne);
		
		fmr.findByfoodName("food1").forEach(
				val -> System.out.println(val));
	}

}
