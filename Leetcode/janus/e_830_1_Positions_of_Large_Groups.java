import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.
Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]


Note:  1 <= S.length <= 1000
 */

/*
Leetcode Accepted
Result:
Runtime: 6 ms, faster than 100.00% of Java online submissions for Positions of Large Groups.
Memory Usage: 38.5 MB, less than 93.07% of Java online submissions for Positions of Large Groups.


 */
public class e_830_1_Positions_of_Large_Groups {
    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> listList = new ArrayList<>();
        int begin = 0;
        int thisCharBegin = 0;
        int count = 1;
        char thisChar = S.charAt(0);
        while (begin < S.length() ) {

            if (begin==S.length()-1){
                if (count>=3){
                    List<Integer> list = new ArrayList<>();
                    list.add(thisCharBegin);
                    list.add(begin);
                    listList.add(list);
                }
                break;

            }
            if (thisChar == S.charAt(begin + 1)) {
                count++;

            } else {
                if (count >= 3) {
                    List<Integer> list = new ArrayList<>();
                    list.add(thisCharBegin);
                    list.add(begin);
                    listList.add(list);

                }
                count = 1;
                thisChar = S.charAt(begin + 1);
                thisCharBegin=begin+1;
            }
            begin += 1;
        }
        return listList;

    }

    public static void main(String[] args) {
        String sss="aaa";
        List<List<Integer>> listList=largeGroupPositions(sss);
        for (List<Integer> integers : listList) {
            System.out.println(Arrays.toString(integers.toArray()));
        }
    }
}
