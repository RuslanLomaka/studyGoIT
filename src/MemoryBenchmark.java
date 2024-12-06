import java.util.Random;

public class MemoryBenchmark {

    // Generate a random word of specified length
    public static String generateRandomWord(int length) {
        Random random = new Random();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < length; i++) {
            word.append((char) ('a' + random.nextInt(26))); // Random lowercase letter
        }
        return word.toString();
    }

    // Contains method
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

    // Frequency array method
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

    // Benchmark memory usage
    public static void benchmarkMemory(int wordLength) {
        String sourceWord = generateRandomWord(wordLength);
        String targetWord = generateRandomWord(wordLength);

        Runtime runtime = Runtime.getRuntime();

        // Memory for contains method
        runtime.gc();
        long memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        canCombineContains(sourceWord, targetWord);
        long memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Contains method memory used: " + (memoryAfter - memoryBefore) + " bytes");

        // Memory for frequency array method
        runtime.gc();
        memoryBefore = runtime.totalMemory() - runtime.freeMemory();
        canCombineFrequency(sourceWord, targetWord);
        memoryAfter = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Frequency array method memory used: " + (memoryAfter - memoryBefore) + " bytes");
    }

    public static void main(String[] args) {
        int wordLength = 100; // Length of random words
        benchmarkMemory(wordLength);
    }
}
