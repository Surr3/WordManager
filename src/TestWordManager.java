import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestWordManager {

    @Test
    public void testLineCounter() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 5;

        //Act
        wordManager.isNotStop("Test");
        wordManager.isNotStop("amount");
        wordManager.isNotStop("of");
        wordManager.isNotStop("lines");
        wordManager.isNotStop("!");

        //Assert
        assertEquals(expected, wordManager.getTotalLines());
    }

    @Test
    public void testCharacterCounter() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 9;

        //Act
        wordManager.characterCounter("Count me!");

        //Assert
        assertEquals(expected, wordManager.getTotalCharacters());
    }

    @Test
    public void testWordCounter() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 3;

        //Act
        wordManager.wordCounter("Can you count?");

        //Assert
        assertEquals(expected, wordManager.getTotalWords());
    }

    @Test
    public void testLongestWord() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"attention\", \"softaware\"";

        //Act
        wordManager.longestWords("What do you call a software tester with high attention span? A softAWARE tester!".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }
}
