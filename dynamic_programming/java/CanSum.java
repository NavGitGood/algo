import java.util.HashMap;
import java.util.Map;

public class CanSum {

    public boolean isSumPossible(Integer targetSum, Integer[] numbers, Map<Integer, Boolean> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if(targetSum == 0) return true;
        if (targetSum < 0) return false;
        for (Integer number : numbers) {
            if(isSumPossible(targetSum - number, numbers, memo) == true) {
              memo.put(targetSum, true);
              return memo.get(targetSum);
            }
        }
        memo.put(targetSum, false);
        return memo.get(targetSum);
    }

    public static void main(String args[]) {
        CanSum cs = new CanSum();
        Map<Integer, Boolean> memo = new HashMap<Integer, Boolean>(){};
        System.out.println(cs.isSumPossible(300, new Integer[]{7, 14}, memo));
    }

}
