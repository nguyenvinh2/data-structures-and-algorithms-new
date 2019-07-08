package RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    @Test
    public void repeatedTest() {
        String input = "Once upon a time, there was a brave princess who...";

        assertEquals("a", RepeatedWord.RepeatedWord(input));
    }

}