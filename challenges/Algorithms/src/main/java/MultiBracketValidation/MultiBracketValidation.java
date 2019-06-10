package MultiBracketValidation;

import DataStructures.StackAndQueue.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidion(String input) {
        Stack storeBrackets = new Stack();
        if(input == null) {
            return true;
        }
        for(int i = 0; i<input.toCharArray().length; i++) {
            char evaluate = input.toCharArray()[i];
            switch(evaluate) {
                case (123):
                    storeBrackets.push(evaluate);
                    break;
                case(91):
                    storeBrackets.push(evaluate);
                    break;
                case(40):
                    storeBrackets.push(evaluate);
                    break;
                case(125):
                    if((char)storeBrackets.peek() == 123) {
                        storeBrackets.pop();
                    } else {
                        return false;
                    }
                    break;
                case(93):
                    if((char)storeBrackets.peek() == 91) {
                        storeBrackets.pop();
                    } else {
                        return false;
                    }
                    break;
                case(41):
                    if((char)storeBrackets.peek() == 40) {
                        storeBrackets.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }
        if(storeBrackets.peek() == null) {
            return true;
        } else {
            return false;
        }
    }
}
