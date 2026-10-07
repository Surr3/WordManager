import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestWordManager {

    @Test
    public void fiveNonEmptyLinesReturns5Lines() {

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
    public void threeEmptyLinesReturns3Lines() {

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
    public void blankInputReturns0Words() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 0;

        //Act
        wordManager.isNotStop("");
        wordManager.isNotStop("");
        wordManager.isNotStop("");

        //Assert
        assertEquals(expected, wordManager.getTotalWords());
    }

    @Test
    public void stopInputReturnsMessage() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "You didn't enter anything!";

        //Act
        wordManager.isNotStop("stop");

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }
    @Test
    public void stopInputReturnsZero() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 0;

        //Act
        wordManager.isNotStop("stop");

        //Assert
        assertEquals(expected, wordManager.getTotalLines());
        assertEquals(expected, wordManager.getTotalCharacters());
        assertEquals(expected, wordManager.getTotalWords());

    }

    @Test
    public void input9CharactersReturns9() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 9;

        //Act
        wordManager.countCharacters("Count me!");

        //Assert
        assertEquals(expected, wordManager.getTotalCharacters());
    }

    @Test
    public void input3WordsReturns3() {

        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 3;

        //Act
        wordManager.countWords("Can you count?");

        //Assert
        assertEquals(expected, wordManager.getTotalWords());
    }

    @Test
    public void singleLongestWordReturns1Word() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"longest!\"";

        //Act
        wordManager.findLongestWords("Here we have a text were only one word is the longest!".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }

    @Test
    public void multipleLongestWordsReturnsAllLongestWords() {

        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "\"attention\", \"softaware\"";

        //Act
        wordManager.findLongestWords("What do you call a software tester with high attention span? A softAWARE tester!".split("\\s+"));

        //Assert
        assertEquals(expected, wordManager.getLongestWords());
    }

    @Test
    public void duplicateLongestWordsReturnsUniqueWords() {

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
