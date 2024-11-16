package leetcode;

import java.util.Arrays;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
    int[] arr1 = {1, 2, 3, 0, 0, 0};
    int m = 3;
    int[] arr2 = {2, 5, 6};
    int n = 3;

    solution(arr1, m, arr2, n);
    System.out.println(Arrays.toString(arr1));
  }

  private static void solution(int[] arr1, int m, int[] arr2, int n) {
    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;

    while (j >= 0) {
      if (i >= 0 && arr1[i] > arr2[j]) {
        arr1[k--] = arr1[i--];
      } else {
        arr1[k--] = arr2[j--];
      }
    }
  }
}
