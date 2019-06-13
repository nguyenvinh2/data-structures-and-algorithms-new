package DataStructures.Tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void constructorEmptyTest() {
        BinarySearchTree testTree = new BinarySearchTree();
        assertNotNull(testTree);
    }

    @Test
    public void constructorGetValueTest() {
        BinarySearchTree testTree = new BinarySearchTree(7.6);
        assertEquals(7.6, testTree.getRoot(), 0);
    }

    @Test
    public void constructorTestInt() {
        BinarySearchTree testTree = new BinarySearchTree(7);
        assertEquals(7, testTree.getRoot(), 0);
    }

    @Test
    public void setRootTest() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.setRoot(5.678);
        assertEquals(5.678,testTree.getRoot(), 0);
    }

    @Test
    public void setRootTestAlreadyExists() {
        BinarySearchTree testTree = new BinarySearchTree(5);
        testTree.setRoot(5.678);
        assertEquals(5,testTree.getRoot(), 0);
    }

    @Test
    public void addToNullRootTest() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.add(4.5);
        assertEquals(4.5, testTree.getRoot(), 0);
    }

    @Test
    public void addLessThanTest() {
        BinarySearchTree testTree = new BinarySearchTree(5.8);
        testTree.add(4.5);
        testTree.add(4.2);
        testTree.add(3);
        assertEquals(4.5, (double)testTree.getRootNode().left.value, 0);
        assertEquals(4.2, (double)testTree.getRootNode().left.left.value, 0);
        assertEquals(3, (double)testTree.getRootNode().left.left.left.value, 0);
    }

    @Test
    public void addGreaterThanTest() {
        BinarySearchTree testTree = new BinarySearchTree(1.8);
        testTree.add(4.5);
        testTree.add(5.2);
        testTree.add(6);
        assertEquals(4.5, (double)testTree.getRootNode().right.value, 0);
        assertEquals(5.2, (double)testTree.getRootNode().right.right.value, 0);
        assertEquals(6, (double)testTree.getRootNode().right.right.right.value, 0);
    }

    @Test
    public void addBalanceTest() {
        BinarySearchTree testTree = new BinarySearchTree(3.8);
        testTree.add(2.5);
        testTree.add(2.8);
        testTree.add(2.4);
        testTree.add(6);
        testTree.add(3.9);
        testTree.add(6.2);

        assertEquals(2.5, (double)testTree.getRootNode().left.value, 0);
        assertEquals(6, (double)testTree.getRootNode().right.value, 0);

        assertEquals(2.4, (double)testTree.getRootNode().left.left.value, 0);
        assertEquals(2.8, (double)testTree.getRootNode().left.right.value, 0);

        assertEquals(3.9, (double)testTree.getRootNode().right.left.value, 0);
        assertEquals(6.2, (double)testTree.getRootNode().right.right.value, 0);
    }

    @Test
    public void containsTestTrue() {
        BinarySearchTree testTree = new BinarySearchTree(3.8);
        testTree.add(2.5);
        testTree.add(2.8);
        testTree.add(2.4);
        testTree.add(6);
        testTree.add(3.9);
        testTree.add(6.2);

        assertTrue(testTree.contains(6.2));
    }

    @Test
    public void containsTestTrueLeft() {
        BinarySearchTree testTree = new BinarySearchTree(3.8);
        testTree.add(2.5);
        testTree.add(2.8);
        testTree.add(2.4);
        testTree.add(6);
        testTree.add(3.9);
        testTree.add(6.2);

        assertTrue(testTree.contains(2.4));
    }

    @Test
    public void containsTestFalse() {
        BinarySearchTree testTree = new BinarySearchTree(3.8);
        testTree.add(2.5);
        testTree.add(2.8);
        testTree.add(2.4);
        testTree.add(6);
        testTree.add(3.9);
        testTree.add(6.2);

        assertFalse(testTree.contains(7.2));
    }

    @Test
    public void containsTestNull() {
        BinarySearchTree testTree = new BinarySearchTree();
        assertFalse(testTree.contains(7.2));
    }

    @Test
    public void containsTestSingle() {
        BinarySearchTree testTree = new BinarySearchTree(5.4);
        assertTrue(testTree.contains(5.4));
    }

    @Test
    public void containsTestSingleFalse() {
        BinarySearchTree testTree = new BinarySearchTree(6.4);
        assertFalse(testTree.contains(5.4));
    }
}