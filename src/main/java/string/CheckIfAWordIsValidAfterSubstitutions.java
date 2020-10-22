package string;

/**
 * 1003. Check If Word Is Valid After Substitutions
 */
public class CheckIfAWordIsValidAfterSubstitutions {
    public boolean isValid(String s) {
        if (s.length() < 3) {
            return false;
        }
        if (s.length() % 3 != 0) {
            return false;
        }
        return isMatch(s);
    }

    private boolean isMatch(String s) {
        int i =0;
        char[] arr = s.toCharArray();
        for(char c : arr){
            if(i < 2 && c == 'c') return false;
            else if(c == 'c'){
                if(arr[i-2] == 'a' && arr[i-1] == 'b'){
                    i = i-2;
                }else{
                    return false;
                }
            }else{
                arr[i] = c;
                i++;
            }
        }
        return i == 0;
    }

        public static void main (String[]args){
            System.out.println(new CheckIfAWordIsValidAfterSubstitutions().isValid("ababcc"));
        }
    }
