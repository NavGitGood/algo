import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

    public Long getTotalWays(Integer m, Integer n, Map<String, Long> memo) {
        String key = m + "-" + n;
        if(memo.containsKey(key)) return memo.get(key);
        if(m < 1 || n < 1) return new Long(0);
        if (m == 1 || n == 1) return new Long(1);
        memo.put(key, getTotalWays(m-1, n, memo) + getTotalWays(m,n-1, memo));
        return memo.get(key);
    }

    public static void main(String args[]) {
        GridTraveller gt = new GridTraveller();
        Map<String, Long> memo = new HashMap<String, Long>(){};
        System.out.println(gt.getTotalWays(25,25, memo));
    }
}
