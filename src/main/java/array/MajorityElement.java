package array;

public class MajorityElement {
    public int majorityElement(int[] nums) {
    int majority_element = nums.length / 2;

    for (int i=0; i<nums.length ; i++) {

        int element = 0;
        for (int j = 0; j< nums.length; j++){
            if (i == j) {
                element += 1;
            }
        }
        if  (element > majority_element) {

            return i;
        }


        }


    return -1;
}

    public static void main(String[] args) {
        new MajorityElement().majorityElement(new int[]{3,3,2,2,3,3});
        System.out.println();
    }
}

