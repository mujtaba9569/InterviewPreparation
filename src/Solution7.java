//O(n)
class Solution7 {
    public int reverse(int x) {
        boolean negative = false;
        String reverse = "";
        if (x < 0) {
            x = x * (-1);
            negative = true;
        }
        while(x != 0) {
            int y = x % 10;
            x = x / 10;
            reverse = reverse + Integer.toString(y);
            //reverse = reverse + y;
        }
        try {
            int result = Integer.parseInt(reverse);
            if (negative) {
                result = result *(-1);
            }
            return result;
        } catch (Exception e) {
            return 0;
        }
    }
}
