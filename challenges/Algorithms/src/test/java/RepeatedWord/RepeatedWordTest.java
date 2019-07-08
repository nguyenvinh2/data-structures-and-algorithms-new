package RepeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    @Test
    public void repeatedTest() {
        String input = "Once upon a time, there was a brave princess who...";
        assertEquals("a", RepeatedWord.RepeatedWord(input));
    }

    @Test
    public void repeatedTestTwo() {
        String input = "It was the best of times, it was the worst of times, it was the age of wisdom, " +
                "it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, " +
                "it was the season of Light, it was the season of Darkness, it was the spring of hope, it was " +
                "the winter of despair, we had everything before us, we had nothing before us, we were all " +
                "going direct to Heaven, we were all going direct the other way – in short, the period was " +
                "so far like the present period, that some of its noisiest authorities insisted on its being " +
                "received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals("it", RepeatedWord.RepeatedWord(input));
    }

    @Test
    public void repeatedTestThree() {
        String input = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, " +
                "and I didn’t know what I was doing in New York...";
        assertEquals("summer", RepeatedWord.RepeatedWord(input));
    }

    @Test
    public void repeatedTestPunctuation() {
        String input = "a!!!! store a??????? store";
        assertEquals("a", RepeatedWord.RepeatedWord(input));
    }

    @Test
    public void repeatedTestEmpty() {
        String input = "";
        assertNull(RepeatedWord.RepeatedWord(input));
    }

    @Test
    public void noRepeatedWordTest() {
        String input = "I am Legend";
        assertNull(RepeatedWord.RepeatedWord(input));
    }

    @Test
    public void repeatedWordTestNumbersCount() {
        String input = "12 I am 12 Legend i";
        assertEquals("12", RepeatedWord.RepeatedWord(input));
    }

    @Test
    public void repeatedWordTestPunctuation() {
        String input = "I've am Legend ive";
        assertNull(RepeatedWord.RepeatedWord(input));
    }

}