//
class Solution58 {
    public int lengthOfLastWord(String s) {
        if (s.length() <= 0) {
            return 0;
        }
        int i = s.length()-1,len = 0;
        char space = ' ';
        while (i >= 0) {
            if(s.charAt(i) != space) {
                len++;
                i--;
            } else {
                if (len > 0) {
                    return len;
                }
                i--;
            } 
        }
        return len;
    }
}

