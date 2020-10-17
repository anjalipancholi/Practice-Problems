package String;

public class BulbSwitcher4 {
    public int minFlips(String target) {
        char state = '0';
        int count = 0;
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != state) {
                if (state == '0') {
                    state = '1';
                } else {
                    state = '0';
                }
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        new BulbSwitcher4().minFlips("10111");
    }
}
