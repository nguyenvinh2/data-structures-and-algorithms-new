package DataStructures.Tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void getRootTest() {
        BinaryTree<String> testTree = new BinaryTree("Hey");
        assertEquals("Hey", testTree.getRoot());
    }

    @Test
    public void getRootNodeTest() {
        BinaryTree<String> testTree = new BinaryTree("Yassw");
        assertEquals("Yassw", testTree.getRootNode().value);
    }

    @Test
    public void setRootTest() {
        BinaryTree testTree = new BinaryTree();
        assertNull(testTree.getRootNode());
        assertNotNull(testTree);

        testTree.setRoot(87.3);
        assertEquals(87.3, testTree.getRoot());
    }

    @Test
    public void setRootTestAlreadyExists() {
        BinaryTree testTree = new BinaryTree("kilmonger");
        testTree.setRoot(87.3);
        assertEquals("kilmonger", testTree.getRoot());
    }

    @Test
    public void addLeftChildTestDefault() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        testTree.addLeftChild("Left Child");
        assertEquals("Left Child", testTree.getRootNode().left.value);
    }

    @Test
    public void addRightChildTestDefault() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        testTree.addRightChild("Right Child");
        assertEquals("Right Child", testTree.getRootNode().right.value);
    }

    @Test
    public void addLeftChildTestTree() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        BinaryTree<String> leftTestTree = new BinaryTree("Left Child");
        testTree.addLeftChild(leftTestTree.getRootNode());
        assertEquals(leftTestTree.getRootNode(), testTree.getRootNode().left);
    }

    @Test
    public void addRightChildTestTree() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        BinaryTree<String> rightTestTree = new BinaryTree("Right Child");
        testTree.addRightChild(rightTestTree.getRootNode());
        assertEquals(rightTestTree.getRootNode(), testTree.getRootNode().right);
    }

    @Test
    public void addLeftChildTestSelectRoot() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        BinaryTree<String> leftTestTree = new BinaryTree("Left Child");
        testTree.addLeftChild(testTree.getRootNode(), leftTestTree.getRootNode());
        assertEquals(leftTestTree.getRootNode(), testTree.getRootNode().left);
    }

    @Test
    public void addRightChildTestTreeSelectRoot() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        BinaryTree<String> rightTestTree = new BinaryTree("Right Child");
        testTree.addRightChild(testTree.getRootNode(), rightTestTree.getRootNode());
        assertEquals(rightTestTree.getRootNode(), testTree.getRootNode().right);
    }



    @Test
    public void addLeftChildTest() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        testTree.addLeftChild(testTree.getRootNode(), "Left Child");
        assertEquals("Left Child", testTree.getRootNode().left.value);
    }

    @Test
    public void addLeftChildTestSecondOrder() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        testTree.addLeftChild(testTree.getRootNode(), "Left Child");
        testTree.addLeftChild(testTree.getRootNode().left, "Second Left Child");
        assertEquals("Left Child", testTree.getRootNode().left.value);
        assertEquals("Second Left Child", testTree.getRootNode().left.left.value);
    }

    @Test
    public void addRightChildTest() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        testTree.addLeftChild(testTree.getRootNode(), "Left Child");
        assertEquals("Left Child", testTree.getRootNode().left.value);
    }

    @Test
    public void addRightChildTestSecondOrder() {
        BinaryTree<String> testTree = new BinaryTree("Root");
        testTree.addRightChild(testTree.getRootNode(), "Right Child");
        testTree.addRightChild(testTree.getRootNode().right, "Second Right Child");
        assertEquals("Right Child", testTree.getRootNode().right.value);
        assertEquals("Second Right Child", testTree.getRootNode().right.right.value);
    }

    @Test
    public void preOrderTestNull() {
        BinaryTree<String> testTree = new BinaryTree();
        List<String> values = testTree.preOrder();
        assertTrue(values.isEmpty());
    }

    @Test
    public void inOrderTestNull() {
        BinaryTree<String> testTree = new BinaryTree();
        List<String> values = testTree.inOrder();
        assertTrue(values.isEmpty());
    }

    @Test
    public void postOrderTestNull() {
        BinaryTree<String> testTree = new BinaryTree();
        List<String> values = testTree.inOrder();
        assertTrue(values.isEmpty());
    }

    @Test
    public void preOrderTestNormal() {
        BinaryTree<String> testTree = new BinaryTree("Hey");
        testTree.addLeftChild(testTree.getRootNode(),"You're cool");
        testTree.addRightChild(testTree.getRootNode(),"You're not");
        testTree.addLeftChild(testTree.getRootNode().left,"I quit");
        testTree.addRightChild(testTree.getRootNode().left,"Screw you");
        testTree.addLeftChild(testTree.getRootNode().right,"I should make an auto tree fill in");
        testTree.addRightChild(testTree.getRootNode().right,"This is cumbersome");
        String[] expected = new String[]{"Hey", "You're cool", "I quit", "Screw you", "You're not", "I should make an auto tree fill in", "This is cumbersome"};
        List<String> values = testTree.preOrder();
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], values.get(i));
        }
    }

    @Test
    public void inOrderTestNormal() {
        BinaryTree<String> testTree = new BinaryTree("Hey");
        testTree.addLeftChild(testTree.getRootNode(),"You're cool");
        testTree.addRightChild(testTree.getRootNode(),"You're not");
        testTree.addLeftChild(testTree.getRootNode().left,"I quit");
        testTree.addRightChild(testTree.getRootNode().left,"Screw you");
        testTree.addLeftChild(testTree.getRootNode().right,"I should make an auto tree fill in");
        testTree.addRightChild(testTree.getRootNode().right,"This is cumbersome");
        String[] expected = new String[]{"I quit", "You're cool", "Screw you", "Hey", "I should make an auto tree fill in", "You're not", "This is cumbersome"};
        List<String> values = testTree.inOrder();
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], values.get(i));
        }
    }

    @Test
    public void postOrderTestNormal() {
        BinaryTree<String> testTree = new BinaryTree("Hey");
        testTree.addLeftChild(testTree.getRootNode(),"You're cool");
        testTree.addRightChild(testTree.getRootNode(),"You're not");
        testTree.addLeftChild(testTree.getRootNode().left,"I quit");
        testTree.addRightChild(testTree.getRootNode().left,"Screw you");
        testTree.addLeftChild(testTree.getRootNode().right,"I should make an auto tree fill in");
        testTree.addRightChild(testTree.getRootNode().right,"This is cumbersome");
        String[] expected = new String[]{"I quit", "Screw you", "You're cool", "I should make an auto tree fill in", "This is cumbersome", "You're not", "Hey"};
        List<String> values = testTree.postOrder();
        for(int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], values.get(i));
        }
    }

    @Test
    public void breadthFirstTest() {
        BinaryTree test = new BinaryTree<Object>(3);
        BinaryTree test2 = new BinaryTree<Object>(5);
        BinaryTree test3 = new BinaryTree<Object>(15);
        BinaryTree test4 = new BinaryTree<Object>(4);
        BinaryTree test5 = new BinaryTree<Object>(8);
        test.addLeftChild(test2.getRootNode());
        test.addRightChild(test3.getRootNode());
        test2.addLeftChild(test4.getRootNode());
        test2.addRightChild(test5.getRootNode());
        List expected = new ArrayList();
        expected.add(3);
        expected.add(5);
        expected.add(15);
        expected.add(4);
        expected.add(8);

        assertEquals(expected, test.breadthTraversal());
    }

    @Test
    public void breadthFirstTestNonNumeric() {
        BinaryTree test = new BinaryTree<Object>("No");
        BinaryTree test2 = new BinaryTree<Object>("numbers");
        BinaryTree test3 = new BinaryTree<Object>("into");
        BinaryTree test4 = new BinaryTree<Object>("the");
        BinaryTree test5 = new BinaryTree<Object>("abyss");
        test.addLeftChild(test2.getRootNode());
        test.addRightChild(test3.getRootNode());
        test2.addLeftChild(test4.getRootNode());
        test2.addRightChild(test5.getRootNode());
        List expected = new ArrayList();
        expected.add("No");
        expected.add("numbers");
        expected.add("into");
        expected.add("the");
        expected.add("abyss");

        assertEquals(expected, test.breadthTraversal());
    }

    @Test
    public void breadthFirstTestNull() {
        BinaryTree test = new BinaryTree();
        assertTrue(test.breadthTraversal().isEmpty());
    }

}