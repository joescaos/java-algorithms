public class MaxSubArray {

  public static void main(String[] args) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    System.out.println(maxSubArray(arr));
    System.out.println(maxSubArray2(arr));
  }

  private static int maxSubArray(int[] arr) {
    int maxSub = arr[0];
    int maxSum = 0;
    for (int j : arr) {
      if (maxSum < 0) {
        maxSum = 0;
      }
      maxSum += j;
      maxSub = Math.max(maxSub, maxSum);
    }

    return maxSub;
  }

  private static int maxSubArray2(int[] arr) {
    int maxSub = arr[0];
    int maxSum = 0;

    for (int i = 0; i < arr.length; i++) {

      if (maxSum < 0) {
        maxSum = 0;
      }
      maxSum += arr[i];
      maxSub = Math.max(maxSub, maxSum);
    }
    return maxSub;
  }
}
