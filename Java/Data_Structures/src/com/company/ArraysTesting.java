package com.company;

import java.util.*;

public class ArraysTesting {

    public static int[] sortedSquares(int[] nums) {
        int n = 0;
        int j = nums.length - 1;

        int[] result = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[n]) > Math.abs(nums[j])){
                result[i] = nums[n] * nums[n];
                n++;
            }
            else{
                result[i] = nums[j]*nums[j];
                j--;
            }
        }

        return result;
    }

    public static void duplicateZeros(int[] arr) {

        int[] sArray = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[j] == 0) {
                sArray[i] = 0;
                i++;
                if (i < arr.length) {
                    sArray[i] = 0;
                    j++;
                }
            }
            else {
                sArray[i] = arr[j];
                j++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sArray[i];
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = m-1; //nums1
        int k = n-1; //nums2
        int i = m+n-1; //full

        while (j >= 0 && k >= 0){
            if (nums1[j] > nums2[k])
                nums1[i--] = nums1[j--];
            else
                nums1[i--] = nums2[k--];
        }
        while (k >= 0)
            nums1[i--] = nums2[k--];
    }

    public static int removeElement(int[] nums, int val) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[m++] = nums[i];
        }
        return m;
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for (int n : nums) {
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        }
        return i;
    }

    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int n :  arr) {
            if (hashSet.contains(n*2) || (hashSet.contains(n/2) && n%2 == 0))
                return true;
            else
                hashSet.add(n);
        }
        return false;
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start + 1] > arr[start])
                start++;
            else if (arr[end - 1] > arr[end])
                end--;
            else
                break;
        }
        return start != 0 && end != arr.length - 1 && start == end;
    }

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int mx = -1, n = arr.length - 1, a = 0;

        for (int i = n; i >= 0; i--) {
            a = arr[i];
            arr[i] = mx;
            mx = Math.max(mx, a);
        }
    return arr;
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int cur = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public static int heightChecker(int[] heights) {

        int result = 0;
        int n = 0;


        int[] heightFreq = new int[101];

        for (int height: heights) {
            heightFreq[height]++;
        }

        for (int height: heights){
            while(heightFreq[n] == 0)
                n++;

            if (height != n)
                result++;

            heightFreq[n]--;
        }

        return result;

    }

    public static int thirdMax(int[] nums) {
        Integer first = null;
        Integer second = null;
        Integer third = null;

        for(Integer n : nums){
            if (n.equals(first) || n.equals(second) || n.equals(third))
                continue;

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            }
            else if (second == null || n > second) {
                third = second;
                second = n;
            }
            else if (third ==  null || n > third)
                third = n;
        }
        if (second == null || third == null)
            return first.intValue();

        return third.intValue();

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int n = nums.length;

        // the numbers go from 1 to the length of array.
        // this takes the value - 1, goes to that index and
        // adds the array length to it.
        // if any of the numbers dont add to an index, that
        // value wont increase by the array length
        for (int i = 0; i < nums.length; i ++)
            nums[(nums[i]-1) % n] += n;

        // if any values havent increased by the array length,
        // then that index - 1 is doesnt exist in the original array.
        for (int i = 0; i < nums.length; i ++)
            if (nums[i] <= n)
                res.add(i+1);

        return res;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> resultArray = new ArrayList<>();

        for(int n : nums1) {
            Integer count = map.containsKey(n) ? map.get(n) : 0;
            map.put(n, ++count);
        }

        for(int n : nums2)
            if(map.containsKey(n) && map.get(n) > 0){
                Integer count = set.get(n);
                resultArray.add(n);
                map.put(n, --count)
            }

        int[] result = new int[resultArray.size()];

        for(int i = 0; i < resultArray.size(); i++){
            result[i] = resultArray.get(i).intValue();
        }
        map.
        return result;
    }

}