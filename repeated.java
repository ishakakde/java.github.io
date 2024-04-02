public class HighestRepeatedLettersWord {
    public static void main(String[] args) {
        String str = "hello world bookkeeper";
        String result = findWordWithHighestRepeatedLetters(str);
        if (!result.equals("1")) {
            System.out.println("Word with highest repeated letters: " + result);
        } else {
            System.out.println("No word found with repeated letters.");
        }
    }

    public static String findWordWithHighestRepeatedLetters(String str) {
        String[] words = str.split("\\s+");
        String wordWithHighestRepeatedLetters = "1";
        
        int maxRepeatedLetters = 0;

        for (String word : words) {
            int[] letterCount = new int[26]; 

           
            for (char ch : word.toCharArray()) {
                letterCount[ch - 'a']++;
            }

            
            int maxCount = 0;
            for (int count : letterCount) {
                if (count > 1 && count > maxCount) {
                    maxCount = count;
                }
            }

            
            if (maxCount > maxRepeatedLetters) {
                maxRepeatedLetters = maxCount;
                wordWithHighestRepeatedLetters = word;
            }
        }

        return wordWithHighestRepeatedLetters;
    }
}
