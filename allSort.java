package com.init.demo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zcsure at 2019/10/17
 */
public class allSort {
    private void back(int[] nums,int len, int curSize,boolean[] used, ArrayList<ArrayList<Integer>> res, Stack<Integer> stack){
        if(curSize == len){
            res.add(new ArrayList<>(stack));
        }
        for(int i = 0;i < len;i++){
            if(!used[i]){
                stack.push(nums[i]);
                used[i] = true;
                back(nums,len,curSize+1,used,res,stack);
                stack.pop();
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner in =  new Scanner(System.in);
        n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = i + 1;
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] used = new boolean[n];
        allSort all = new allSort();
        all.back(nums,n,0,used,res,stack);
        for(int i = 0;i < res.size();i++){
            System.out.println(res.get(i));
        }
    }
}
