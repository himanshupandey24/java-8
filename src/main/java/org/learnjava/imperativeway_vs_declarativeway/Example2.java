package org.learnjava.imperativeway_vs_declarativeway;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(55,55,1,2,2,3,4,5,78,97,98);

        //Remove the duplicates from the list.

        /**
         * Imperative Style
         */
        List<Integer> uniqueList = new ArrayList<>();
        for(Integer ele : integerList){
            if(!uniqueList.contains(ele)){
                uniqueList.add(ele);
            }
        }

        System.out.println("uniqueList: " +uniqueList);

        /**
         * Declarative Syle
         */

        List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());

        System.out.println("uniqueList1: " +uniqueList1);
    }
}
