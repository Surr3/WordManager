import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestWordManager {
    @Test
    public void testLineCounter(){
        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 5;

        //Act
        wordManager.lineCounter("Test");
        wordManager.lineCounter("amount");
        wordManager.lineCounter("of");
        wordManager.lineCounter("lines");
        wordManager.lineCounter("!");
        int actual = wordManager.getTotalLines();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCharacterCounter(){
        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 9;

        //Act
        wordManager.characterCounter("Count me!");
        int actual = wordManager.getTotalCharacters();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWordCounter(){
        //Arrange
        WordManager wordManager = new WordManager();
        int expected = 3;

        //Act
        wordManager.wordCounter("Hej på dig!");
        int actual = wordManager.getTotalWords();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWord(){
        //Arrange
        WordManager wordManager = new WordManager();
        String expected = "attention, softaware";

        //Act
        wordManager.longestWord("What do you call a software tester with high attention span? A softAWARE tester!");
        String actual = wordManager.getLongestWords();


        //Assert
        assertEquals(expected, actual);
    }
}
