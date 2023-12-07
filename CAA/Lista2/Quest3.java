import java.util.HashMap;
import java.util.Map;

//Solução O(n)

public class Quest3 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        
        return new int[]{-1, -1}; // Caso não encontre uma solução
    }

    public static void main(String[] args) {
        Quest3 solucao = new Quest3();
        
        // Exemplo 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solucao.twoSum(nums1, target1);
        System.out.println("Saída 1: [" + result1[0] + ", " + result1[1] + "]");

        // Exemplo 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solucao.twoSum(nums2, target2);
        System.out.println("Saída 2: [" + result2[0] + ", " + result2[1] + "]");
    }
}

//Solução O(n^2)

/*
public class Quest2 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Se não encontrar solução
    }
        
    public static void main(String[] args) {
        Quest2 solucao = new Quest2();
        
        // Exemplo 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solucao.twoSum(nums1, target1);
        System.out.println("Saída 1: [" + result1[0] + ", " + result1[1] + "]");

        // Exemplo 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solucao.twoSum(nums2, target2);
        System.out.println("Saída 2: [" + result2[0] + ", " + result2[1] + "]");
    }
}
*/