class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> res = new HashSet<>();

        while (n != 1) {

            if (res.contains(n))
                return false;

            res.add(n);

            int sum = 0;

            while (n > 0) {
                int nums = n % 10;
                sum += nums * nums;
                n = n / 10;
            }

            n = sum;
        }

        return true;
    }
}