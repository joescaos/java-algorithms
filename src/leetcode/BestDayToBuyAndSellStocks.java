package leetcode;

import java.util.HashMap;
import java.util.Map;

public class BestDayToBuyAndSellStocks {

  public static void main(String[] args) {

    int[] prices = {1,2,4,2,5,7,2,4,9,0,9};
    System.out.println(solution(prices));
  }

  public static int solution(int[] nums) {
     int left = 0;
     int right = 1;
     int max = 0;
     while(right < nums.length) {
       int current = 0;
       if(nums[left] < nums[right]) {
         current = nums[right] - nums[left];
         max = Math.max(max, current);
       } else {
         left = right;
       }
       right++;
     }
     return max;
  }
}
