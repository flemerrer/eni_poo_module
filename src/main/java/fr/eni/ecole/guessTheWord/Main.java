package fr.eni.ecole.guessTheWord;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static final String filePath = "sources/dictionnaire.txt";
    public static final int dictionaryLinesNumber = 22506;

    public static void main(String[] args) {
        String wordToGuess = getRandomWord();
        String randomizedWord = randomizeWord(wordToGuess).toLowerCase();
        System.out.println("Les lettres à utiliser sont : " + randomizedWord + "\nA vous de proposer un mot le plus long possible avec ces lettres.\nEntrez votre proposition :");
        String proposition = guessWord(randomizedWord);
        System.out.println("Vous avez proposé : " + proposition + ".\nLe mot tiré au sort était : " + wordToGuess + ".");
        if (wordToGuess.equals(proposition)) {
            System.out.println("Vous avez trouvé le mot, bravo !");
        }
    }

    private static String guessWord(String randomizedWord) {
        Scanner scanner = new Scanner(System.in);
        String guessedWord = "";
        while (true) {
            guessedWord = scanner.nextLine();
            if (testInput(guessedWord, randomizedWord)) {
                if (dictionaryContains(guessedWord)) {
                    scanner.close();
                    return guessedWord;
                } else {
                    System.out.println("Votre proposition n'est pas un mot du dictionnaire. Essayez encore :");
                }
            }
        }
    }

    private static boolean testInput(String guessedWord, String randomizedWord) {
        for (char c : guessedWord.toCharArray()) {
            if (!randomizedWord.contains(String.valueOf(c))) {
                System.out.println("Votre proposition contient une lettre invalide. Essayez encore :");
                return false;
            }
        }
        return true;
    }

    private static String getRandomWord() {
        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(dictionaryLinesNumber);
        try (Stream<String> lines = Files.lines(Paths.get(Main.filePath))) {
            return lines.skip(randomNumber - 1).findFirst().get();
        } catch (IOException io) {
            throw new RuntimeException(io);
        }
    }

    private static String randomizeWord(String wordToGuess) {
        List<String> list = new ArrayList<>();
        for (char c : wordToGuess.toCharArray()) {
            list.add(String.valueOf(c));
        }
        Collections.shuffle(list);
        return String.join("", list);
    }

    private static boolean dictionaryContains(String guessedWord) {
        try (Stream<String> lines = Files.lines(Paths.get(Main.filePath))) {
            List<String> filteredDict = lines.filter(x -> x.contains(guessedWord)).toList();
            for (String word : filteredDict) {
                if (word.equals(guessedWord)) {
                    return true;
                }
            }
        } catch (IOException io) {
            throw new RuntimeException(io);
        }
        return false;
    }

}
