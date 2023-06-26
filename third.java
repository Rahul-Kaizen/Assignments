import java.util.*;
public class third {
    public static int findLHS(int[] nums) {
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        int prevN = 0;
        int curr = nums[0];
        int currN = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != curr) {
                if (prev+1 == curr)
                    max = Math.max(prevN + currN, max);
                prev = curr;
                prevN = currN;
                curr = nums[i];
                currN = 1;
            } else {
                currN++;
            }
        }
        if (prev+1 == curr)
            max = Math.max(prevN + currN, max);
        return max;
    }
    public static void main(String[] args) {
         int nums []= {1,3,2,2,5,2,3,7};
         System.out.println(findLHS(nums));
    }
}
