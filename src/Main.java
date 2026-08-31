import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager();
        Scanner scan = new Scanner(System.in);

        System.out.print("Write a word/text (type \"stop\" to exit):\n> ");
        while (wordManager.isNotStop(scan.nextLine())) {
            System.out.print("Write another word/text (\"stop\" to exit): \n> ");
        }
        scan.close();

        System.out.println("\nTotal characters:  " + wordManager.getTotalCharacters());
        System.out.println("Total lines:       " + wordManager.getTotalLines());
        System.out.println("Total words:       " + wordManager.getTotalWords());
        System.out.println("Longest word(s):   " + wordManager.getLongestWords());
    }
}
