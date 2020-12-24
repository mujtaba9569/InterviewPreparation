class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        int min = 201;
        for (int i = 0;i < strs.length;i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            } 
        }
        //System.out.println(min);
        String result = "";
        char storage1 = ' ';
        char storage2 = ' ';
        int index1 = 0;
        if (strs.length!=0) {
            while (index1 < min) {
                storage1 = strs[0].charAt(index1);
                for (int k = 1; k < strs.length; k++) {
                    storage2 = strs[k].charAt(index1);
                    if (storage1 != storage2) {
                        return result;
                    }    
                }
                result = result + storage1;
                index1++;
            }
        } else {
            return result;
        }
        return result;
    }
}