import DataStructures.Tree.BinaryTree;
import DataStructures.Tree.Node;

public class FizzBuzzTree {

    public static void FizzBuzzTree(BinaryTree tree) {
        if (tree != null)
        {
            FizzBuzzNode(tree.getRootNode());
        }
    }

    private static void FizzBuzzNode(Node root) {
        if(root != null) {
            root.value = FizzBuzz(root.value);
            FizzBuzzNode(root.left);
            FizzBuzzNode(root.right);
        }
    }

    private static Object FizzBuzz(Object value)
    {
        if ((int)value % 3 == 0 && (int)value % 5 != 0)
        {
            return "Fizz";
        }
        else if ((int)value % 5 == 0 && (int)value % 3 != 0)
        {
            return "Buzz";
        }
        else if ((int)value % 5 == 0 && (int)value % 3 == 0)
        {
            return "FizzBuzz";
        }
        else
        {
            return value;
        }

    }
}
