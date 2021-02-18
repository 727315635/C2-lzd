import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println("输入:nums = [-1,0,1,2,-1,-4],target = 0");
        System.out.println("输出:"+count(nums,0));
    }
    public static List<List<Integer>> count(int[] nums, int target) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> resultarr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],i);
        }
        Integer t;
        for(int i = 0; i < nums.length; ++i)
        {
            target = -nums[i];
            for(int j = i + 1; j < nums.length; ++j)
            {
                if((t = map.get(target - nums[j])) != null)
                {
                    if(t > j)
                    {
                        resultarr.add(new ArrayList<>
                                (Arrays.asList(nums[i], nums[j], nums[t])));
                    }
                }
            }
        }
        return resultarr;
    }
}