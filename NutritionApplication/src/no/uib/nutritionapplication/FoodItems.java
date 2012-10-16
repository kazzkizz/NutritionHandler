package no.uib.nutritionapplication;

public class FoodItems {

	private String name;
	private int protein;
	private int fat;
	private int carbohydrates;
	private int calories;
	private String description;

	public FoodItems(String name, int protein, int fat, int carbohydrates, int calories, String description) {
		setName(name);
		setProtein(protein);
		setFat(fat);
		setCarbs(carbohydrates);
		setCalories(calories);
		setDesc(description);
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setProtein(int protein){
		this.protein = protein;
	}
	public void setFat(int fat){
		this.fat = fat;
	}
	public void setCarbs(int carbohydrates){
		this.carbohydrates = carbohydrates;
	}
	public void setCalories(int calories){
		this.calories = calories;
	}
	public void setDesc(String description){
		this.description = description;
	}
	
	public String getName(String name){
		return name;
	}
	public int getProtein(int protein){
		return protein;
	}
	public int getFat(int fat){
		return fat;
	}
	public int getCarbs(int carbohydrates){
		return carbohydrates;
	}
	public int getCalories(int calories){
		return calories;
	}
	public String getDesc(String description){
		return description;
	}
}

