package Leetcode.Solution;

import JavaCore.Third.Train.Array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    static class Item {
        public final int value;
        public final int listIdx;
        public final int numberIdx;

        public Item(int value, int listIdx, int numberIdx) {
            this.value = value;
            this.listIdx = listIdx;
            this.numberIdx = numberIdx;
        }
    }

    public static void main(String[] args) {

        String abc = String.format("%%%s%%", "abc");
        System.out.println(abc);
//
//        PriorityQueue<Item> ret = new PriorityQueue<>((s1, s2) -> Integer.compare(s1.value, s2.value));
//        var str = "ttttttttttttttbtttttctatawtatttttastvb";
//
//        Character m = '(';
//
//        double x = 9.97;
//        int nx = (int) x;
//
//        String test = underscorifySubstring(str, "ttt");
//        System.out.println(test);
//        Collectors.toList();
//        boolean s = true;
//        s = s && false;
//        s = !s;
//        String.join("", str);
//        str.indexOf('c');
//        String[] sss = new String[] {};
//        sss = new String[]{"s", "sd"};
//        var seen = new HashSet<Integer>();
//
        List<Integer> heap = new ArrayList<Integer>();
        heap.add(3);
        String s = "foo/bar/./baz";
        String[] split = s.split("/");
        System.out.println(split.length);
//
//        PriorityQueue<Integer> pq = new PriorityQueue<>(heap);
//        Integer remove = heap.remove(0);
//        List<int[]> minMaxStack = new ArrayList<int[]>();

//        var mapOfIndexAndChar = new HashMap<Character, Integer>();
//        mapOfIndexAndChar.put('c', 2);
//        mapOfIndexAndChar.clear();
//        mapOfIndexAndChar.put('d', 3);
//        System.out.println(mapOfIndexAndChar.containsKey('c'));
//        mapOfIndexAndChar.values().removeIf(i -> i > 2);
//        System.out.println(mapOfIndexAndChar.containsKey('d'));
//
//        var mm = new ArrayList<int[]>();
//        var mm1 = new int[] {0, 1};
//        mm.add(mm1);
//        int i = mm.get(0)[0];
//

//        String s1 = "ccta";
//        String s2 = "tac";
//
//        int position = s1.indexOf('c');
//
//        if(s1.charAt(1) == ' ')
//            System.out.println("yes!");
//
//
//        var newS = new String[] {s1, s2};
//        char[] chars1 = s1.toCharArray();
//        Arrays.sort(chars1);
//        String s3 = chars1.toString();
//        System.out.println(s3);
//        String s = new String(chars1);
//        String s4 = "123";
//        int i = Integer.parseInt(s4);
//        System.out.println(i);
//        System.out.println();
//        int i1 = Integer.parseInt("01");
//        System.out.println(i1);
//        String join = String.join("", newS);
//        System.out.println(join);
//        s1 = null;
//        var m = "";
//        var codePointsOf1 = s1.codePoints().sorted().toArray();
//        var codePointsOf2 = s2.codePoints().sorted().toArray();
//        boolean equals = Arrays.equals(codePointsOf1, codePointsOf2);
//        System.out.println(equals);
//        var anagramsMap = new HashMap<String, List<String>>();
//        char[] chars = s1.toCharArray();
//        String s = chars.toString();
//        ArrayList<String> strings = new ArrayList<>(Arrays.asList(s1));
//        List<String> strings1 = Arrays.asList(s1);
//        System.out.println(strings1);

//        int[] array = new int[] {12, 3, 1, 2, -6, 5, -8, 6};
//        String str = "ahelloz";
//
//        new String(array, 0, str.length());
//        int[] codePoints = str.codePoints().toArray();
//        for (int ele:
//             codePoints) {
//            System.out.println(ele);
//        }
//        str.indexOf('a');
//        int s = 2;
//        int[] ints = str.codePoints().map(i -> i + s).map(i -> {
//            if (i > 122) return i - 26;
//            return i;
//        }).toArray();
//        String strNew = new String(ints, 0, ints.length);
//        System.out.println(strNew);
//
//        var result = new StringBuilder();
//
//        var row2 = new ArrayList<Integer>();
//        row2.add(2);
//        row2.add(5);
//        row2.add(9);
//        row2.add(11);
//        // 0 - row2.size() - 1
//        row2.get(0);

//        int cp = str.codePointAt(6);
//        int cp2 = str.codePointAt(0);
//        System.out.println(cp2);
//        System.out.println(cp);
//        array = null;
//        System.out.println(threeNumberSum(array, 0));
//        var s = new ArrayList<Integer>();

//        display(4);
//        var seen = new HashMap<int[], Integer>();
//        int[] s = {1, 1};
//        System.out.println(new int[]{1, 1});
//        var nums = new HashSet<Integer>();
//        int[] array = new int[] {1};
//        int[] ret = largestRange(array);
//        System.out.println(ret[0] + " " + ret[1]);
//        var s = new ArrayList<List<Integer>>();
//        var row1 = new ArrayList<Integer>();
//        row1.add(1);
//        row1.add(3);
//        row1.add(4);
//        row1.add(10);
//        s.add(row1);
//        var row2 = new ArrayList<Integer>();
//        row2.add(2);
//        row2.add(5);
//        row2.add(9);
//        row2.add(11);
//        s.add(row2);
//        var row3 = new ArrayList<Integer>();
//        row3.add(6);
//        row3.add(8);
//        row3.add(12);
//        row3.add(15);
//        s.add(row3);
//        var row4 = new ArrayList<Integer>();
//        row4.add(7);
//        row4.add(13);
//        row4.add(14);
//        row4.add(16);
//        s.add(row4);
//        List<Integer> ret = zigzagTraverse(s);
//        for (Integer ele:
//             ret) {
//            System.out.println(ele);
//        }
    }

    public static String underscorifySubstring(String str, String substring) {
        var instances = new ArrayList<int[]>();

        int i = 0;
        while(i < str.length()) {
            var newStr = str.substring(i);
            if(newStr.indexOf(substring) == -1) break;
            int index = i + newStr.indexOf(substring);
            var newArray = new int[] {index, index + 3};
            instances.add(newArray);
            i = index + 1;
        }

        if(instances.size() == 0) return str;

        var newInstances = new ArrayList<int[]>();
        int j = 0;
        while(j < instances.size()) {
            var newArrayAfterMerge = new int[2];
            newArrayAfterMerge[0] = instances.get(j)[0];
            int k = j + 1;
            while(k < instances.size()
                    && instances.get(j)[1] + 1 >= instances.get(k)[0]
                    && instances.get(j)[0] + 1 <= instances.get(k)[0]) {
                j++;
                k++;
            }
            newArrayAfterMerge[1] = instances.get(j)[1];
            newInstances.add(newArrayAfterMerge);
            j++;
        }

        var result = new StringBuffer();
        int m = 0;
        int indexOfNewInstances = 0;
        while(indexOfNewInstances < newInstances.size()) {
            result.append(str.substring(m, newInstances.get(indexOfNewInstances)[0]));
            result.append("_");
            result.append(str.substring(newInstances.get(indexOfNewInstances)[0], newInstances.get(indexOfNewInstances)[1] + 1));
            result.append("_");
            m = newInstances.get(indexOfNewInstances)[1] + 1;
            indexOfNewInstances++;
        }
        result.append(str.substring(newInstances.get(newInstances.size() - 1)[1] + 1));
        return result.toString();
    }

    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
        var ret = new ArrayList<Integer>();
        if(array == null || array.isEmpty())
            return ret;
        int row = 0;
        int col = 1;
        int rows = array.size();
        int cols = array.get(0).size();
        ret.add(array.get(0).get(0));
        ret.add(array.get(1).get(0));
        int i = 1;
        while(row < rows - 1 || col < cols - 1) {
            ret.add(array.get(row).get(col));
            i++;
            if(row == 0 && col != cols - 1) {
                ret.add(array.get(row).get(++col));
                i++;
                while(row != rows - 1 && col != 0) {
                    ret.add(array.get(++row).get(--col));
                    i++;
                }
                ret.remove(i);
                continue;
            }
            if(row == rows - 1 && col != cols - 1) {
                ret.add(array.get(row).get(++col));
                i++;
                while(row != 0 && col != cols - 1) {
                    ret.add(array.get(--row).get(++col));
                    i++;
                }
                ret.remove(i);
                continue;
            }
            if(col == 0 && row != rows - 1) {
                ret.add(array.get(++row).get(col));
                i++;
                while(row != 0 && col != cols - 1) {
                    ret.add(array.get(--row).get(++col));
                    i++;
                }
                ret.remove(i);
                continue;
            }
            if(col == cols - 1 && row != rows - 1) {
                ret.add(array.get(++row).get(col));
                i++;
                while(row != rows - 1 && col != 0) {
                    ret.add(array.get(++row).get(--col));
                    i++;
                }
                ret.remove(i);
                continue;
            }
        }
        return ret;
    }

    public static int[] largestRange(int[] array) {
        int largestRange = 0;
        int[] largestRangeIdx = new int[2];
        var nums = new HashSet<Integer>();
        for(int ele : array)
            nums.add(ele);
        for(int i = 0; i < array.length; i++) {
            if(nums.contains(array[i])) {
                int[] rangeIdx = getIdxFrom(i, array, nums);
                if(rangeIdx[1] - rangeIdx[0] + 1 > largestRange) {
                    largestRangeIdx = rangeIdx;
                    largestRange = rangeIdx[1] - rangeIdx[0] + 1;
                }
            }
        }
        return largestRangeIdx;
    }

    public static int[] getIdxFrom(int idx, int[] array, HashSet<Integer> nums) {
        int maxValue = array[idx] + 1;
        int minValue = array[idx] - 1;
        while(nums.contains(maxValue)) {
            nums.remove(maxValue);
            maxValue++;
        }
        while(nums.contains(minValue)) {
            nums.remove(minValue);
            minValue--;
        }
        return new int[] {minValue+1, maxValue-1};
    }

    public static void display(int i) {
        System.out.println(i);
        display(--i);
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        var ret = new ArrayList<Integer[]>();
        if(array == null || array.length < 3) {
            return ret;
        }
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while(left < right) {
                if(array[i] + array[left] + array[right] > targetSum) {
                    right--;
                }
                else if(array[i] + array[left] + array[right] < targetSum) {
                    left++;
                }
                else {
                    var s = new Integer[] {array[i], array[left], array[right]};
                    ret.add(s);
                }
            }
        }
        return ret;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int curLen = 0;
        int maxLen = 0;
        int countZero = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == 1) {
                curLen++;
            }
            else if(nums[j] == 0 && countZero == 0) {
                curLen++;
                countZero++;
            }
            else {
                countZero = 0;
                if(curLen > maxLen) {
                    maxLen = curLen;
                }
                curLen = 0;
            }
        }
        if(curLen > maxLen) {
            maxLen = curLen;
        }
        return maxLen;
    }
}
