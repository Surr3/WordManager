public class WordManager {
    private int totalCharacter;
    private int totalLines;
    private int totalWords;

    private int longestWordsTotCharacters= 0;
    private String longestWords;


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
        longestWords(arrayWithWords);
    }

    public int getTotalWords() {
        return totalWords;
    }

    public void longestWords(String [] arrayWithWords) {
        for (String currentWord : arrayWithWords){
            if (currentWord.length() > longestWordsTotCharacters){
                longestWordsTotCharacters = currentWord.length();
                longestWords = currentWord;
            }else if (currentWord.length() == longestWordsTotCharacters){
                longestWords = longestWords +  ", " + currentWord.toLowerCase();
            }
        }
    }

    public String getLongestWords() {
        return longestWords;
    }
}
