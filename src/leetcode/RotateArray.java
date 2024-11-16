package leetcode;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;
    solution2(nums, k);
    System.out.println(Arrays.toString(nums));
  }

  public static void solution(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    int l = 0;
    int r = n - 1;
    while (l < r) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
    l = 0;
    r = k - 1;
    while (l < r) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
    l = k;
    r = n - 1;
    while (l < r) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
      l++;
      r--;
    }
  }

  public static void solution2(int[] nums, int k) {
    k = k % nums.length;
    int l;
    int r;
    for (l = 0, r = nums.length - 1; l < r; l++, r--) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
    }
    for (l = 0, r = k - 1; l < r; l++, r--) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
    }
    for (l = k, r = nums.length - 1; l < r; l++, r--) {
      int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
    }

  }
}


