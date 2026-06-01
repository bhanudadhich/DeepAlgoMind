import java.io.*;
import java.util.*;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;

        for (int num : arr) {
            long currentSum = totalSum - num;

            minSum = Math.min(minSum, currentSum);
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(minSum + " " + maxSum);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (String s : arrTemp) {
            arr.add(Integer.parseInt(s));
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}