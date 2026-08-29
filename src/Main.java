import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordManager wordManager = new WordManager();
        Scanner scan = new Scanner(System.in);

        System.out.println("Please write a word or a text:");
        while (!wordManager.isStop(scan.nextLine())) {
            System.out.println("Please write another word:");
        }
        scan.close();

        System.out.println("Total characters: " + wordManager.getTotalCharacters());
        System.out.println("Total lines: " + wordManager.getTotalLines());
        System.out.println("Total words: " + wordManager.getTotalWords());
        System.out.println("Longest word(s): " + wordManager.getLongestWords());
    }
}
