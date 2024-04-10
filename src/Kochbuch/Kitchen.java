package Kochbuch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Kitchen{
    public static void main(String[] args) {
        List<Recipe> recipes = new ArrayList<>();

        recipes.add(new Recipe("Pommes Schranke", "Pommes mit Ketchup und Mayo"));
        recipes.add(new Recipe("Bockwurst", "Bockwurst mit Ketchup und Mayo"));
        recipes.add(new Recipe("Burger", "Burger mit Ketchup und Mayo"));

        for (Recipe recipe : recipes) {
            System.out.println(recipe.toString());
        }

        System.out.println(countUniqueCharacters("Anna"));

    }

    public static int countUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            uniqueChars.add(str.charAt(i));
        }
        return uniqueChars.size();
    }
}
