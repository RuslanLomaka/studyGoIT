public class DigitExtractionBenchmark {
    // Approach 1: Using replaceAll and toCharArray
    public static int[] extractDigitsUsingReplaceAll(String text) {
        String onlyDigits = text.replaceAll("\\D", ""); // Keep only digits
        int[] digits = new int[onlyDigits.length()];
        for (int i = 0; i < onlyDigits.length(); i++) {
            digits[i] = Character.getNumericValue(onlyDigits.charAt(i));
        }
        return digits;
    }

    // Approach 2: Using StringBuilder-like logic
    public static int[] extractDigitsUsingStringBuilder(String text) {
        StringBuilder digitBuilder = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                digitBuilder.append(c);
            }
        }
        int[] digits = new int[digitBuilder.length()];
        for (int i = 0; i < digitBuilder.length(); i++) {
            digits[i] = Character.getNumericValue(digitBuilder.charAt(i));
        }
        return digits;
    }

    public static void main(String[] args) {
        // Test string and iterations
        String testString = "Hello123World4567!890".repeat(1000); // Large input
        int iterations = 1_000_000;

        // Benchmark Approach 1
        long startReplaceAll = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            extractDigitsUsingReplaceAll(testString);
        }
        long durationReplaceAll = System.currentTimeMillis() - startReplaceAll;

        // Benchmark Approach 2
        long startStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            extractDigitsUsingStringBuilder(testString);
        }
        long durationStringBuilder = System.currentTimeMillis() - startStringBuilder;

        // Print results
        System.out.println("ReplaceAll approach duration: " + durationReplaceAll + " ms");
        System.out.println("StringBuilder approach duration: " + durationStringBuilder + " ms");
    }
}
