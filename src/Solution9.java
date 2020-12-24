//
class Solution9 {
    public boolean isPalindrome(int x) {
        /*
        //if we can try to convert the integer to string .
        String dup = Integer.toString(x);
        int i = 0,j = dup.length()-1 ;
        while (i<j) {
            if(dup.charAt(i) != dup.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;*/
        
      //if we were asked not to convert into string 
      Stack<Integer> pallindrome = new Stack<>();
        if (x < 0) {
            return false;
        }
        int temp = x;
        while(x!=0) {
            int y = x % 10;
            x = x / 10;
            pallindrome.push(y);
        }
        while (temp !=0) {
            int z = temp % 10 ;
            temp = temp / 10;
            int storage = pallindrome.pop();
            if (z != storage){
                return false;
            }
                
        }  
    return true;
    }
}