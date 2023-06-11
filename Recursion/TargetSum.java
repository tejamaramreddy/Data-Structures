package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        expression(nums, 3, new ArrayList<>());
    }

    public static void expression(int[] nums, int target, List<Integer> result){
        if((result.stream().reduce(0, (x,y) -> x+y) == target) && result.size() == 5){
            System.out.println(result);
            return;
        }
        if(nums.length > 0){
            int tmp = nums[0];
            result.add(tmp);
            expression(Arrays.copyOfRange(nums,1, nums.length), target, result);
            result.remove(result.size() - 1);
            result.add(tmp * -1);
            expression(Arrays.copyOfRange(nums,1, nums.length), target, result);
            result.remove(result.size()-1);
        }


    }
}
