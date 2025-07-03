public class kthelement {
    public char kthCharacter(int k) {
        int idx = k - 1;
        StringBuilder result = new StringBuilder();
        result.append('a');

        while (result.length() < k) {
            int n = result.length();
            for (int i = 0; i < n; i++) {
                char ch = result.charAt(i) == 'z' ? 'a' : (char)(result.charAt(i) + 1);
                result.append(ch);
            }
        }

        return result.charAt(idx);
    }

    public static void main(String[] args) {
        kthelement sol = new kthelement();
        int k = 10;
        char result = sol.kthCharacter(k);
        System.out.println("The " + k + "th character in the sequence is: " + result);
    }
}
