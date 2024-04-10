package Kochbuch;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> dict = new HashMap<>();

        dict.put("hello", "Hallo");
        dict.put("Hallo", "hello");
        dict.put("cat", "Katze");
        dict.put("Katze", "cat");

        System.out.println("Geben Sie das Wort ein, das übersetzt werden soll");
        String input = sc.next();

        System.out.println(dict.getOrDefault(input, "sacre bleu"));

    }
}
