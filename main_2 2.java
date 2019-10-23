package secondHmoework;

import java.util.Scanner;

/**
 * Created by zcsure at 2019/10/23
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。 设计一个算法来计算你所能获取的最大利润。
 * 你可以尽可能地完成更多的交易（多次买卖一支股票）。 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * 要求时间复杂度为O(n)，空间复杂度为O(1)。
 *
 * 输入输出说明及示例：
 * 第一个输入为数组个数n，接下来的n个输入为数组元素
 * 输出为最大利润
 * 示例 : 输入:
 * 5
 * 6 4 7 5 2 9 9 7 5 4 3
 * 输出: 3+7+
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 * 注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 */
public class main_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
// 贪心算法
        int amount = 0;
        for(int i = 1;i < n;i++){
            if(nums[i] > nums[i-1]){
                amount += nums[i] - nums[i-1];
            }
        }
        System.out.print(amount);
    }
}