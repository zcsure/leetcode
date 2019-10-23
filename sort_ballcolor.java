package secondHmoework;

import java.util.Scanner;

/**
 * Created by zcsure at 2019/10/23
 * 三种球，红黄蓝用012来代替，对其进行排序，同样颜色的球放在一起
 * 设置三个指针，p0指向0的最右边界，p2指向2的最左边界，用curr指针遍历数组。
 */
public class sort_ballcolor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = in.nextInt();
        }
        int p0 = 0,p2 = n-1;
        int curr = 0,tmp;
        while(curr <= p2){
            if(nums[curr] == 2){
                tmp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2] = tmp;
                p2 = p2 - 1;
            }
            else if(nums[curr] == 0){
                tmp = nums[curr];
                nums[curr] = nums[p0];
                nums[p0] = tmp;
                p0++;
                curr++;
            }
            else{
                curr++;
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(nums[i]);
        }


    }
}
