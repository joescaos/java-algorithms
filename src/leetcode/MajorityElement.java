package leetcode;

public class MajorityElement {

  public static void main(String[] args) {
    int[] arr = {1,1,2,2,2,3,3,3,3};
    System.out.println(solution(arr));
  }

  public static int solution(int[] arr) {
    int el = arr[0];
    int count = 1;
    for (int i = 0; i < arr.length; i++) {
      if (count == 0) {
        el = arr[i];
        count = 1;
      }
      if (arr[i] == el) {
        count++;
      } else {
        count--;
      }
    }
    return el;
  }
}
