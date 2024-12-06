import java.time.LocalTime;
import java.util.Random;

public class WordCombineBenchmark {

    // Generate a random word of specified length
    public static String generateRandomWord(int length) {
        Random random = new Random();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            word.append((char) ('a' + random.nextInt(26))); // Random lowercase letter
        }
        return word.toString();
    }

    // Approach 1: Your `contains` method
    public static boolean canCombineContains(String sourceWord, String targetWord) {
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();

        for (char c : targetWord.toCharArray()) {
            if (!sourceWord.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    // Approach 2: Frequency array method
    public static boolean canCombineFrequency(String sourceWord, String targetWord) {
        sourceWord = sourceWord.toLowerCase();
        targetWord = targetWord.toLowerCase();

        int[] sourceCount = new int[26];
        for (char c : sourceWord.toCharArray()) {
            sourceCount[c - 'a']++;
        }

        for (char c : targetWord.toCharArray()) {
            if (sourceCount[c - 'a'] == 0) {
                return false;
            }
            sourceCount[c - 'a']--;
        }
        return true;
    }

    // Benchmark both methods
    public static void benchmark(int wordLength, int iterations) {
        // Pre-generate words for testing
        String sourceWord = generateRandomWord(wordLength);
        String targetWord = generateRandomWord(wordLength);

        System.out.println("Benchmark started for words with " + wordLength + " letters at: " + LocalTime.now());

        // Benchmark `contains` method
        long startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            canCombineContains(sourceWord, targetWord);
        }
        long containsDuration = System.nanoTime() - startTime;
        System.out.println("Contains method duration: " + containsDuration / 1_000_000 + " ms");

        // Benchmark frequency array method
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            canCombineFrequency(sourceWord, targetWord);
        }
        long frequencyDuration = System.nanoTime() - startTime;
        System.out.println("Frequency array method duration: " + frequencyDuration / 1_000_000 + " ms");

        System.out.println("Benchmark finished at: " + LocalTime.now());
    }

    public static void main(String[] args) {
        int wordLength = 100; // Length of random words
        int iterations = 1_000_000; // Number of iterations for benchmarking
        benchmark(wordLength, iterations);
    }
}

