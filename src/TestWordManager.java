import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestWordManager {

    @Test
    public void givenFiveInputs_getTotalLinesShouldReturnFive() {

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
    public void givenThreeEmptyInputs_getTotalLinesShouldReturnThree() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 3;

        //Act
        wordManager.isNotStop("");
        wordManager.isNotStop("");
        wordManager.isNotStop("");

        //Assert
        assertEquals(expected, wordManager.getTotalLines());
    }

    @Test
    public void givenStopAsFirstInput_shouldReturnZeroWithMessage() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 0;
        String expectedMessage = "You didn't enter anything!";

        //Act
        wordManager.isNotStop("stop");

        //Assert
        assertEquals(expected, wordManager.getTotalLines());
        assertEquals(expected, wordManager.getTotalCharacters());
        assertEquals(expected, wordManager.getTotalWords());
        assertEquals(expectedMessage, wordManager.getLongestWords());
    }

    @Test
    public void givenNineCharacters_getTotalCharactersShouldReturnNine() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 9;

        //Act
        wordManager.countCharacters("Count me!");

        //Assert
        assertEquals(expected, wordManager.getTotalCharacters());
    }

    @Test
    public void givenThreeWords_getTotalWordsShouldReturnThree() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 3;

        //Act
        wordManager.countWords("Can you count?");

        //Assert
        assertEquals(expected, wordManager.getTotalWords());
    }

    @Test
    public void givenOneLongestWord_findLongestWordsShouldReturnOneWord() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"longest!\"";

        //Act
        wordManager.findLongestWords("Here we have a text were only one word is the longest!".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }

    @Test
    public void givenMultipleLongestWords_findLongestWordsShouldReturnAllWords() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"attention\", \"softaware\"";

        //Act
        wordManager.findLongestWords("What do you call a software tester with high attention span? A softAWARE tester!".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }

    @Test
    public void givenDuplicateLongestWords_findLongestShouldReturnUniqueWords() {

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
