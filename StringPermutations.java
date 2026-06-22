// String Permutations using Backtracking
// Time Complexity: O(n!)
// Space Complexity: O(n)

public class StringPermutations {

    public static void generatePermutations(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            String newString = str.substring(0, i) + str.substring(i + 1);

            generatePermutations(newString, perm + current);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        generatePermutations(str, "");
    }
}
