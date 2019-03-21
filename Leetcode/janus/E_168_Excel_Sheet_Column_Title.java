import java.util.ArrayList;
import java.util.List;

/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * <p>
 * For example:
 * <p>
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 * ...
 * Example 1:
 * <p>
 * Input: 1
 * Output: "A"
 * Example 2:
 * <p>
 * Input: 28
 * Output: "AB"
 * Example 3:
 * <p>
 * Input: 701
 * Output: "ZY"
 */
/*
LeetCode Accepted:
Runtime: 0 ms, faster than 100.00% of Java online submissions for Excel Sheet Column Title.
Memory Usage: 35.1 MB, less than 100.00% of Java online submissions for Excel Sheet Column Title.
 */
public class E_168_Excel_Sheet_Column_Title {
    public String convertToTitle(int n) {


        long begin = (long)n;
        List<Character> list = new ArrayList<>();
        while (begin > 0) {
            begin = begin+(begin-1)/26;
            list.add((char) (begin % 27 + 64));
            begin = begin / 27;

        }
        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        E_168_Excel_Sheet_Column_Title e = new E_168_Excel_Sheet_Column_Title();
        System.out.println(e.convertToTitle(2147483647));
    }

}
