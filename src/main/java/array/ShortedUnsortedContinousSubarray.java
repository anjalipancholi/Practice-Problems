package array;

public class ShortedUnsortedContinousSubarray {
    public int findUnsortedSubarray(int[] nums) {

        int count = 0;
        int counts = 0;
        for ( int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1] +1) {
                count++;
            }           else {
            break;
            }
            }
        for (int j = nums.length; j <0; j--) {
            if(nums[j] == nums[j-1] +1 ) {
                counts++;
            }else {
                break;
            }
        }
        int answer = nums.length - (count + counts) -2;

        return answer;

    }
    public static void main(String[] args) {
        new ShortedUnsortedContinousSubarray().findUnsortedSubarray(new int[]{1,2,6,4,3,2,11});
    }
}
