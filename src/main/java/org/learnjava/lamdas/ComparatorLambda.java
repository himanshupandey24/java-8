package org.learnjava.lamdas;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        /**
         * Prior JAVA 8
         */
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                //0 if both are equal
                //1 if o1 > o2
                //-1 of o1 < o2
            }
        };

        System.out.println(comparator.compare(1,2));

        /**
         * In JAVA 8
         */

        Comparator<Integer> comparator1 = (a,b) -> a.compareTo(b);
        Comparator<Integer> comparator2 = Comparator.naturalOrder();
        Comparator<Integer> comparator3 = Integer::compareTo;

        System.out.println(comparator1.compare(1,2));
        System.out.println(comparator2.compare(3,1));
        System.out.println(comparator3.compare(3,1));


    }
}
