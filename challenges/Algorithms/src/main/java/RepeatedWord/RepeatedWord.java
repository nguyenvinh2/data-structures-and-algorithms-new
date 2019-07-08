package RepeatedWord;

import DataStructures.Hashtable.Hashtable;

public class RepeatedWord {
    public static String RepeatedWord(String input) {
        if (input == null) {
            return null;
        }
        String[] words = input.toLowerCase().split(" ");
        Hashtable wordHash = new Hashtable();

        for (int i = 0; i < words.length; i++) {
            String singleWord = words[i].replaceAll("[^\\w\\s]+$", "");
            if (wordHash.contains(singleWord)) {
                return singleWord;
            } else {
                wordHash.add(singleWord, "");
            }
        }
        return null;
    }
}

