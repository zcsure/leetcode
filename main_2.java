package secondHmoework;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zcsure at 2019/10/23
 */
//第一个输入为数组个数n，接下来的n个元素为asteroids的元素。输出为碰撞之后的数组元素 示例 输入：
//        4
//        9 -8 -7 3
//        输出：
//        9 3
//        说明：asteroids = [9, -8, -7, 3]，根据碰撞规则，行星9会与-8和-7这两颗行星碰撞，-8和-7在碰撞之后爆炸，9会留存下来。而后9和3不发生碰撞，所以输出9和3。
public class main_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] nums = new int[n];
        //boolean[] dis = new boolean[n];
        for(int i = 0;i < n;i++) {
            nums[i] = input.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < n;i++){
            if(stack.empty()){
                stack.push(nums[i]);
            }
            else if(stack.peek() > 0 && nums[i] < 0){
                while(!stack.empty() && stack.peek() > 0 && nums[i] < 0){
                    int sum = stack.peek() + nums[i];
                    if(sum > 0){
                        nums[i] = Integer.MAX_VALUE;
                    }
                    else if(sum == 0){
                        stack.pop();
                        nums[i] = Integer.MAX_VALUE;
                    }
                    else{
                        stack.pop();
                    }
                }
                if(nums[i] != Integer.MAX_VALUE){
                    stack.push(nums[i]);
                }
            }
            else{
                stack.push(nums[i]);
            }

        }
        int size = stack.size();
        int[] res = new int[size];
        for(int i = size - 1;i >= 0;i--){
            res[i] = stack.pop();
        }
        for(int i = 0;i < size;i++) {
            System.out.print(res[i] + " ");
        }
        //System.out.print(dis[j] ? nums[j] : nums[j]);
    }
}
