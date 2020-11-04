package string;

public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                count++;
            }
            if (count > 2 || count == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new BuddyStrings().buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }
}
