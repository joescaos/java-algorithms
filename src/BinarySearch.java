public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};

    System.out.println(binarySearch(arr, 5));
  }

  private static int binarySearch(int[] arr, int target) {
    int first = 0;
    int last = arr.length - 1;

    while (first <= last) {
      int midPoint = (first + last) / 2;

      if (arr[midPoint] == target) {
        return midPoint;
      } else if (target < arr[midPoint]) {
        last = midPoint - 1;
      } else {
        first = midPoint + 1;
      }
    }
    return -1;
  }
}
