package secondHmoework;

import java.util.Scanner;
import java.util.Vector;

import static java.util.Arrays.sort;

/**
 * Created by zcsure at 2019/10/23
 */
//输入的第一个元素为数组coins的个数n，接下来的n个输入为coins的元素，最后一个输入为amount
//        输出为最少的硬币个数
//
//        示例 1 输入: 3
//        1 2 5
//        11
//        输出:3
//        解释: 11 = 5 + 5 + 1
//
//        示例 2 输入: 1
//        2
//        3
//        输出: -1
public class main_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int amount = in.nextInt();
        int[] dp = new int[amount+1];//凑钱需要多少个硬币
        dp[0] = 0;//0元钱需要0个硬币
        for (int i = 1; i <= amount; i++) {
            dp[i] = 999;
        }
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= nums[j]) {
                    dp[i] = Math.min(dp[i], dp[i - nums[j]] + 1);
                }
            }
        }
        if(dp[amount] != 999) {
            System.out.print(dp[amount]);
        }
        else{
            System.out.print(-1);
        }

    }
}
