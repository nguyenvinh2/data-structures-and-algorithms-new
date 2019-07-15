package LeftJoin;

import DataStructures.Hashtable.Hashtable;
import DataStructures.Hashtable.PairNode;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {
    public static List<String> retrieve(Hashtable inputOne, Hashtable inputTwo) {
        List<String> wordList = new ArrayList<>();
        List<String> inputKeysOne = getHashKeys(inputOne);
        inputKeysOne.forEach(keys -> wordList.add(keys + ": " + inputOne.get(keys) + " - " + inputTwo.get(keys)));
        return wordList;
    }

    private static List<String> getHashKeys(Hashtable input) {
        List<String> keys = new ArrayList<>();
        for(int i = 0; i < input.getIndex().length; i++) {
            if(input.getIndex()[i] != null) {
                input.getIndex()[i].current = input.getIndex()[i].head;
                while(input.getIndex()[i].current != null) {
                    PairNode node = (PairNode)input.getIndex()[i].current.value;
                    keys.add(node.getKey());
                    input.getIndex()[i].current = input.getIndex()[i].current.next;
                }
            }
        }
        return keys;
    }
}