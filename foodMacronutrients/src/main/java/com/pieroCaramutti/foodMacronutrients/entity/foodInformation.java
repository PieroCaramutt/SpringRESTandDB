package com.pieroCaramutti.foodMacronutrients.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class foodInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer foodId;
	
	private String foodName;
	private Double grams;
	private Double protein;
	private Double carbohydrates;
	private Double fat;
	
	public foodInformation() {}
	
	public foodInformation(String foodName, Double grams, Double protein, Double carbohydrates, Double fat) {
		super();
		this.foodName = foodName;
		this.grams = grams;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
	}
	
	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Double getGrams() {
		return grams;
	}

	public void setGrams(Double grams) {
		this.grams = grams;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	@Override
	public String toString() {
		return "foodInformation [foodId=" + foodId + ", foodName=" + foodName + ", grams=" + grams + ", protein="
				+ protein + ", carbohydrates=" + carbohydrates + ", fat=" + fat + "]";
	}

	
}
