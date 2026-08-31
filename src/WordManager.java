public class WordManager {

    private int totalCharacter;
    private int totalLines;
    private int totalWords;

    private int longestWordsTotalCharacters;
    private String longestWords = "You didn't enter anything!";

    // Checks if user has typed "stop".
    public boolean isNotStop(String userInput) {
        boolean notStopYet = false;
        /*
         * Process the input if user hasn't typed "stop"
         * Add 1 to totalLines, even if it's an empty input.
         * Every input creates a line except "stop".
         */
        if (!userInput.equalsIgnoreCase("stop")) {
            totalLines++;
            /*
             * Processes the input if user has typed something (including blank space).
             * Skip this part if user only hit enter.
             */
            if (!userInput.isEmpty()) {
                countCharacters(userInput);
                countWords(userInput);
            }

            notStopYet = true;
        }

        return notStopYet;
    }

    public void countCharacters(String userInput) {
        totalCharacter += userInput.length();
    }

    public void countWords(String userInput) {
        /*
         * Splits words from user input into an array while removing all blank spaces.
         * Blank spaces are not considered words.
         */
        String[] arrayWithWords = userInput.trim().split("\\s+");
        totalWords += arrayWithWords.length;

        //Uses the same array with words, as previous, to find the longest word(s).
        findLongestWords(arrayWithWords);
    }

    public void findLongestWords(String[] arrayWithWords) {
        // Iterates through every word
        for (String currentWord : arrayWithWords) {
            /*
             * Assigns currentWord to longestWords if currentWord has more characters.
             * Then assigns length of currentWord to longestWordsTotCharacters for next iteration.
             */
            if (currentWord.length() > longestWordsTotalCharacters) {
                longestWordsTotalCharacters = currentWord.length();
                longestWords = "\"" + currentWord.toLowerCase() + "\"";
            }
            /*
             * Adds currentWord to longestWords if currentWord is equally long to longestWords (longestWordsTotCharacters.length()).
             * Also checks that currentWord is not already in longestWords to prevent duplicates.
             */
            else if (currentWord.length() == longestWordsTotalCharacters && !currentWord.isEmpty() && !longestWords.contains(currentWord.toLowerCase())) {
                longestWords = longestWords + ", " + "\"" + currentWord.toLowerCase() + "\"";
            }
        }
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalCharacters() {
        return totalCharacter;
    }

    public int getTotalWords() {
        return totalWords;
    }

    public String getLongestWords() {
        return longestWords;
    }
}
