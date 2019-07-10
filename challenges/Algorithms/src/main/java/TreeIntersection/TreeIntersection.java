package TreeIntersection;

import DataStructures.Hashtable.Hashtable;
import DataStructures.Tree.BinaryTree;
import DataStructures.Tree.Node;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

    public static List<Integer> findValues(BinaryTree inputOne, BinaryTree inputTwo)
    {
        Hashtable storeValues = new Hashtable();
        PreOrderHash(inputOne.getRootNode(), storeValues);
        List<Integer> values = new ArrayList<Integer>();

        return PreOrderContains(inputTwo.getRootNode(), storeValues, values);
    }

    private static Hashtable PreOrderHash(Node root, Hashtable storeValues)
    {
        if (root != null)
        {
            storeValues.add(root.value.toString(), "Stored");
            PreOrderHash(root.left, storeValues);
            PreOrderHash(root.right, storeValues);
        }
        return storeValues;
    }

    private static List<Integer> PreOrderContains(Node root, Hashtable storeValues, List<Integer> values)
    {
        if (root != null)
        {
            if (storeValues.contains(root.value.toString()))
            {
                values.add((Integer)root.value);
            }
            PreOrderContains(root.left, storeValues, values);
            PreOrderContains(root.right, storeValues, values);
        }
        return values;
    }
}
