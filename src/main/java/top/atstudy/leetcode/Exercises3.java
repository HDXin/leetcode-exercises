package top.atstudy.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2019/3/18 16:16
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */
public class Exercises3 {

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(" ===>> " + lengthOfLongestSubstring(str));
    }


    public static int lengthOfLongestSubstring(String s) {

        Map<Byte, Integer> indexMap = new HashMap<Byte, Integer>();
        Integer index = 0;
        Integer max = 0;
        byte[] arr = s.getBytes();
        for(int i=0; i<arr.length; i++){
            byte temp = arr[i];
            if(indexMap.containsKey(temp)){
                max = i - index > max ? i - index:max;
                if(indexMap.get(temp) >= index){
                    index = indexMap.get(temp) + 1;
                }
            }
            indexMap.put(temp, i);

            max = i - index + 1 > max ? i - index + 1:max;
        }

        return max;
    }




}
