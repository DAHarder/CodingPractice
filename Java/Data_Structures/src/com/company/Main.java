package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.company.ArraysTesting.*;
import static com.company.RandomTesting.goodSegment;
import static com.company.RandomTesting.searchFile;

public class Main {

    public static void main(String[] args) throws Exception {

//        int[] nums1 = {5, 4, 2, 15};
//        ArrayList<Integer> list = IntStream.of(nums1)
//                .boxed()
//                .collect(Collectors.toCollection(ArrayList::new));
//
//        goodSegment(list, 1, 10);

        LearningVector vector = new LearningVector(5);
        vector.push(0);
        vector.push(1);
        vector.push(2);
        vector.push(3);
        vector.push(4);
        vector.push(4);
        vector.push(5);
        vector.push(6);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.at(i));
        }
        System.out.println("size: " + vector.size());
        System.out.println("deleted");
        vector.delete(6);

        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.at(i));
        }


        System.out.println("  ");
        System.out.println("size: " + vector.size());
        System.out.println("  ");
        System.out.println("Cap: " + vector.capacity());
        System.out.println(" ");
//        System.out.println(vector.isEmtpy());
    }
}
