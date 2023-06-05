package Q9_palindrome_number;

public class Solution_Q9 {
    public boolean isPalindrome(int x) {
        String sNum = String.valueOf(x);
        if(sNum.charAt(0) == '-') return false;
        StringBuilder sb = new StringBuilder(sNum);
        return sNum.equals(sb.reverse().toString());
    }
}
