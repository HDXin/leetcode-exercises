package top.atstudy.leetcode;

public class Exercises4 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 3, 5, 7, 9};
        int[] nums2 = new int[]{2, 4, 6};
        System.out.println(" ===>> " + findMedianSortedArrays(nums1, nums2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length = nums1.length + nums2.length;

        Integer index1 = null;
        Integer index2 = null;
        if (length % 2 == 0) {
            // 偶数个
            index1 = length / 2 - 1;
            index2 = index1 + 1;
        } else {
            // 奇数个
            index1 = (length + 1) / 2 - 1;
        }
        System.out.println("x: " + index1 + ", y:" + index2);;

        Integer x = null;
        Integer y = null;
        int mark_index = 0;
        int mark_index2 = 0;
        for (int i = 0; i < length; i++) {
            Integer temp = null;
            if (mark_index < nums1.length) {
                temp = nums1[mark_index];
            }

            Integer temp2 = null;
            if (mark_index2 < nums2.length) {
                temp2 = nums2[mark_index2];
            }

            Integer tempMin = null;
            if(temp == null){
                tempMin = temp2;
                mark_index2++;
            }else if(temp2 == null){
                tempMin = temp;
                mark_index++;
            }else if (temp >= temp2) {
                tempMin = Math.min(temp, temp2);
                mark_index2++;
            } else if (temp < temp2) {
                tempMin = Math.min(temp, temp2);
                mark_index++;
            }

            if (index1 != null && i == index1) {
                x = tempMin;
            }
            if (index2 != null && i == index2) {
                y = tempMin;
            }
        }

        System.out.println("m: " + x + ", n: " + y);
        if(y == null){
            return x;
        }else{
            return (new Double(x) + new Double(y)) / 2;
        }
    }


}
