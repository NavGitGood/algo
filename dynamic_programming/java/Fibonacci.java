import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public Long getFibonacciValue(Integer n, Map<Integer, Long> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n == 1) return new Long(0);
        if (n == 2 || n == 3) return new Long(1);
        memo.put(n, getFibonacciValue(n-1, memo) + getFibonacciValue(n-2, memo));
        return memo.get(n);
    }

    public static void main(String args[]) {
        Fibonacci fib = new Fibonacci();
        Map<Integer, Long> memo = new HashMap<Integer, Long>(){};
        System.out.println(fib.getFibonacciValue(50, memo));
    }

}