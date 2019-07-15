package DataStructures.Hashtable;

public class PairNode<T> {
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public PairNode(String key, T value) {
        this.key = key;
        this.value = value;
    }


    private String key;
    private T value;
}
