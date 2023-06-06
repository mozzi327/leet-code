package I_easy.Q58_length_of_last_word;

public class Solution_Q58 {
    public int lengthOfLastWord(String s) {
        String newStr = s.replaceAll("\\s+", " ");
        String[] sArr = newStr.split(" ");
        return sArr[sArr.length - 1].length();
    }
}
