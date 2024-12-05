package com.zcl.leetcode.huawei.slidewindow;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * 去除字符串中非字母的符号。
 * 如果出现连续字符(不区分大小写) ，则输出：该字符 (小写) + 连续出现的次数。
 * 如果是非连续的字符(不区分大小写)，则输出：该字符(小写) + 该字母之后字符串中出现的该字符的次数
 * 对按照以上方式表示后的字符串进行排序：字母和紧随的数字作为一组进行排序，数字大的在前，数字相同的，则按字母进行排序，字母小的在前。
 *
 * @Author AlphaZcl
 * @Date 2024/12/5
 **/
public class StringSummary {

    public String getStrSummary(String source) {
        if (StringUtils.isEmpty(source)) {
            return StringUtils.EMPTY;
        }
        // 去除特殊字符
        source = source.replaceAll("[^a-zA-Z]", "");
        // 不定滑窗
        int length = source.length();
        int right = length -1; // 滑窗右边界
        // 结果存储
        List<Map.Entry<Character, Integer>> result = new ArrayList<>(); // 整个字符串结构
        Map<Character, Integer> tempMap = new HashMap<>(); // 存储已记录的字母及其出现次数
        // 从右往左变动滑动窗口
        for (int left = length-1; left >= 0; left--) {
            char leftChar = Character.toLowerCase(source.charAt(left));
            char rightChar = Character.toLowerCase(source.charAt(right));
            if (leftChar != rightChar) {
                saveResult(result, tempMap, left, right, rightChar);
                right = left; // 保存完小窗口结果后移动边界继续判定逻辑
            }
        }
        // 当窗口右边界到达第一个元素时，保存第一个字母的相关统计数据
        saveResult(result, tempMap, -1, right, Character.toLowerCase(source.charAt(right)));
        // 排序最终结果
        StringBuilder builder = new StringBuilder();
        result.stream().sorted((val1,val2) -> {
            if (val1.getValue().equals(val2.getValue()) ) {
                return val1.getKey() - val2.getKey();
            } else {
                return val2.getValue() - val1.getValue();
            }
        }).forEach(item -> {
            builder.append(item.getKey()).append(item.getValue());
        });
        return builder.toString();
    }

    private void saveResult(List<Map.Entry<Character, Integer>> result, Map<Character, Integer> tempMap, int left, int right, char rightChar) {
        int step = right - left;
        if (step == 1) {
            // 不连续时，其结果为前面出现过的次数
            result.add(new AbstractMap.SimpleEntry(rightChar, tempMap.getOrDefault(rightChar, 0)));
        } else {
            // 连续时，结果为连续次数
            result.add(new AbstractMap.SimpleEntry<>(rightChar, step));
        }
        // 将当前字母出现过的次数累加起来，为更左边出现的字母结果提供统计结果
        tempMap.put(rightChar, tempMap.getOrDefault(rightChar, 0) + step);
    }
}
