import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkPangram(str);
        if (isPangram) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        Set<Character> letters = new HashSet<>();
        
        
        str = str.toLowerCase().replaceAll("\\s", "");
        
        
        for (char ch : str.toCharArray()) {
            
            if (Character.isAlphabetic(ch)) {
                letters.add(ch);
            }
        }
        
        
        return letters.size() == 26;
    }
}
