package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RandomTesting {


//Brute force
//    int[] indices = {0,0};
//    for (int i = 0; i < nums.length; i++) {
//        for (int j = i+1; j < nums.length; j++) {
//            if (nums[i] + nums[j] == target) {
//                indices[0] = i;
//                indices[1] = j;
//                return indices;
//            }
//
//        }
//    }
//    throw new IllegalArgumentException("No two sum solution");

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> remainder = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (remainder.containsKey(nums[i])){
                return new int[] {remainder.get(nums[i]), i};
            }
            remainder.put(target - nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int n : nums){
            String s = String.valueOf(n);
            System.out.println(s.length());
                if(s.length() % 2 == 0)
                    count = count + 1;
        }
        return count;
    }

    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static void searchFile() {
        try {
            File dir = new File("C://test");

            File[] contents = dir.listFiles();

            for (File content : contents) {

                Scanner scanner = new Scanner(content);

                while (scanner.hasNextLine()) {
                    final String result = scanner.nextLine();
                    if (result.contains("test"))
                        System.out.println(result);
                }
                scanner.close();
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }


    }

    public static int goodSegment(List<Integer> badNumbers, int lower, int upper) {
        int longestRange = 0;
        List<Integer> sortedBadNumers = new ArrayList<>();
        for (Integer n : badNumbers ) {
            if (n <= upper && n >= lower)
                sortedBadNumers.add(n);
        }

        Collections.sort(sortedBadNumers);

        for (int i = 0; i < sortedBadNumers.size(); i++) {
            if (i == 0){
                longestRange = lower - sortedBadNumers.get(i);
            }
            else{
                if ((sortedBadNumers.get(i) - sortedBadNumers.get(i - 1)) > longestRange)
                    longestRange = (sortedBadNumers.get(i) - sortedBadNumers.get(i - 1)) + 1;
            }
        }

        if (upper - sortedBadNumers.get(sortedBadNumers.size() - 1) > longestRange)
            longestRange = upper - sortedBadNumers.get(sortedBadNumers.size() - 1);

        for (Integer n : sortedBadNumers)
            System.out.println(n);

        return longestRange;
    }

}

