package leetcode;

import java.util.Arrays;

public class RemoveDuplicatedElementsFromArrayII {

  public static void main(String[] args) {
    int[] nums = {1, 1, 1, 2, 2, 3};

    System.out.println(solution(nums));
    System.out.println(Arrays.toString(nums));
  }

  private static int solution(int[] nums) {
    int k = 2;
    for (int i = 2; i < nums.length; i++) {
      if(nums[i] != nums[k-2]) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
}
