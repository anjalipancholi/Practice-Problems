package array;

public class OneBitAndTwoBitCharachters {
    public boolean isOneBitCharacter(int[] bits) {
        int count = 0;
        for (int i = 0; i <bits.length; i++) {
            if( bits[i] == 1) {
                count++;
            }
            if (count % 2 == 0) {
                return true;
            }
            if(bits.length > (count*2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        new OneBitAndTwoBitCharachters().isOneBitCharacter(new int[]{1,0,0});
}
}
