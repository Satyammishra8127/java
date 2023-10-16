public class PangramChecker {
    public static boolean isPangram(String input) {
        boolean[] mark = new boolean[26];
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                mark[ch - 'a'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }   
        return true; 
    }
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
