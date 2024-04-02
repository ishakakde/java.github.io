public class RemoveNonAlphabetic {
    public static void main(String[] args) {
        String str = "Hello123, my name is isha kakde!";

        String result = removeNonAlphabetic(str);
        System.out.println("Result: " + result);
    }

    public static String removeNonAlphabetic(String str) {
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
