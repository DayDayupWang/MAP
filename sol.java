public class sol {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = { 1 };
        double k = findMedianSortedArrays(nums1, nums2);
        System.out.println(k);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer = 0;
        if (nums1.length != 0 & nums2.length != 0) {
            answer = (midN(nums1) + midN(nums2)) / 2;
        } else if (nums1.length == 0) {
            answer = midN(nums2);
        } else if (nums2.length == 0) {
            answer = midN(nums1);
        }
        System.out.println("s1  " + midN(nums1));
        System.out.println("s2  " + midN(nums2));
        return answer;
    }

    public static double midN(int[] nums) {
        double midNumber = 0;
        // if(nums==null){

        // }
        // if(nums.length==1){
        // return midNumber=nums[0];

        // }
        int k = nums.length / 2;
        if ((nums.length % 2) == 0 & nums.length > 0) {
            midNumber = ((double) nums[k] + (double) nums[k - 1]) / 2;
        } else {
            midNumber = nums[k];
        }
        return midNumber;
    }

}
