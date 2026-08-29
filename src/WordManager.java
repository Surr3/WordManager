public class WordManager {
    private int totalCharacter;
    private int totalLines;
    private int totalWords;

    private String longestWords;
    private int longestWordsTotCharacters;


    public WordManager() {
    }

    public boolean isStop(String userInput) {
        boolean stop = true;

        if (!userInput.equalsIgnoreCase("stop")){
            totalLines++;
            characterCounter(userInput);
            wordCounter(userInput);
            stop = false;
        }

        return stop;
    }

    public int getTotalLines() {
        return totalLines;
    }

    public void characterCounter(String userInput) {
        totalCharacter += userInput.length();
    }

    public int getTotalCharacters() {
        return totalCharacter;
    }

    public void wordCounter(String userInput) {
        String [] arrayWithWords = userInput.trim().split("\\s+");
        totalWords += arrayWithWords.length;
    }

    public int getTotalWords() {
        return totalWords;
    }
}
