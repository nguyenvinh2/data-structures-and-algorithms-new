package MultiBracketValidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidationSingleTrueTest() {
        String test = "{}";
        assertTrue(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationMultipleTrueTest() {
        String test = "{}(){}";
        assertTrue(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationExtraCharTrueTest() {
        String test = "()[[Extra Characters]]";
        assertTrue(MultiBracketValidation.multiBracketValidion(test));
    }


    @Test
    public void multiBracketValidationNestedTrueTest() {
        String test = "(){}[[]]";
        assertTrue(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationNestedCharTrueTest() {
        String test = "{}{Code}[Fellows](())";
        assertTrue(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationNullTest() {
        String test = null;
        assertTrue(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationFalseTest() {
        String test = "[({}]";
        assertFalse(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationNoOpeningFalseTest() {
        String test = "(](";
        assertFalse(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationSingleParenthesisFalseTest() {
        String test = "(";
        assertFalse(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationSingleCurlyFalseTest() {
        String test = "{";
        assertFalse(MultiBracketValidation.multiBracketValidion(test));
    }

    @Test
    public void multiBracketValidationSingleSquareFalseTest() {
        String test = "[";
        assertFalse(MultiBracketValidation.multiBracketValidion(test));
    }
}