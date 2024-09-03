package com.pieroCaramutti.foodMacronutrients.model;

public class foodMacros {
	
	//Variables
	private Integer foodId;
	private String foodName;
	private Double grams;
	private Double protein;
	private Double carbohydrates;
	private Double fat;
	
	//Constructor
	public foodMacros() {
		
	}
	
	public foodMacros(Integer foodId, String foodName, Double protein, 
			Double carbohydrates, Double fat, Double grams) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.grams = grams;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.fat = fat;
	}
	
	
	//Getters and Setters
	public Integer getFoodId() {
		return foodId;
	}

	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}
	public Double getGrams() {
		return grams;
	}

	public void setGrams(Double grams) {
		this.grams = grams;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
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
}
