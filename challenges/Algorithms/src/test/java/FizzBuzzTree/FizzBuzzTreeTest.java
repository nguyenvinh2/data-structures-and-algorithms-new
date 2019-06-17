import DataStructures.Tree.BinaryTree;
import FizzBuzzTree.FizzBuzzTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTreeTest() {
        BinaryTree test = new BinaryTree<Object>(3);
        BinaryTree test2 = new BinaryTree<Object>(5);
        BinaryTree test3 = new BinaryTree<Object>(15);
        BinaryTree test4 = new BinaryTree<Object>(4);
        BinaryTree test5 = new BinaryTree<Object>(8);
        test.addLeftChild(test2.getRootNode());
        test.addRightChild(test3.getRootNode());
        test2.addLeftChild(test4.getRootNode());
        test2.addRightChild(test5.getRootNode());
        FizzBuzzTree.FizzBuzzTree(test);
        List expected = new ArrayList();
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add(4);
        expected.add(8);
        expected.add("FizzBuzz");

        assertEquals(expected, test.preOrder());
    }

    @Test
    public void fizzBuzzTreeTestLeft() {
        BinaryTree test = new BinaryTree<Object>(3);
        BinaryTree test2 = new BinaryTree<Object>(5);
        BinaryTree test3 = new BinaryTree<Object>(15);
        BinaryTree test4 = new BinaryTree<Object>(4);
        BinaryTree test5 = new BinaryTree<Object>(8);
        test.addLeftChild(test2.getRootNode());
        test2.addLeftChild(test3.getRootNode());
        test3.addLeftChild(test4.getRootNode());
        test4.addLeftChild(test5.getRootNode());
        FizzBuzzTree.FizzBuzzTree(test);
        List expected = new ArrayList();
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("FizzBuzz");
        expected.add(4);
        expected.add(8);

        assertEquals(expected, test.preOrder());
    }

    @Test
    public void fizzBuzzTreeTestRight() {
        BinaryTree test = new BinaryTree<Object>(3);
        BinaryTree test2 = new BinaryTree<Object>(5);
        BinaryTree test3 = new BinaryTree<Object>(15);
        BinaryTree test4 = new BinaryTree<Object>(4);
        BinaryTree test5 = new BinaryTree<Object>(8);
        test.addLeftChild(test2.getRootNode());
        test2.addLeftChild(test3.getRootNode());
        test3.addLeftChild(test4.getRootNode());
        test4.addLeftChild(test5.getRootNode());
        FizzBuzzTree.FizzBuzzTree(test);
        List expected = new ArrayList();
        expected.add("Fizz");
        expected.add("Buzz");
        expected.add("FizzBuzz");
        expected.add(4);
        expected.add(8);

        assertEquals(expected, test.preOrder());
    }


    @Test
    public void fizzBuzzTreeTestNull() {
        BinaryTree test = new BinaryTree();
        FizzBuzzTree.FizzBuzzTree(test);
        List expected = new ArrayList();

        assertEquals(expected, test.preOrder());
    }
}