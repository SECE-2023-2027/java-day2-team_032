public class Problem_08 {
    public static void main(String[] args) {
        String[] words = {"cat", "flag", "green", "country", "w3resource"};
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.print("Result: ");
        for (String word : words) {
            if (word.length() == maxLength) {
                System.out.print("\"" + word + "\" ");
            }
        }
    }
}