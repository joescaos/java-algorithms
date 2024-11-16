public class maxSubArrayOfSizeK {

  public static void main(String[] args) {

    int[] arr = {-4, 5, 7, 4, 2, 3, 1};

    System.out.println(maxSubArrayOfSizeK(arr, 2));
  }

  private static int maxSubArrayOfSizeK(int[] arr, int k) {
     int start = 0;
     int sum = 0;
     int maxSum = 0;
     for(int end = 0; end < arr.length; end++) {
       sum += arr[end];

       if (end >= k - 1) {
         maxSum = Math.max(sum, maxSum);
         sum -= arr[start];
         start++;
       }

     }

     return maxSum;
  }
}
