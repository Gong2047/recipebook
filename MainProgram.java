import java.util.*;
import java.io.*;

public class MainProgram {
    
    public static ArrayList<Recipes> recipeList = new ArrayList<Recipes> ();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RecipeRetrieval data = new RecipeRetrieval();
        ArrayList<Recipes> hold = data.LoadRecipes();
        recipeList = hold;
        RecipeRetrieval recipeRetrieval = new RecipeRetrieval();
        recipeRetrieval.retrievalInterface(input, recipeList);
    }
}
