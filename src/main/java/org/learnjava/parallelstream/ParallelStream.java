package org.learnjava.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStream {

    private static long checkPerformanceResult(Supplier<Integer> sum, int numberOfTimes){

        long start = System.currentTimeMillis();
        for(int i = 0 ; i < numberOfTimes; i++){
            sum.get();
        }

        long end = System.currentTimeMillis();

        return end-start;
    }

    private static int sequentialStreamSum(){
        int total = IntStream.rangeClosed(1,1000000)
                .sum();

        return total;
    }

    private static int parallelStreamSum(){
        int total = IntStream.rangeClosed(1,1000000)
                .parallel()
                .sum();

        return total;
    }


    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long sequentialDuration = checkPerformanceResult(ParallelStream::sequentialStreamSum, 100000);
        System.out.println("sequentialDuration in MilliSeconds: " + sequentialDuration);
        //System.out.println("sequentialDuration in MilliSecs : " + TimeUnit.NANOSECONDS.toMillis(sequentialDuration));

        long parallelDuration =checkPerformanceResult(ParallelStream::parallelStreamSum,100000);

        System.out.println("parallelDuration in MilliSeconds: " + parallelDuration);
        //System.out.println("parallelDuration in MilliSecs : " + TimeUnit.NANOSECONDS.toMillis(parallelDuration));

    }
}
