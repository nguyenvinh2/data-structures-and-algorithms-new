package RepeatedWord;

import DataStructures.Hashtable.Hashtable;

public class RepeatedWord {

    public static void main(String args[]) {


        String input = "Once upon a time, there was a brave princess who...";
        RepeatedWord(input);

    }

    public static String RepeatedWord(String input) {
        if (input == null) {
            return null;
        }
        String[] words = input.toLowerCase().split(" ");
        Hashtable wordHash = new Hashtable();

        for (int i = 0; i < words.length; i++) {
            String singleWord = words[i].replaceAll("[^\\w\\s]", "");
            boolean n = wordHash.contains(singleWord);
            int key = Hashtable.hash(singleWord);
            if (wordHash.contains(singleWord)) {
                System.out.println("Match"+words[i]);
                return singleWord;
            } else {
                wordHash.add(singleWord, "");
            }
        }
        return null;
    }
}

