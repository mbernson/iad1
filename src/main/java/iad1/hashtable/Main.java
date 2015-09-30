package iad1.hashtable;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MathijsHashTable<String, String> ht = new MathijsHashTable<>();

        ht.put("naam", "Alex");
        ht.put("beroep", "Docent");

        System.out.println(ht.get("naam"));
        System.out.println(ht.get("beroep"));
        System.out.println(ht.get("nonexistent"));

        ht = null;

        MathijsHashTable<Integer, String> test = new MathijsHashTable<>();
        Random r = new Random();

        int limit = 10000;
        test.put(100, "Test");
        for (int i = 0; i < limit; i++) {
            int random = r.nextInt();
            test.put(random, random % 2 == 0 ? "Badger" : "Mushroom");
        }

        System.out.printf(test.get(100));
    }

}
