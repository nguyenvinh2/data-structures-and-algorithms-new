package TreeIntersection;

import DataStructures.Tree.BinaryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

    @Test
    public void findValuesTestSomeMatch() {
        BinaryTree testOneOne = new BinaryTree(150);
        BinaryTree testOneTwo = new BinaryTree(100);
        BinaryTree testOneThree = new BinaryTree(250);
        BinaryTree testOneFour = new BinaryTree(75);
        BinaryTree testOneFive = new BinaryTree(160);
        BinaryTree testOneSix = new BinaryTree(200);
        BinaryTree testOneSeven = new BinaryTree(350);
        BinaryTree testOneEight = new BinaryTree(125);
        BinaryTree testOneNine = new BinaryTree(175);
        BinaryTree testOneTen = new BinaryTree(300);
        BinaryTree testOneEleven = new BinaryTree(500);

        testOneOne.addLeftChild(testOneTwo.getRootNode());
        testOneOne.addRightChild(testOneThree.getRootNode());
        testOneTwo.addLeftChild(testOneFour.getRootNode());
        testOneTwo.addRightChild(testOneFive.getRootNode());
        testOneThree.addLeftChild(testOneSix.getRootNode());
        testOneThree.addRightChild(testOneSeven.getRootNode());
        testOneFive.addLeftChild(testOneEight.getRootNode());
        testOneEight.addRightChild(testOneNine.getRootNode());
        testOneSeven.addLeftChild(testOneTen.getRootNode());
        testOneSeven.addRightChild(testOneEleven.getRootNode());

        BinaryTree testTwoOne = new BinaryTree(42);
        BinaryTree testTwoTwo = new BinaryTree(100);
        BinaryTree testTwoThree = new BinaryTree(600);
        BinaryTree testTwoFour = new BinaryTree(15);
        BinaryTree testTwoFive = new BinaryTree(160);
        BinaryTree testTwoSix = new BinaryTree(200);
        BinaryTree testTwoSeven = new BinaryTree(350);
        BinaryTree testTwoEight = new BinaryTree(125);
        BinaryTree testTwoNine = new BinaryTree(175);
        BinaryTree testTwoTen = new BinaryTree(4);
        BinaryTree testTwoEleven = new BinaryTree(500);

        testTwoOne.addLeftChild(testTwoTwo.getRootNode());
        testTwoOne.addRightChild(testTwoThree.getRootNode());
        testTwoTwo.addLeftChild(testTwoFour.getRootNode());
        testTwoTwo.addRightChild(testTwoFive.getRootNode());
        testTwoThree.addLeftChild(testTwoSix.getRootNode());
        testTwoThree.addRightChild(testTwoSeven.getRootNode());
        testTwoFive.addLeftChild(testTwoEight.getRootNode());
        testTwoEight.addRightChild(testTwoNine.getRootNode());
        testTwoSeven.addLeftChild(testTwoTen.getRootNode());
        testTwoSeven.addRightChild(testTwoEleven.getRootNode());
        List<Integer> values = TreeIntersection.findValues(testOneOne, testTwoOne);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(100,160,125,175,200,350,500));
        assertEquals(expected,values);
    }

    @Test
    public void findValuesTestAllMatch() {
        BinaryTree testOneOne = new BinaryTree(150);
        BinaryTree testOneTwo = new BinaryTree(100);
        BinaryTree testOneThree = new BinaryTree(250);
        BinaryTree testOneFour = new BinaryTree(75);
        BinaryTree testOneFive = new BinaryTree(160);
        BinaryTree testOneSix = new BinaryTree(200);
        BinaryTree testOneSeven = new BinaryTree(350);
        BinaryTree testOneEight = new BinaryTree(125);
        BinaryTree testOneNine = new BinaryTree(175);
        BinaryTree testOneTen = new BinaryTree(300);
        BinaryTree testOneEleven = new BinaryTree(500);

        testOneOne.addLeftChild(testOneTwo.getRootNode());
        testOneOne.addRightChild(testOneThree.getRootNode());
        testOneTwo.addLeftChild(testOneFour.getRootNode());
        testOneTwo.addRightChild(testOneFive.getRootNode());
        testOneThree.addLeftChild(testOneSix.getRootNode());
        testOneThree.addRightChild(testOneSeven.getRootNode());
        testOneFive.addLeftChild(testOneEight.getRootNode());
        testOneEight.addRightChild(testOneNine.getRootNode());
        testOneSeven.addLeftChild(testOneTen.getRootNode());
        testOneSeven.addRightChild(testOneEleven.getRootNode());

        BinaryTree testTwoOne = new BinaryTree(150);
        BinaryTree testTwoTwo = new BinaryTree(100);
        BinaryTree testTwoThree = new BinaryTree(250);
        BinaryTree testTwoFour = new BinaryTree(75);
        BinaryTree testTwoFive = new BinaryTree(160);
        BinaryTree testTwoSix = new BinaryTree(200);
        BinaryTree testTwoSeven = new BinaryTree(350);
        BinaryTree testTwoEight = new BinaryTree(125);
        BinaryTree testTwoNine = new BinaryTree(175);
        BinaryTree testTwoTen = new BinaryTree(300);
        BinaryTree testTwoEleven = new BinaryTree(500);

        testTwoOne.addLeftChild(testTwoTwo.getRootNode());
        testTwoOne.addRightChild(testTwoThree.getRootNode());
        testTwoTwo.addLeftChild(testTwoFour.getRootNode());
        testTwoTwo.addRightChild(testTwoFive.getRootNode());
        testTwoThree.addLeftChild(testTwoSix.getRootNode());
        testTwoThree.addRightChild(testTwoSeven.getRootNode());
        testTwoFive.addLeftChild(testTwoEight.getRootNode());
        testTwoEight.addRightChild(testTwoNine.getRootNode());
        testTwoSeven.addLeftChild(testTwoTen.getRootNode());
        testTwoSeven.addRightChild(testTwoEleven.getRootNode());
        List<Integer> values = TreeIntersection.findValues(testOneOne, testTwoOne);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(150, 100, 75, 160,125, 175, 250, 200, 350, 300, 500));
        assertEquals(expected,values);
    }

    @Test
    public void findValuesTestNoMatch() {
        BinaryTree testOneOne = new BinaryTree(150);
        BinaryTree testOneTwo = new BinaryTree(100);
        BinaryTree testOneThree = new BinaryTree(250);
        BinaryTree testOneFour = new BinaryTree(75);
        BinaryTree testOneFive = new BinaryTree(160);
        BinaryTree testOneSix = new BinaryTree(200);
        BinaryTree testOneSeven = new BinaryTree(350);
        BinaryTree testOneEight = new BinaryTree(125);
        BinaryTree testOneNine = new BinaryTree(175);
        BinaryTree testOneTen = new BinaryTree(300);
        BinaryTree testOneEleven = new BinaryTree(500);

        testOneOne.addLeftChild(testOneTwo.getRootNode());
        testOneOne.addRightChild(testOneThree.getRootNode());
        testOneTwo.addLeftChild(testOneFour.getRootNode());
        testOneTwo.addRightChild(testOneFive.getRootNode());
        testOneThree.addLeftChild(testOneSix.getRootNode());
        testOneThree.addRightChild(testOneSeven.getRootNode());
        testOneFive.addLeftChild(testOneEight.getRootNode());
        testOneEight.addRightChild(testOneNine.getRootNode());
        testOneSeven.addLeftChild(testOneTen.getRootNode());
        testOneSeven.addRightChild(testOneEleven.getRootNode());

        BinaryTree testTwoOne = new BinaryTree(4200);
        BinaryTree testTwoTwo = new BinaryTree(1000);
        BinaryTree testTwoThree = new BinaryTree(60000);
        BinaryTree testTwoFour = new BinaryTree(1500);
        BinaryTree testTwoFive = new BinaryTree(16000);
        BinaryTree testTwoSix = new BinaryTree(20000);
        BinaryTree testTwoSeven = new BinaryTree(35000);
        BinaryTree testTwoEight = new BinaryTree(12005);
        BinaryTree testTwoNine = new BinaryTree(17005);
        BinaryTree testTwoTen = new BinaryTree(40000);
        BinaryTree testTwoEleven = new BinaryTree(50000);

        testTwoOne.addLeftChild(testTwoTwo.getRootNode());
        testTwoOne.addRightChild(testTwoThree.getRootNode());
        testTwoTwo.addLeftChild(testTwoFour.getRootNode());
        testTwoTwo.addRightChild(testTwoFive.getRootNode());
        testTwoThree.addLeftChild(testTwoSix.getRootNode());
        testTwoThree.addRightChild(testTwoSeven.getRootNode());
        testTwoFive.addLeftChild(testTwoEight.getRootNode());
        testTwoEight.addRightChild(testTwoNine.getRootNode());
        testTwoSeven.addLeftChild(testTwoTen.getRootNode());
        testTwoSeven.addRightChild(testTwoEleven.getRootNode());
        List<Integer> values = TreeIntersection.findValues(testOneOne, testTwoOne);
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected,values);
    }

    @Test
    public void findValuesTestNull() {
        BinaryTree testOneOne = new BinaryTree();
        BinaryTree testTwoOne = new BinaryTree();
        List<Integer> values = TreeIntersection.findValues(testOneOne, testTwoOne);
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected,values);
    }

    @Test
    public void findValuesTestUnevenTrees() {
        BinaryTree testOneOne = new BinaryTree(150);
        BinaryTree testOneTwo = new BinaryTree(100);
        BinaryTree testOneThree = new BinaryTree(250);
        BinaryTree testOneFour = new BinaryTree(75);
        BinaryTree testOneFive = new BinaryTree(160);
        BinaryTree testOneSix = new BinaryTree(200);
        BinaryTree testOneSeven = new BinaryTree(350);
        BinaryTree testOneEight = new BinaryTree(125);
        BinaryTree testOneNine = new BinaryTree(175);
        BinaryTree testOneTen = new BinaryTree(300);
        BinaryTree testOneEleven = new BinaryTree(500);

        testOneOne.addLeftChild(testOneTwo.getRootNode());
        testOneOne.addRightChild(testOneThree.getRootNode());
        testOneTwo.addLeftChild(testOneFour.getRootNode());
        testOneTwo.addRightChild(testOneFive.getRootNode());
        testOneThree.addLeftChild(testOneSix.getRootNode());
        testOneThree.addRightChild(testOneSeven.getRootNode());
        testOneFive.addLeftChild(testOneEight.getRootNode());
        testOneEight.addRightChild(testOneNine.getRootNode());
        testOneSeven.addLeftChild(testOneTen.getRootNode());
        testOneSeven.addRightChild(testOneEleven.getRootNode());

        BinaryTree testTwoOne = new BinaryTree(150);
        BinaryTree testTwoTwo = new BinaryTree(100);
        BinaryTree testTwoThree = new BinaryTree(250);
        BinaryTree testTwoFour = new BinaryTree(75);

        testTwoOne.addLeftChild(testTwoThree.getRootNode());
        testTwoOne.addRightChild(testTwoFour.getRootNode());
        testTwoFour.addLeftChild(testTwoTwo.getRootNode());
        List<Integer> values = TreeIntersection.findValues(testOneOne, testTwoOne);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(150, 250, 75, 100));
        assertEquals(expected,values);
    }
}