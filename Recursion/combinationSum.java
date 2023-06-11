package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        combinatin( arr,7, new ArrayList<Integer>());
    }

    public static void combinatin(int[] arr, int target, List<Integer> result){
        if(target == 0){
            System.out.println(result);
            return;
        }

        for (int i = 0; i < arr.length && arr[i] <= target; i++) {
            result.add(arr[i]);
            combinatin(arr,target - arr[i] , result);
            result.remove(result.size() -1);
        }
    }
}
