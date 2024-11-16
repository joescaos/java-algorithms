package leetcode;

public class RemoveElement {

  public static void main(String[] args) {
    int[] nums = {3, 2, 2, 3};
    int val = 3;

    int res = solution(nums, val);
    System.out.println(res);

    int res2 = solution2(nums, val);
    System.out.println(res2);
  }

  private static int solution2(int[] nums, int val) {
    int idx = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] != val) {
        idx++;
      }
    }
    return idx;
  }

  private static int solution(int[] nums, int val) {
    int start = 0;
    int end = nums.length - 1;
    int res = 0;
    while (start <= end) {
      if (nums[start] == val) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        end--;
      } else {
        start++;
      }
    }
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        res += 1;
      }
    }

    return res;
  }


}
