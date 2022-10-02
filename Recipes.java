import java.util.*;

public class Recipes {
    private String name;
    private String description;
    private ArrayList<String> ingredients;
    private ArrayList<String> steps;

    public Recipes(){
    	this.ingredients = new ArrayList<String>();
        this.steps = new ArrayList<String>();
    }

    public Recipes(String recipe_name, String desc) {
        this.name = recipe_name;
        this.description = desc;
        this.ingredients = new ArrayList<String>();
        this.steps = new ArrayList<String>();
    }
    
    //Getter and Setters for name and description
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    //Adding new ingredients and steps
    public void addIngred(String newIngred) {
    	this.ingredients.add(newIngred);
    }
    public void addStep(String newStep) {
    	this.steps.add(newStep);
    }
    
    //Getting the Array List of Ingredients
    public ArrayList<String> getIngredientsArray() {
        return this.ingredients;
    }
    
    //Getting a String containing all ingredients 
    public String getIngredients() {
        String IngStr = "";
    	for (int i = 0; i<this.ingredients.size();i++) {
    		IngStr = IngStr + this.ingredients.get(i) + (i==this.ingredients.size()-1?"":",");
        }
    	return IngStr;
    }
    
    //Change an ingredient at the given index, assume the index is correct
    public void changeIngredient(String newIngred, int n) {
        this.ingredients.set(n, newIngred);
    }
    //Delete an ingredient at the given index, assume the index is correct
    public void deleteIngredient(int n) {
        this.ingredients.remove(n);
    }
    
    //Getting the Array List of Steps
    public ArrayList<String> getStepsArray() {
        return this.steps;
    }
    
    //Getting a String containing all ingredients 
    public String getSteps() {
    	String stepStr = "";
    	for (int i = 0; i<this.ingredients.size();i++) {
    		stepStr = stepStr + (i==0?"":"  ") + String.format("%d. %s", i+1, this.steps.get(i));
        }
    	return stepStr;
	}
    
    //Change a step at the given index, assume the index is correct
    public void changeStep(String newIngred, int n) {
        this.ingredients.set(n, newIngred);
    }
    //Delete a step at the given index, assume the index is correct
    public void deleteStep(int n) {
        this.ingredients.remove(n);
    }
    
    //Check if the recipe contains certain ingredients, given a word of ingredients
    public Boolean containsIng(String ingredient) {
    	for (String s: this.ingredients) {
    		if (s.contains(ingredient)) {
    			return true;
    		}
    	}
    	return false;
    }
}
