import java.util.ArrayList;


/*
Given an array of integers A, a move consists of choosing any A[i], and incrementing it by 1.

Return the least number of moves to make every value in A unique.



Example 1:

Input: [1,2,2]
Output: 1
Explanation:  After 1 move, the array could be [1, 2, 3].
Example 2:

Input: [3,2,1,2,1,7]
Output: 6
Explanation:  After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
It can be shown with 5 or less moves that it is impossible for the array to have all unique values.
 */
/*
LeetCode : Time Out:
Submission Detail
56 / 59 test cases passed.
Status: Time Limit Exceeded
Submitted: 11 minutes ago

 */
public class M_945_1_Minimum_Increment_to_Make_Array_Unique {
    public  int minIncrementForUnique(int[] A) {
        A=ShellSort(A);
        ArrayList<Integer> integerList = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int begin = 0;
        while (begin < A.length) {
            if (integerList.contains(A[begin])) {
                integerList.add(integerList.get(integerList.size()-1) + 1);
            } else {
                integerList.add(A[begin]);
            }
            count1 += integerList.get(integerList.size()-1);
            count2 += A[begin];
            begin++;
        }
        return count1 - count2;


    }
    public  int[] ShellSort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a={7889,25359,23384,19645,10733,22900,4188,234,18946,8719,4741,4741,4741,5053,14164,1240,14279};
        M_945_1_Minimum_Increment_to_Make_Array_Unique m_945_1_minimum_increment_to_make_array_unique=new M_945_1_Minimum_Increment_to_Make_Array_Unique();

        System.out.println(m_945_1_minimum_increment_to_make_array_unique.minIncrementForUnique(a));
    }

}
