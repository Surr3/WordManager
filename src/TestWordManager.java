import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestWordManager {

    @Test
    public void givenFiveLines_countLinesShouldReturnFive() {

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
    public void givenNineCharacters_countCharactersShouldReturnNine() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 9;

        //Act
        wordManager.countCharacters("Count me!");

        //Assert
        assertEquals(expected, wordManager.getTotalCharacters());
    }

    @Test
    public void givenThreeWords_countWordsShouldReturnThree() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 3;

        //Act
        wordManager.countWords("Can you count?");

        //Assert
        assertEquals(expected, wordManager.getTotalWords());
    }

    @Test
    public void givenOneLongestWord_findLongestWordsShouldReturnOne() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"longest!\"";

        //Act
        wordManager.findLongestWords("Here we have a text were only one word is the longest!".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }

    @Test
    public void givenMultipleLongestWords_findLongestWordsShouldReturnAll() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"attention\", \"softaware\"";

        //Act
        wordManager.findLongestWords("What do you call a software tester with high attention span? A softAWARE tester!".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }

    @Test
    public void givenDuplicateLongestWords_findLongestReturnsUniqueWords() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"biggerword\"";

        //Act
        wordManager.findLongestWords("smallWord biggerWord".split("\\s+"));
        wordManager.findLongestWords("smallWord biggerWord".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }
}
