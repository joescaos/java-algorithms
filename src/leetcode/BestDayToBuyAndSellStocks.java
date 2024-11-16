package leetcode;

import java.util.HashMap;
import java.util.Map;

public class BestDayToBuyAndSellStocks {

  public static void main(String[] args) {

    int[] prices = {7,6,4,3,1};
    System.out.println(solution(prices));
  }

  public static int solution(int[] nums) {
    int dayToBuy = nums.length;
    int dayToSell = 0;
    Map<Integer, Integer> indexes = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      dayToBuy = Math.min(dayToBuy, nums[i]);
      indexes.put(nums[i], i);
    }
    if (indexes.containsKey(dayToBuy)) {
      int toStart = indexes.get(dayToBuy);
      for(int i = toStart; i < nums.length; i++) {
        dayToSell = Math.max(dayToSell, nums[i]);
      }
    } else {
      dayToSell = dayToBuy;
    }



    return dayToSell - dayToBuy;
  }
}
