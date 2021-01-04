//O(n)
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
      
        String dup = s; 
        char store = ' ';
       
            for (int i = 0;i < s.length();i++) {
                char brackets = s.charAt(i);
            
                if (brackets == ')') {
                    if (!characters.empty()) {
                        store = characters.pop();
                        if (store != '(') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                else if (brackets == ']') {
                    if (!characters.empty()) {
                        store = characters.pop();
                        if (store != '[') {
                             return false;
                        } 
                    } else {
                        return false;
                    }
                }
                else if(brackets == '}') {
                    if(!characters.empty()) {
                        store = characters.pop();
                        if (store != '{') {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
                else {
                    characters.push(brackets);
                }
            
            }
        
        if(!characters.empty()) {
            return false; 
        } 
        
     return true;
       
    }
    
}