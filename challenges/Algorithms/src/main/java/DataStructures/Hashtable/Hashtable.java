package DataStructures.Hashtable;

import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;

public class Hashtable {

    private LinkedList[] collisionList = new LinkedList[1024];

    public void add(String key, String value) {
        int index = hash(key);
        PairNode input = new PairNode(key, value);
        if (collisionList[index] == null) {
            LinkedList New = new LinkedList();
            New.append(new Node(input));
            collisionList[index] = New;
        } else {
            collisionList[index].append(new Node(input));
        }
    }

    public String get(String key) {
        int index = hash(key);
        if (collisionList[index] != null) {
            while (collisionList[index].current != null) {
                PairNode output = (PairNode) collisionList[index].current.value;

                if (output.getKey() == key) {
                    return output.getValue();
                } else {
                    collisionList[index].current = collisionList[index].current.next;
                }
            }
        }
        return null;
    }

    public boolean contains(String key) {
        int index = hash(key);
        if (collisionList[index] != null) {
            while (collisionList[index].current != null) {
                PairNode output = (PairNode) collisionList[index].current.value;
                if (output.getKey() == key) {
                    return true;
                } else {
                    collisionList[index].current = collisionList[index].current.next;
                }
            }
        }
        return false;
    }

    public static int hash(String key) {
        if (key.toCharArray().length == 0)
            return 0;
        int sum = 0;
        int n = key.toCharArray().length;
        for (int i = 0; i < n - 1; i++) {
            sum += key.toCharArray()[i] * (int) Math.pow(31, n - i - 1);
        }
        sum += key.toCharArray()[n - 1];
        return Math.abs(sum) % 1024;
    }
}

class PairNode {
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public PairNode(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private String key;
    private String value;
}
