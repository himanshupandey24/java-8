package org.learnjava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Adam");
        names.add("Jim");
        names.add("Jenny");

        //Collection is eagerly constructed
        //Collections can be traversed “n” number of times.

        for(String name : names)
            System.out.println(name);

        for(String name : names)
            System.out.println(name);


        //Streams are lazily constructed
        //Elements in the Stream can be accessed only in sequence.
        //Streams are iterated only one
        //Cannot add or modify elements in the stream. It is a fixed data set
        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
        //Runtime exception: stream has already been operated upon or closed
        namesStream.forEach(System.out::println);
    }


}
